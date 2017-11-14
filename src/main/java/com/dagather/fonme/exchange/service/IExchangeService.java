package com.dagather.fonme.exchange.service;

import com.dagather.fonme.dial.model.DialRecord;
import com.dagather.fonme.exchange.model.ExCurrencyInfo;
import com.dagather.fonme.exchange.model.ExCurrencyRate;
import com.dagather.fonme.exchange.model.ExExpensesInfo;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface IExchangeService {
    ExCurrencyInfo selectExCurrencyInfoById(Long eciid);

    List<ExExpensesInfo> selectExExpensesInfoBy(Integer pageNo, Integer pageSize);

    List<ExCurrencyInfo> selectExCurrencyInfoBy(Integer pageNo, Integer pageSize);

    /**
     * 获取号段资费Map
     *
     * @param bolForceFreshCache 是否强制刷新缓存
     * @return
     */
    Map<String, String> selectCacheMapPhoneCodeToRate(Boolean bolForceFreshCache);

    /**
     * 获取货币ID对code的Map
     *
     * @param bolForceFreshCache 是否强制刷新缓存
     * @return
     */
    Map<String, String> selectCacheMapCurrencyInfoIdToCode(Boolean bolForceFreshCache);

    /**
     * 查询货币兑换汇率记录
     * @param ymd
     * @param exFromCurrencyCode
     * @param exToCurrencyCode
     * @return
     */
    ExCurrencyRate selectOneExCurrencyRateBy(String ymd, String exFromCurrencyCode, String exToCurrencyCode);

    /**
     * 更新或插入货币兑换汇率记录
     * @param exCurrencyRate
     * @return
     * @throws SQLException
     */
    boolean updateOrInsertExCurrencyRate(ExCurrencyRate exCurrencyRate) throws SQLException;
}
