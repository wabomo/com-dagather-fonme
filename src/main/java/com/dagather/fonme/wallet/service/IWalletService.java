package com.dagather.fonme.wallet.service;

import com.dagather.fonme.wallet.model.UserWallet;
import java.sql.SQLException;

public abstract interface IWalletService {
	public abstract UserWallet selectUserWallet(Long paramLong, Integer paramInteger);

	public abstract UserWallet selectUserWallet(Long paramLong, Integer paramInteger1, Integer paramInteger2);

	public abstract boolean insertUserWallet(UserWallet paramUserWallet) throws SQLException;

	public abstract boolean modifyUserWalletByPrimaryKeySelective(UserWallet paramUserWallet) throws SQLException;
}
