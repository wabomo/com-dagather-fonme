package com.dagather.fonme.exchange.service.impl;

import com.dagather.fonme.exchange.dao.ExCurrencyInfoMapper;
import com.dagather.fonme.exchange.dao.ExCurrencyRateMapper;
import com.dagather.fonme.exchange.dao.ExExpensesInfoMapper;
import com.dagather.fonme.exchange.model.*;
import com.dagather.fonme.exchange.service.IExchangeService;
import com.dagather.fonme.redis.service.IRedisService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ExchangeServiceImpl implements IExchangeService {
    @Resource
    private IRedisService redisServiceImpl;
    @Resource
    private ExExpensesInfoMapper exExpensesInfoMapper;
    @Resource
    private ExCurrencyInfoMapper exCurrencyInfoMapper;
    @Resource
    private ExCurrencyRateMapper exCurrencyRateMapper;
    private Logger logger = LoggerFactory.getLogger(getClass());

    public ExCurrencyInfo selectExCurrencyInfoById(Long eciid) {
        if (null == eciid) {
            return null;
        }
        return this.exCurrencyInfoMapper.selectByPrimaryKey(eciid);
    }

    @Override
    public List<ExExpensesInfo> selectExExpensesInfoBy(Integer pageNo, Integer pageSize) {
        ExExpensesInfoExample example = new ExExpensesInfoExample();
        example.createCriteria().andFlagEnableEqualTo(1);
        example.setLimit(pageSize);
        example.setOffset((pageNo - 1) * pageSize);
        return this.exExpensesInfoMapper.selectByExample(example);
    }

    @Override
    public List<ExCurrencyInfo> selectExCurrencyInfoBy(Integer pageNo, Integer pageSize) {
        ExCurrencyInfoExample example = new ExCurrencyInfoExample();
        example.createCriteria().andFlagEnableEqualTo(1);
        example.setLimit(pageSize);
        example.setOffset((pageNo - 1) * pageSize);
        return this.exCurrencyInfoMapper.selectByExample(example);
    }


    @Override
    public Map<String, String> selectCacheMapPhoneCodeToRate(Boolean bolForceFreshCache) {
        Map<String, String> map = null;
        String logStr = "<|>获取号段资费Map<|>";
        try {
            String mkey = "mapExpensesInfo";
            if (bolForceFreshCache == null || bolForceFreshCache == false) {
                map = redisServiceImpl.hgetall(mkey);
            }
            if (null == map || map.size() == 0) {
                // 查询DB
                List<ExExpensesInfo> exInfoList = this.selectExExpensesInfoBy(1, Integer.MAX_VALUE);
                if (null == exInfoList || exInfoList.size() <= 0) {
                    logger.warn(logStr + "DB无对应数据记录");
                    return null;
                }
                if (null == map) {
                    map = new HashMap<String, String>(128 * 1024);
                }
                for (ExExpensesInfo info : exInfoList) {
                    map.put(info.getPhoneCode(), info.getRateCny().toString());
                    map.put("cost"+info.getPhoneCode(), info.getRateCost().toString());
                }
                redisServiceImpl.hmset(mkey, map);
            }
        } catch (Exception e) {
            logger.error(logStr + "出现异常:" + e.getMessage(), e);
        }
        return map;
    }

    @Override
    public Map<String, String> selectCacheMapCurrencyInfoIdToCode(Boolean bolForceFreshCache) {
        Map<String, String> map = null;
        String logStr = "<|>获取货币ID对code的Map<|>";
        try {
            String mkey = "mapCurrencyInfo";
            if (bolForceFreshCache == null || bolForceFreshCache == false) {
                map = redisServiceImpl.hgetall(mkey);
            }
            if (null == map || map.size() == 0) {
                // 查询DB
                List<ExCurrencyInfo> exInfoList = this.selectExCurrencyInfoBy(1, Integer.MAX_VALUE);
                if (null == exInfoList || exInfoList.size() <= 0) {
                    logger.warn(logStr + "DB无对应数据记录");
                    return null;
                }
                if (null == map) {
                    map = new HashMap<String, String>();
                }
                for (ExCurrencyInfo info : exInfoList) {
                    map.put(info.getEciid().toString(), info.getCurrencyCode());
                }
                redisServiceImpl.hmset(mkey, map);
            }
        } catch (Exception e) {
            logger.error(logStr + "出现异常:" + e.getMessage(), e);
        }
        return map;
    }

    public ExCurrencyRate selectOneExCurrencyRateBy(String ymd, String exFromCurrencyCode, String exToCurrencyCode) {
        ExCurrencyRateExample example = new ExCurrencyRateExample();
        ExCurrencyRateExample.Criteria c = example.createCriteria();
        c.andFlagEnableEqualTo(1);
        c.andYmdEqualTo(ymd);
        c.andExFrCurrencyCodeEqualTo(exFromCurrencyCode);
        c.andExToCurrencyCodeEqualTo(exToCurrencyCode);
        List<ExCurrencyRate> crList = this.exCurrencyRateMapper.selectByExample(example);
        if (crList != null && crList.size() > 0) {
            return crList.get(0);
        }
        return null;
    }

    public boolean updateOrInsertExCurrencyRate(ExCurrencyRate exCurrencyRate) throws SQLException {
        ExCurrencyRateExample example = new ExCurrencyRateExample();
        ExCurrencyRateExample.Criteria c = example.createCriteria();
        c.andYmdEqualTo(exCurrencyRate.getYmd());
        c.andExFrCurrencyCodeEqualTo(exCurrencyRate.getExFrCurrencyCode());
        c.andExToCurrencyCodeEqualTo(exCurrencyRate.getExToCurrencyCode());
        List<ExCurrencyRate> crList = this.exCurrencyRateMapper.selectByExample(example);
        int cnt = 0;
        if (null == crList || crList.size() <= 0) {
            // 插入
            exCurrencyRate.setEcrid(null);
            cnt = this.exCurrencyRateMapper.insert(exCurrencyRate);
        } else {
            // 更新
            Long ecrid = crList.get(0).getEcrid();
            exCurrencyRate.setEcrid(ecrid);
            cnt = this.exCurrencyRateMapper.updateByPrimaryKeySelective(exCurrencyRate);
        }
        return cnt > 0;
    }
}
