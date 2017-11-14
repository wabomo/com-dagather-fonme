package com.dagather.fonme.wallet.dao;

import com.dagather.fonme.wallet.model.UserWallet;
import com.dagather.fonme.wallet.model.UserWalletExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public abstract interface UserWalletMapper {
	public abstract int countByExample(UserWalletExample paramUserWalletExample);

	public abstract int deleteByExample(UserWalletExample paramUserWalletExample);

	public abstract int deleteByPrimaryKey(Long paramLong);

	public abstract int insert(UserWallet paramUserWallet);

	public abstract int insertSelective(UserWallet paramUserWallet);

	public abstract List<UserWallet> selectByExampleWithRowbounds(UserWalletExample paramUserWalletExample,
			RowBounds paramRowBounds);

	public abstract List<UserWallet> selectByExample(UserWalletExample paramUserWalletExample);

	public abstract UserWallet selectByPrimaryKey(Long paramLong);

	public abstract int updateByExampleSelective(@Param("record") UserWallet paramUserWallet,
			@Param("example") UserWalletExample paramUserWalletExample);

	public abstract int updateByExample(@Param("record") UserWallet paramUserWallet,
			@Param("example") UserWalletExample paramUserWalletExample);

	public abstract int updateByPrimaryKeySelective(UserWallet paramUserWallet);

	public abstract int updateByPrimaryKey(UserWallet paramUserWallet);

    int updateBalance(@Param("uwid") Long uwid, @Param("balance") BigDecimal balance, @Param("updateDate") java.util.Date updateDate);
}
