package com.dagather.fonme.dial.handler.impl;

import com.dagather.fonme.dial.handler.Handler;
import com.dagather.fonme.dial.model.DialRecord;
import com.dagather.fonme.dial.model.UserInfo;
import com.dagather.fonme.dial.pojo.DialCode;
import com.dagather.fonme.dial.pojo.RevertCode;
import com.dagather.fonme.dial.service.IDialService;
import java.util.Date;
import java.util.Map;
import javax.annotation.Resource;
import org.apache.commons.lang.ObjectUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class SendDialDataHandlerImpl extends Handler {
	@Resource(name = "dialServiceImpl")
	private IDialService iDialService = null;
	private Logger logger = LoggerFactory.getLogger(getClass());

	public Object execute(Long wcaid, String openId, String called, Map<String, Object> paramMap) {
		try {
			Date dateTime = new Date();
			UserInfo userInfo = (UserInfo) paramMap.get("userInfo");
			RevertCode<DialCode> revertCode = (RevertCode) paramMap.get("revertCode");
			if ((StringUtils.isNotBlank(ObjectUtils.toString(userInfo)))
					&& (StringUtils.isNotBlank(ObjectUtils.toString(revertCode)))) {
				DialCode dialCode = (DialCode) revertCode.getData();
				DialRecord dialRecord = new DialRecord();
				dialRecord.setDrid(dialCode.getSession());
				dialRecord.setUiid(userInfo.getUiid());
				dialRecord.setCaller(userInfo.getPhone());
				dialRecord.setCalled(called);
				dialRecord.setSessionid(dialCode.getSession());
				dialRecord.setFlagEnable(revertCode.getCode());
				dialRecord.setCreateDate(dateTime);
				dialRecord.setUpdateDate(dateTime);
				boolean retDialCode = this.iDialService.insertDialRecordObject(dialRecord);
				this.logger.info(
						"<|>SendDialDataHandlerImpl<|>execute<|>wcaid:{}/openId:{}/called:{}/paramMap:{}<|>{}<|>{}<|>",
						new Object[] { wcaid, openId, called, paramMap,

								Boolean.valueOf(retDialCode), "" });
				return retDialCode == true ? new RevertCode(Integer.valueOf(0), "拨号成功!")
						: new RevertCode(Integer.valueOf(1), "拨号失败!");
			}
			this.logger.info(
					"<|>SendDialDataHandlerImpl<|>execute<|>wcaid:{}/openId:{}/called:{}/paramMap:{}<|>{}<|>{}<|>",
					new Object[] { wcaid, openId, called, paramMap, "参数不正确", "参数不正确，稍后再试!" });

			return new RevertCode(Integer.valueOf(2), "参数不正确，稍后再试!");
		} catch (Exception e) {
			this.logger.error("<|>SendDialDataHandlerImpl<|>execute<|>wcaid:" + wcaid + "/openId:" + openId + "/called:"
					+ called + "/paramMap:" + paramMap + "<|>" + e.getMessage() + "<|>{}<|>", e);
		}
		return new RevertCode(Integer.valueOf(3), "网络异常，稍后再试!");
	}
}
