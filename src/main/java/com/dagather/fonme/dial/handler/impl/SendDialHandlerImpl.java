package com.dagather.fonme.dial.handler.impl;

import com.dagather.fonme.dial.handler.Handler;
import com.dagather.fonme.dial.model.UserInfo;
import com.dagather.fonme.dial.pojo.DialCode;
import com.dagather.fonme.dial.pojo.RevertCode;
import com.dagather.fonme.dial.service.IDialService;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.Map;
import javax.annotation.Resource;
import org.apache.commons.lang.ObjectUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SendDialHandlerImpl extends Handler {
	@Resource(name = "dialServiceImpl")
	private IDialService iDialService = null;
	private Logger logger = LoggerFactory.getLogger(getClass());

	public Object execute(Long wcaid, String openId, String called, Map<String, Object> paramMap) {
		Gson gson = new Gson();
		UserInfo userInfo = (UserInfo) paramMap.get("userInfo");
		if (StringUtils.isNotBlank(ObjectUtils.toString(userInfo))) {
			String retCode = this.iDialService.sendDial(userInfo.getPhone(), called);
			RevertCode<DialCode> revertCode = (RevertCode) gson.fromJson(retCode, new TypeToken() {
			}.getType());
			paramMap.put("revertCode", revertCode);
			this.logger.info("<|>SendDialHandlerImpl<|>execute<|>wcaid:{}/openId:{}/called:{}/paramMap:{}<|>{}<|>{}<|>",
					new Object[] { wcaid, openId, called, paramMap, revertCode.getCode(), revertCode.getMsg() });
			return getSuccessor().execute(wcaid, openId, called, paramMap);
		}
		this.logger.info("<|>SendDialHandlerImpl<|>execute<|>wcaid:{}/openId:{}/called:{}/paramMap:{}<|>{}<|>{}<|>",
				new Object[] { wcaid, openId, called, paramMap, "异常", "参数不正确，稍后再试" });

		return new RevertCode(Integer.valueOf(2), "参数不正确，稍后再试!");
	}

	public void setSuccessor(Handler successor) {
		super.setSuccessor(successor);
	}
}
