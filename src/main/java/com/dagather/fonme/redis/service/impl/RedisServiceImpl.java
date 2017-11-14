package com.dagather.fonme.redis.service.impl;

import com.dagather.fonme.config.Configuration;
import com.dagather.fonme.redis.service.IRedisService;
import com.dagather.fonme.util.SerializableUtils;
import org.apache.commons.lang.ObjectUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import redis.clients.jedis.ShardedJedis;
import redis.clients.jedis.ShardedJedisPool;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Service
public class RedisServiceImpl implements IRedisService {
    @Resource(name = "shardedJedisPool")
    private ShardedJedisPool shardedJedisPool = null;
    private Logger logger = LoggerFactory.getLogger(RedisServiceImpl.class);

    public RedisServiceImpl() {
        super();
    }

    @Override
    public ShardedJedis getShardedJedis() {
        try {
            ShardedJedis jedis = shardedJedisPool.getResource();
            // shardedJedisPool.returnResource(jedis);
            logger.info("<|>数据缓存工具类<|>获得redis链接<|>getShardedJedis()<|><|>成功<|><|>备用参数<|>");
            return jedis;
        } catch (Exception e) {
            logger.error("<|>数据缓存工具类<|>获得redis链接<|>getShardedJedis()<|><|>失败<|>异常<|>备用参数<|>", e);
            return null;
        }
    }

    @Override
    public boolean returnResource(ShardedJedis shardedJedis) {
        try {
            if (StringUtils.isNotBlank(ObjectUtils.toString(shardedJedis))) {
                shardedJedisPool.returnResource(shardedJedis);
                logger.info("<|>数据缓存工具类<|>释放redis链接<|>returnResource()<|><|>成功<|><|>备用参数<|>");
                return true;
            } else {
                logger.info("<|>数据缓存工具类<|>释放redis链接<|>returnResource()<|><|>失败<|><|>备用参数<|>");
                return false;
            }
        } catch (Exception e) {
            logger.error("<|>数据缓存工具类<|>释放redis链接<|>returnResource()<|><|>失败<|>异常<|>备用参数<|>", e);
            return false;
        }
    }

    @Override
    public boolean setObjectKeyToRedis(String key, Serializable object) {
        return setObjectKeyToRedis(key, object, Configuration.REDIS_TIME);
    }

    @Override
    public boolean setObjectKeyToRedis(String key, Serializable object, int seconds) {
        byte[] bytes = SerializableUtils.serializeObj(object);
        ShardedJedis jedis = this.getShardedJedis();
        String result = "";
        try {
            if (jedis != null) {
                result = jedis.setex(key.getBytes(), seconds, bytes);
                this.returnResource(jedis);
            }
            logger.info("<|>数据缓存工具类<|>设置对象存放<|>setObjectKeyToRedis()<|>{}/{}/{}<|>{}<|><|>备用参数<|>", key,
                    (StringUtils.isNotBlank(ObjectUtils.toString(object)) ? true : false), seconds, result);
            return "OK".equals(result) ? true : false;
        } catch (Exception e) {
            // 当遇到set入redis不成功时(socket问题)，循环set5次。
            int count = 5;
            while (!"OK".equals(result) || count > 0) {
                jedis = this.getShardedJedis();
                if (jedis != null) {
                    // result = jedis.set(key.getBytes(), bytes);
                    result = jedis.setex(key.getBytes(), seconds, bytes);
                    this.returnResource(jedis);
                }
                count--;
            }
            logger.error("<|>数据缓存工具类<|>设置对象存放<|>setObjectKeyToRedis()<|>" + key + "/"
                    + (StringUtils.isNotBlank(ObjectUtils.toString(object)) ? true : false) + "<|>" + result
                    + "<|><|><|>备用参数<|>", e);
            return "OK".equals(result) ? true : false;
        } finally {

        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public <T> T getObjectKeyToRedis(String key, Class<T> objClass) {
        byte[] bytes = null;
        ShardedJedis jedis = this.getShardedJedis();
        try {
            if (jedis != null) {
                bytes = jedis.get(key.getBytes());
                this.returnResource(jedis);
            }
            Object obj = null;
            if (bytes != null && bytes.length > 0) {
                obj = SerializableUtils.reSerializeObj(bytes, objClass);
            }
            logger.info("<|>2013011813<|>数据缓存工具类<|>getObjectKeyToRedis按KEY值获得redis缓存中对象<|>" + key + "/" + objClass
                    + "<|>" + (StringUtils.isNotBlank(ObjectUtils.toString(obj)) ? true : false) + "<|><|>备用参数<|>");
            return (T) obj;
        } catch (Exception e) {
            logger.error("<|>2013011813<|>数据缓存工具类<|>getObjectKeyToRedis按KEY值获得redis缓存中对象<|>" + key + "/" + objClass
                    + "<|>null<|><|>备用参数<|>", e);
            return null;
        }
    }

    @Override
    public boolean setStringKeyToRedis(String key, String value) {
        return setStringKeyToRedis(key, value, Configuration.REDIS_TIME);
    }

    @Override
    public boolean setStringKeyToRedis(String key, String value, int seconds) {
        try {
            ShardedJedis jedis = this.getShardedJedis();
            String code = jedis.set(key, value);
            Long c = jedis.expire(key, seconds);
            boolean flag = (StringUtils.isNotBlank(code) && "OK".equals(code.trim())) ? true : false;
            logger.info("<|>2013011802<|>数据缓存工具类<|>setStringKeyToRedis数据放入缓存<|>" + key + "/" + value + "/" + seconds
                    + "<|>" + flag + "<|>" + c + "<|>备用参数<|>");
            this.returnResource(jedis);
            return flag;
        } catch (Exception e) {
            logger.error("<|>2013011802<|>数据缓存工具类<|>setStringKeyToRedis数据放入缓存<|>" + key + "/" + value + "/" + seconds
                    + "<|>false<|>" + e.getMessage() + "<|>备用参数<|>", e);
            return false;
        }
    }

    @Override
    public String getStringKeyToRedis(String key) {
        try {
            ShardedJedis jedis = this.getShardedJedis();
            String code = jedis.get(key);
            logger.info("<|>2013011803<|>数据缓存工具类<|>getStringKeyToRedis的数据<|>" + key + "<|>" + code + "<|>备用参数<|>");
            this.returnResource(jedis);
            return code;
        } catch (Exception e) {
            logger.error("<|>2013011803<|>数据缓存工具类<|>getStringKeyToRedis的数据<|>" + key + "<|>异常<|>" + e.getMessage()
                    + "<|>备用参数<|>", e);
            return null;
        }
    }

    @Override
    public boolean keyExists(String key) {
        try {
            ShardedJedis jedis = this.getShardedJedis();
            boolean code = jedis.exists(key);
            logger.info("<|>2013011805<|>数据缓存工具类<|>keyExists key值是否存在<|>" + key + "<|>" + code + "<|><|>备用参数<|>");
            this.returnResource(jedis);
            return code;
        } catch (Exception e) {
            logger.error("<|>2013011805<|>数据缓存工具类<|>keyExists key值是否存在<|>" + key + "<|>false<|>" + e.getMessage()
                    + "<|>备用参数<|>", e);
            return false;
        }
    }

    @Override
    public Long expire(String key, int seconds) {
        Long code = null;
        try {
            ShardedJedis jedis = this.getShardedJedis();
            code = jedis.expire(key, seconds);
            logger.info("<|>2013011806<|>数据缓存工具类<|>expire 设置KEY的过期时间<|>" + key + "/" + seconds + "<|><|>" + code
                    + "<|>备用参数<|>");
            this.returnResource(jedis);
            return code;
        } catch (Exception e) {
            logger.error("<|>2013011806<|>数据缓存工具类<|>expire 设置KEY的过期时间<|>" + key + "/" + seconds + "<|><|>"
                    + e.getMessage() + "<|>备用参数<|>", e);
            return code;
        }
    }

    @Override
    public Long incr(String key) {
        return incr(key, Configuration.REDIS_TIME);
    }

    @Override
    public Long incr(String key, int seconds) {
        Long code = null;
        try {
            ShardedJedis jedis = this.getShardedJedis();
            code = jedis.incr(key);
            Long c = this.expire(key, seconds);
            logger.info("<|>2013011807<|>数据缓存工具类<|>incr自增<|>" + key + "/" + seconds + "<|>" + code + "<|>" + c
                    + "<|><|>备用参数<|>");
            this.returnResource(jedis);
            return code;
        } catch (Exception e) {
            logger.error("<|>2013011807<|>数据缓存工具类<|>incr自增<|>" + key + "/" + seconds + "<|>null<|>" + e.getMessage()
                    + "<|><|>备用参数<|>", e);
            return code;
        }
    }

    @Override
    public Long dinc(String key) {
        return dinc(key, Configuration.REDIS_TIME);
    }

    @Override
    public Long dinc(String key, int seconds) {
        Long code = null;
        try {
            ShardedJedis jedis = this.getShardedJedis();
            code = jedis.decr(key);
            Long c = this.expire(key, seconds);
            logger.info("<|>2013011808<|>数据缓存工具类<|>dinc自减<|>" + key + "/" + seconds + "<|>" + code + "<|>" + c
                    + "<|><|>备用参数<|>");
            this.returnResource(jedis);
            return code;
        } catch (Exception e) {
            logger.error("<|>2013011808<|>数据缓存工具类<|>dinc自减<|>" + key + "/" + seconds + "<|>null<|>" + e.getMessage()
                    + "<|><|>备用参数<|>", e);
            return code;
        }
    }

    @Override
    public boolean delKey(String key) {
        try {
            ShardedJedis jedis = this.getShardedJedis();
            Long c = jedis.del(key);
            logger.info("<|>2013011809<|>数据缓存工具类<|>delKey自减<|>" + key + "/" + "<|>" + (c == 1 ? true : false)
                    + "<|><|>备用参数<|>");
            this.returnResource(jedis);
            return c == 1 ? true : false;
        } catch (Exception e) {
            logger.error("<|>2013011809<|>数据缓存工具类<|>delKey自减<|>" + key + "/" + "<|>false<|><|>备用参数<|>", e);
            return false;
        }
    }


    /**
     * 通过key向list尾部添加字符串
     *
     * @param key
     * @param str
     * @return 返回list的value个数
     */
    @Override
    public Long rpush(String key, String str, int seconds) {
        ShardedJedis jedis = null;
        try {
            jedis = this.getShardedJedis();
            Long count = jedis.rpush(key, str);
            if (count > 0) {
                Long c = this.expire(key, seconds);
            }
            return count;
        } catch (Exception e) {
            logger.error("<|>数据缓存工具类<|>rpush通过key向list尾部添加字符串<|>" + key + "/" + str + "/" + seconds + "<|>false<|><|>备用参数<|>", e);
            return null;
        } finally {
            this.returnResource(jedis);
        }
    }


    /**
     * 通过key返回list的长度
     *
     * @param key
     * @return
     */
    @Override
    public Long llen(String key) {
        ShardedJedis jedis = null;
        try {
            jedis = this.getShardedJedis();
            Long res = jedis.llen(key);
            return res;
        } catch (Exception e) {
            logger.error("<|>数据缓存工具类<|>llen通过key返回list的长度<|>" + key + "<|>false<|><|>备用参数<|>", e);
            return null;
        } finally {
            this.returnResource(jedis);
        }
    }

    /**
     * 通过key获取list指定下标位置的value
     * 如果start 为 0 end 为 -1 则返回全部的list中的value
     *
     * @param key
     * @param start
     * @param end
     * @return
     */
    @Override
    public List<String> lrange(String key, long start, long end) {
        ShardedJedis jedis = null;
        try {
            jedis = this.getShardedJedis();
            List<String> res = jedis.lrange(key, start, end);
            return res;
        } catch (Exception e) {
            logger.error("<|>数据缓存工具类<|>lrange通过key获取list指定下标位置的value<|>" + key + "/" + start + "/" + end + "<|>false<|><|>备用参数<|>", e);
            return null;
        } finally {
            this.returnResource(jedis);
        }
    }


    /**
     * 通过key 和 field 获取指定的 value
     *
     * @param key
     * @param field
     * @return 没有返回null
     */
    @Override
    public String hget(String key, String field) {
        ShardedJedis jedis = null;
        try {
            String res = jedis.hget(key, field);
            return res;
        } catch (Exception e) {
            logger.error("<|>数据缓存工具类<|>hget通过key和field获取指定的value<|>" + key + "/" + field + "<|>false<|><|>备用参数<|>", e);
            return null;
        } finally {
            this.returnResource(jedis);
        }
    }

    /**
     * 通过key 和 fields 获取指定的value 如果没有对应的value则返回null
     *
     * @param key
     * @param fields 可以使 一个String 也可以是 String数组
     * @return
     */
    @Override
    public List<String> hmget(String key, String... fields) {
        ShardedJedis jedis = null;
        try {
            jedis = this.getShardedJedis();
            List<String> values = jedis.hmget(key, fields);
            return values;
        } catch (Exception e) {
            logger.error("<|>数据缓存工具类<|>hmget通过key和fields获取指定的value<|>" + key + "/" + Arrays.toString(fields) + "<|>false<|><|>备用参数<|>", e);
            return null;
        } finally {
            this.returnResource(jedis);
        }
    }

    /**
     * 通过key获取所有的field和value
     *
     * @param key
     * @return
     */
    @Override
    public Map<String, String> hgetall(String key) {
        ShardedJedis jedis = null;
        try {
            jedis = this.getShardedJedis();
            Map<String, String> res = jedis.hgetAll(key);
            return res;
        } catch (Exception e) {
            logger.error("<|>数据缓存工具类<|>hgetall通过key获取所有的field和value<|>" + key + "<|>false<|><|>备用参数<|>", e);
            return null;
        } finally {
            this.returnResource(jedis);
        }

    }

    /**
     * 通过key给field设置指定的值,如果key不存在,则先创建
     *
     * @param key
     * @param field 字段
     * @param value
     * @return 如果存在返回0 异常返回null
     */
    @Override
    public Long hset(String key, String field, String value) {
        ShardedJedis jedis = null;
        try {
            jedis = this.getShardedJedis();
            Long res = jedis.hset(key, field, value);
            return res;
        } catch (Exception e) {
            logger.error("<|>数据缓存工具类<|>hset通过key给field设置指定的值,如果key不存在,则先创建<|>" + key + "/" + field + "/" + value + "<|>false<|><|>备用参数<|>", e);
            return null;
        } finally {
            this.returnResource(jedis);
        }
    }

    /**
     * 通过key同时设置 hash的多个field
     *
     * @param key
     * @param hash
     * @return 返回OK 异常返回null
     */
    @Override
    public String hmset(String key, Map<String, String> hash) {
        ShardedJedis jedis = null;
        try {
            jedis = this.getShardedJedis();
            String res = jedis.hmset(key, hash);
            return res;
        } catch (Exception e) {
            logger.error("<|>数据缓存工具类<|>hmset通过key同时设置hash的多个field<|>" + key + "/" + hash + "<|>false<|><|>备用参数<|>", e);
            return null;
        } finally {
            this.returnResource(jedis);
        }
    }

}
