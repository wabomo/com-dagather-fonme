package com.dagather.fonme.dial.handler.impl;

import com.dagather.fonme.config.Configuration;
import com.dagather.fonme.dial.handler.Handler;
import com.dagather.fonme.dial.model.UserInfo;
import com.dagather.fonme.dial.pojo.RevertCode;
import com.dagather.fonme.dial.service.IDialService;
import com.dagather.fonme.wallet.model.UserWallet;
import com.dagather.fonme.wallet.service.IWalletService;
import java.util.Map;
import javax.annotation.Resource;
import org.apache.commons.lang.ObjectUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CheckBalanceDialHandlerImpl extends Handler {
	@Resource(name = "dialServiceImpl")
	private IDialService iDialService = null;
	@Resource(name = "walletServiceImpl")
	private IWalletService iWalletService = null;
	private Logger logger = LoggerFactory.getLogger(getClass());

	public Object execute(Long wcaid, String openId, String called, Map<String, Object> paramMap) {
		UserInfo userInfo = this.iDialService.selectUserInfoObject(openId, wcaid, Configuration.FLAG_ENABLE);
		if (StringUtils.isNotBlank(ObjectUtils.toString(userInfo))) {
			paramMap.put("userInfo", userInfo);
			UserWallet userWallet = this.iWalletService.selectUserWallet(userInfo.getUiid(), Configuration.FLAG_ENABLE);
			if ((!StringUtils.isNotBlank(ObjectUtils.toString(userWallet)))
					|| (userWallet.getBalance().longValue() <= 0L)) {
				this.logger.info(
						"<|>CheckBalanceDialHandlerImpl<|>execute<|>wcaid:{}/openId:{}/called:{}/paramMap:{}<|>{}<|>{}<|>",
						new Object[] { wcaid, openId, called, paramMap, "钱包没钱", "钱包余额不足，请充值!" });

				return new RevertCode(Integer.valueOf(4), "钱包余额不足，请充值!");
			}
			return getSuccessor().execute(wcaid, openId, called, paramMap);
		}
		this.logger.info(
				"<|>CheckBalanceDialHandlerImpl<|>execute<|>wcaid:{}/openId:{}/called:{}/paramMap:{}<|>{}<|>{}<|>",
				new Object[] { wcaid, openId, called, paramMap, "异常", "参数不正确，稍后再试" });

		return new RevertCode(Integer.valueOf(2), "参数不正确，稍后再试!");
	}

	public void setSuccessor(Handler successor) {
		super.setSuccessor(successor);
	}
}
