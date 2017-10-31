package com.dagather.fonme.dial.controller;

import com.dagather.fonme.dial.handler.Handler;
import com.dagather.fonme.dial.pojo.RevertCode;
import com.dagather.fonme.dial.service.IDialService;
import com.dagather.fonme.redis.service.IRedisService;
import com.dagather.fonme.util.Randomutil;
import com.google.gson.Gson;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.domain.BizResult;
import com.taobao.api.request.AlibabaAliqinFcSmsNumSendRequest;
import com.taobao.api.response.AlibabaAliqinFcSmsNumSendResponse;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping({ "/dial" })
public class DialController {
	@Resource(name = "dialServiceImpl")
	private IDialService iDialService = null;
	@Resource(name = "redisServiceImpl")
	private IRedisService iRedisService = null;
	@Resource(name = "checkBalanceDialHandlerImpl")
	private Handler handler = null;
	private Logger logger = LoggerFactory.getLogger(getClass());

	@RequestMapping({ "uppage/{wcaid}/{openId}/index" })
	public String uppage(@PathVariable Long wcaid, @PathVariable String openId, HttpServletRequest request,
			HttpServletResponse response) {
		request.setAttribute("wcaid", wcaid);
		request.setAttribute("openId", openId);
		return "dial_up_page";
	}

	@RequestMapping(value = { "sendDial/index" }, method = {
			org.springframework.web.bind.annotation.RequestMethod.POST })
	@ResponseBody
	public Object sendDial(@RequestParam(value = "wcaid", required = true) Long wcaid,
			@RequestParam(value = "openId", required = false) String openId,
			@RequestParam(value = "called", required = false) String called, HttpServletRequest request,
			HttpServletResponse response) {
		try {
			Map<String, Object> paramMap = new HashMap();
			return (RevertCode) handler.execute(wcaid, openId, called, paramMap);
		} catch (Exception localException) {
		}
		return null;
	}

	@RequestMapping({ "binding/{wcaid}/{openId}/index" })
	public String binding(@PathVariable Long wcaid, @PathVariable String openId, HttpServletRequest request,
			HttpServletResponse response) {
		request.setAttribute("wcaid", wcaid);
		request.setAttribute("openId", openId);
		return "user_binding";
	}

	@RequestMapping({ "sendsms/index" })
	@ResponseBody
	public String sendSms(@RequestParam(value = "phone", required = true) String phone, HttpServletRequest request,
			HttpServletResponse response) {
		Gson gson = new Gson();
		try {
			String str = iRedisService.getStringKeyToRedis("SMS_INSPECT_KEY" + phone);
			if (StringUtils.isNotBlank(str)) {
				logger.info("<|>DialController<|>sendSms<|>phone:{}<|>{}<|>{}<|>",
						new Object[] { phone, Boolean.valueOf(false), "操作频率过高，请稍后再试!" });
				return gson.toJson(new RevertCode(Integer.valueOf(4), "操作频率过高，请稍后再试!"));
			}
			String code = Randomutil.getRandom(6);
			TaobaoClient client = new DefaultTaobaoClient("https://eco.taobao.com/router/rest", "24657548",
					"2cd03adf433a9a659a259208e1666b15");

			AlibabaAliqinFcSmsNumSendRequest req = new AlibabaAliqinFcSmsNumSendRequest();
			req.setExtend("123456");
			req.setSmsType("normal");
			req.setSmsFreeSignName("元数集");
			req.setSmsParamString("{\"code\":\"" + code + "\",\"product\":\"Fonme\"}");
			req.setRecNum(phone);
			req.setSmsTemplateCode("SMS_9705293");
			AlibabaAliqinFcSmsNumSendResponse rsp = (AlibabaAliqinFcSmsNumSendResponse) client.execute(req);
			if (rsp.getResult().getSuccess().booleanValue()) {
				iRedisService.setStringKeyToRedis("SMS_INSPECT_KEY" + phone, code, 60);
				iRedisService.setStringKeyToRedis("SMS_ACCESS_TOKEN" + phone, code, 600);
				logger.info("<|>DialController<|>sendSms<|>phone:{}<|>{}<|>{}<|>",
						new Object[] { phone, rsp.getResult().getSuccess(), rsp.getBody() });
				return gson.toJson(new RevertCode(Integer.valueOf(0), "短信验证码发送成功!"));
			}
			logger.info("<|>DialController<|>sendSms<|>phone:{}<|>{}<|>{}<|>",
					new Object[] { phone, rsp.getResult().getSuccess(), rsp.getBody() });
			return gson.toJson(new RevertCode(Integer.valueOf(1), "短信验证码发送失败!"));
		} catch (Exception e) {
			logger.error("<|>DialController<|>sendSms<|>phone:" + phone + "<|>" + e.getMessage() + "<|>{}<|>", e);
		}
		return gson.toJson(new RevertCode(Integer.valueOf(3), "网络异常，稍后再试!"));
	}
}
