package com.dagather.fonme.redis.service;

import redis.clients.jedis.ShardedJedis;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public interface IRedisService {

    ShardedJedis getShardedJedis();

    boolean returnResource(ShardedJedis paramShardedJedis);

    boolean setObjectKeyToRedis(String paramString, Serializable paramSerializable);

    boolean setObjectKeyToRedis(String paramString, Serializable paramSerializable, int paramInt);

    <T> T getObjectKeyToRedis(String paramString, Class<T> paramClass);

    boolean setStringKeyToRedis(String paramString1, String paramString2);

    boolean setStringKeyToRedis(String paramString1, String paramString2, int paramInt);

    String getStringKeyToRedis(String paramString);

    boolean keyExists(String paramString);

    Long expire(String paramString, int paramInt);

    Long incr(String paramString);

    Long incr(String paramString, int paramInt);

    Long dinc(String paramString);

    Long dinc(String paramString, int paramInt);

    boolean delKey(String paramString);

    Long rpush(String key, String str, int seconds);

    Long llen(String key);

    List<String> lrange(String key, long start, long end);

    String hget(String key, String field);

    List<String> hmget(String key, String... fields);

    Map<String, String> hgetall(String key);

    Long hset(String key, String field, String value);

    String hmset(String key, Map<String, String> hash);
}
