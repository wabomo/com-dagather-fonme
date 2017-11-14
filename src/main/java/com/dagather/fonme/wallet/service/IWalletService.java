package com.dagather.fonme.wallet.service;

import com.dagather.fonme.dial.pojo.CallInfoCode;
import com.dagather.fonme.wallet.model.UserWallet;

import java.math.BigDecimal;
import java.sql.SQLException;

public abstract interface IWalletService {
    public abstract UserWallet selectUserWallet(Long paramLong, Integer paramInteger);

    public abstract UserWallet selectUserWallet(Long paramLong, Integer paramInteger1, Integer paramInteger2);

    public abstract boolean insertUserWallet(UserWallet paramUserWallet) throws SQLException;

    public abstract boolean modifyUserWalletByPrimaryKeySelective(UserWallet paramUserWallet) throws SQLException;

    UserWallet selectUserWalletById(Long uiid);

    /**
     * 创建钱包流水记录，并更新钱包余额
     * @param userWallet
     * @param fee
     * @param feeCost
     * @param callInfo
     * @return
     * @throws SQLException
     */
    boolean updateWalletBalanceAndAddBillCallDetails(UserWallet userWallet, BigDecimal fee,BigDecimal feeCost, CallInfoCode callInfo) throws SQLException;
}
