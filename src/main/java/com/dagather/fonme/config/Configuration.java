package com.dagather.fonme.config;

public class Configuration {
	public static final String LANG = "zh_CN";
	public static final String ENCODING = "UTF-8";
	public static final Integer FLAG_ENABLE = 1;
	public static final Integer FLAG_DISABLE = 0;
	public static final Integer REDIS_TIME = 3600;
	public static final String WX_ACCESS_TOKEN = "WX_ACCESS_TOKEN";
	public static final String RESP_MESSAGE_TYPE_TEXT = "text";
	public static final String RESP_MESSAGE_TYPE_MUSIC = "music";
	public static final String RESP_MESSAGE_TYPE_NEWS = "news";
	public static final String REQ_MESSAGE_TYPE_TEXT = "text";
	public static final String REQ_MESSAGE_TYPE_IMAGE = "image";
	public static final String REQ_MESSAGE_TYPE_LINK = "link";
	public static final String REQ_MESSAGE_TYPE_LOCATION = "location";
	public static final String REQ_MESSAGE_TYPE_VOICE = "voice";
	public static final String REQ_MESSAGE_TYPE_EVENT = "event";
	public static final String EVENT_TYPE_SUBSCRIBE = "subscribe";
	public static final String EVENT_TYPE_UNSUBSCRIBE = "unsubscribe";
	public static final String EVENT_TYPE_CLICK = "CLICK";
	public static final String RANDOM_BASE_STR = "abcdefghijklmnopqrstuvwxyz0123456789";
	public static final String WX_GET_TOKEN_URL = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid={0}&secret={1}";
	public static final String WX_GET_OAUTH2_URL = "https://api.weixin.qq.com/sns/oauth2/access_token";
	public static final String WX_GET_CREATEMENU_URL = "https://api.weixin.qq.com/cgi-bin/menu/create?access_token={0}";
	public static final String WX_GET_USERINFO_URL = "https://api.weixin.qq.com/cgi-bin/user/info?access_token={0}&openid={1}&lang={2}";
	public static final String WX_GET_CREATE_USERINFO_URL = "https://qyapi.weixin.qq.com/cgi-bin/user/create?access_token={0}";
	public static final String WX_POST_MESSAGE_TEMPLATE_URL = "https://api.weixin.qq.com/cgi-bin/message/template/send?access_token={0}";
	public static final String WX_POST_CREATE_DEPARTMENT_URL = "https://qyapi.weixin.qq.com/cgi-bin/department/create?access_token={0}";
	public static final String WX_POST_DELETE_USER_URL = "https://qyapi.weixin.qq.com/cgi-bin/user/delete?access_token={0}&userid={1}";
	public static final String WX_POST_CONVERT_TO_OPENID_URL = "https://qyapi.weixin.qq.com/cgi-bin/user/convert_to_openid?access_token={0}";
	public static final String WX_POST_UNIFIEDORDER_PAY_URL = "https://api.mch.weixin.qq.com/pay/unifiedorder";
	public static final String SMS_POST_API_URL = "https://eco.taobao.com/router/rest";
	public static final String SMS_FREE_SIGN_NAME = "元数集";
	public static final String SMS_ACCESS_TOKEN = "SMS_ACCESS_TOKEN";
	public static final String SMS_APP_ID = "24657548";
	public static final String SMS_APP_SECRET = "2cd03adf433a9a659a259208e1666b15";
	public static final String SMS_INSPECT_KEY = "SMS_INSPECT_KEY";
}
