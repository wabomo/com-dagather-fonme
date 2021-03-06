package com.dagather.fonme.wallet.dao;

import com.dagather.fonme.wallet.model.UserBillCall;
import com.dagather.fonme.wallet.model.UserBillCallExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserBillCallMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fm_user_bill_call
     *
     * @mbggenerated
     */
    int countByExample(UserBillCallExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fm_user_bill_call
     *
     * @mbggenerated
     */
    int deleteByExample(UserBillCallExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fm_user_bill_call
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long ubcid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fm_user_bill_call
     *
     * @mbggenerated
     */
    int insert(UserBillCall record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fm_user_bill_call
     *
     * @mbggenerated
     */
    int insertSelective(UserBillCall record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fm_user_bill_call
     *
     * @mbggenerated
     */
    List<UserBillCall> selectByExample(UserBillCallExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fm_user_bill_call
     *
     * @mbggenerated
     */
    UserBillCall selectByPrimaryKey(Long ubcid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fm_user_bill_call
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") UserBillCall record, @Param("example") UserBillCallExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fm_user_bill_call
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") UserBillCall record, @Param("example") UserBillCallExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fm_user_bill_call
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(UserBillCall record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fm_user_bill_call
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(UserBillCall record);
}