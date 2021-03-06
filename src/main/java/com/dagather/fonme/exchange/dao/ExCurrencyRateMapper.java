package com.dagather.fonme.exchange.dao;

import com.dagather.fonme.exchange.model.ExCurrencyRate;
import com.dagather.fonme.exchange.model.ExCurrencyRateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExCurrencyRateMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fm_ex_currency_rate
     *
     * @mbggenerated
     */
    int countByExample(ExCurrencyRateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fm_ex_currency_rate
     *
     * @mbggenerated
     */
    int deleteByExample(ExCurrencyRateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fm_ex_currency_rate
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long ecrid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fm_ex_currency_rate
     *
     * @mbggenerated
     */
    int insert(ExCurrencyRate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fm_ex_currency_rate
     *
     * @mbggenerated
     */
    int insertSelective(ExCurrencyRate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fm_ex_currency_rate
     *
     * @mbggenerated
     */
    List<ExCurrencyRate> selectByExample(ExCurrencyRateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fm_ex_currency_rate
     *
     * @mbggenerated
     */
    ExCurrencyRate selectByPrimaryKey(Long ecrid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fm_ex_currency_rate
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") ExCurrencyRate record, @Param("example") ExCurrencyRateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fm_ex_currency_rate
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") ExCurrencyRate record, @Param("example") ExCurrencyRateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fm_ex_currency_rate
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ExCurrencyRate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fm_ex_currency_rate
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ExCurrencyRate record);
}