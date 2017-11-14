package com.dagather.fonme.wallet.dao;

import com.dagather.fonme.wallet.model.UserWalletDetails;
import com.dagather.fonme.wallet.model.UserWalletDetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserWalletDetailsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fm_user_wallet_details
     *
     * @mbggenerated
     */
    int countByExample(UserWalletDetailsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fm_user_wallet_details
     *
     * @mbggenerated
     */
    int deleteByExample(UserWalletDetailsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fm_user_wallet_details
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long uwdid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fm_user_wallet_details
     *
     * @mbggenerated
     */
    int insert(UserWalletDetails record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fm_user_wallet_details
     *
     * @mbggenerated
     */
    int insertSelective(UserWalletDetails record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fm_user_wallet_details
     *
     * @mbggenerated
     */
    List<UserWalletDetails> selectByExample(UserWalletDetailsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fm_user_wallet_details
     *
     * @mbggenerated
     */
    UserWalletDetails selectByPrimaryKey(Long uwdid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fm_user_wallet_details
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") UserWalletDetails record, @Param("example") UserWalletDetailsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fm_user_wallet_details
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") UserWalletDetails record, @Param("example") UserWalletDetailsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fm_user_wallet_details
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(UserWalletDetails record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fm_user_wallet_details
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(UserWalletDetails record);
}