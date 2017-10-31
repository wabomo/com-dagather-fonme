package com.dagather.fonme.wallet.service.impl;

import com.dagather.fonme.config.Configuration;
import com.dagather.fonme.wallet.dao.UserWalletMapper;
import com.dagather.fonme.wallet.model.UserWallet;
import com.dagather.fonme.wallet.model.UserWalletExample;
import com.dagather.fonme.wallet.model.UserWalletExample.Criteria;
import com.dagather.fonme.wallet.service.IWalletService;
import java.sql.SQLException;
import java.util.List;
import javax.annotation.Resource;
import org.apache.commons.lang.ObjectUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

@Service
public class WalletServiceImpl implements IWalletService {
	@Resource(name = "userWalletMapper")
	private UserWalletMapper userWalletMapper = null;

	public UserWallet selectUserWallet(Long uiid, Integer flagEnable) {
		return selectUserWallet(uiid, Configuration.FLAG_ENABLE, flagEnable);
	}

	public UserWallet selectUserWallet(Long uiid, Integer currencyType, Integer flagEnable) {
		UserWalletExample userWalletExample = new UserWalletExample();
		UserWalletExample.Criteria c = userWalletExample.createCriteria();
		if (StringUtils.isNotBlank(ObjectUtils.toString(uiid))) {
			c.andUiidEqualTo(uiid);
			if (StringUtils.isNotBlank(ObjectUtils.toString(currencyType))) {
				c.andCurrencyTypeEqualTo(currencyType);
			}
			if (StringUtils.isNotBlank(ObjectUtils.toString(flagEnable))) {
				c.andFlagEnableEqualTo(flagEnable);
			}
			List<UserWallet> userWalletList = this.userWalletMapper.selectByExample(userWalletExample);

			return (StringUtils.isNotBlank(ObjectUtils.toString(userWalletList))) && (userWalletList.size() > 0)
					? (UserWallet) userWalletList.get(0)
					: null;
		}
		return null;
	}

	public boolean insertUserWallet(UserWallet userWallet) throws SQLException {
		int rows = this.userWalletMapper.insert(userWallet);
		return rows > 0;
	}

	public boolean modifyUserWalletByPrimaryKeySelective(UserWallet userWallet) throws SQLException {
		int rows = this.userWalletMapper.updateByPrimaryKeySelective(userWallet);
		return rows > 0;
	}
}
