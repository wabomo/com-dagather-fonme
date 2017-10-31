package com.dagather.fonme.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.apache.commons.httpclient.HostConfiguration;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.RequestEntity;
import org.apache.commons.httpclient.methods.StringRequestEntity;
import org.apache.commons.httpclient.params.HttpMethodParams;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.ObjectUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HttpUtil {
	private static Logger logger = LoggerFactory.getLogger(HttpUtil.class);

	public static String doGet(String url) {
		return doGet(url, null, null, Integer.valueOf(0), Integer.valueOf(10000));
	}

	public static String doGet(String url, Map headerMap) {
		return doGet(url, headerMap, null, Integer.valueOf(0), Integer.valueOf(10000));
	}

	public static String doGet(String url, String proxyUrl, int proxyPort) {
		return doGet(url, null, proxyUrl, Integer.valueOf(proxyPort), Integer.valueOf(10000));
	}

	public static String doGet(String url, Map headerMap, String proxyUrl, Integer proxyPort, Integer outTime) {
		String content = null;
		HttpClient httpClient = new HttpClient();
		GetMethod getMethod = new GetMethod(url);
		getMethod.getParams().setContentCharset("UTF-8");
		getMethod.getParams().setHttpElementCharset("UTF-8");
		if (StringUtils.isNotBlank(ObjectUtils.toString(headerMap))) {
			if (headerMap != null) {
				Iterator iterator = headerMap.entrySet().iterator();
				while (iterator.hasNext()) {
					Map.Entry entry = (Map.Entry) iterator.next();
					getMethod.addRequestHeader(entry.getKey().toString(), entry.getValue().toString());
				}
			}
		}
		if ((StringUtils.isNotBlank(proxyUrl)) && (StringUtils.isNotBlank(ObjectUtils.toString(proxyPort)))) {
			httpClient.getHostConfiguration().setProxy(proxyUrl, proxyPort.intValue());
		}
		getMethod.getParams().setParameter("http.socket.timeout", outTime);

		InputStream inputStream = null;
		try {
			Integer code = Integer.valueOf(httpClient.executeMethod(getMethod));
			if (code.intValue() == 200) {
				inputStream = getMethod.getResponseBodyAsStream();
				content = IOUtils.toString(inputStream);
				logger.info("<|>HttpUtil<|>doGet<|>" + url + "/" + headerMap + "/" + proxyUrl + "/" + proxyPort + "/"
						+ outTime + "<|>" + code + "<|>" + content

								.length()
						+ "<|><|>");
			} else {
				logger.info("<|>HttpUtil<|>doGet<|>" + url + "/" + headerMap + "/" + proxyUrl + "/" + proxyPort + "/"
						+ outTime + "<|>" + code + "<|>" + getMethod

								.getStatusLine()
						+ "<|><|>");
			}
		} catch (IOException e) {
			logger.error("<|>HttpUtil<|>doGet<|>" + url + "/" + headerMap + "/" + proxyUrl + "/" + proxyPort + "/"
					+ outTime + "<|>IOException<|>" + e + "<|><|>", e);
		} finally {
			IOUtils.closeQuietly(inputStream);
			getMethod.releaseConnection();
		}
		return content;
	}

	public static String doPost(String url, Map parameterMap) {
		return doPost(url, null, parameterMap, null, null, null, Integer.valueOf(10000));
	}

	public static String doPost(String url, Map parameterMap, String paramCharset) {
		return doPost(url, null, parameterMap, paramCharset, null, null, Integer.valueOf(10000));
	}

	public static String doPost(String url, Map headerMap, Map parameterMap, String paramCharset) {
		return doPost(url, headerMap, parameterMap, paramCharset, null, null, Integer.valueOf(10000));
	}

	public static String doPost(String url, Map parameterMap, String paramCharset, String proxyUrl, int proxyPort) {
		return doPost(url, null, parameterMap, paramCharset, proxyUrl, Integer.valueOf(proxyPort),
				Integer.valueOf(10000));
	}

	public static String doPost(String url, Map headerMap, Map parameterMap, String paramCharset, String proxyUrl,
			Integer proxyPort, Integer outTime) {
		String content = null;
		HttpClient httpClient = new HttpClient();
		PostMethod postMethod = new PostMethod(url);
		paramCharset = StringUtils.isNotBlank(paramCharset) ? paramCharset : "UTF-8";

		postMethod.getParams().setContentCharset(paramCharset);
		postMethod.getParams().setHttpElementCharset(paramCharset);
		if (headerMap != null) {
			if (headerMap != null) {
				Iterator iterator = headerMap.entrySet().iterator();
				while (iterator.hasNext()) {
					Map.Entry entry = (Map.Entry) iterator.next();
					postMethod.addRequestHeader(entry.getKey().toString(), entry.getValue().toString());
				}
			}
		}
		Iterator iterator = parameterMap.keySet().iterator();
		while (iterator.hasNext()) {
			String key = (String) iterator.next();
			postMethod.addParameter(key, (String) parameterMap.get(key));
		}
		if (StringUtils.isNotBlank(proxyUrl)) {
			httpClient.getHostConfiguration().setProxy(proxyUrl, proxyPort.intValue());
		}
		postMethod.getParams().setParameter("http.socket.timeout", Integer.valueOf(10000));

		InputStream inputStream = null;
		try {
			Integer code = Integer.valueOf(httpClient.executeMethod(postMethod));
			if (code.intValue() == 200) {
				inputStream = postMethod.getResponseBodyAsStream();
				content = IOUtils.toString(inputStream);
				logger.info("<|>HttpUtil<|>doPost<|>" + url + "/" + headerMap + "/" + proxyUrl + "/" + proxyPort + "/"
						+ outTime + "<|>" + code + "<|>" + content

								.length()
						+ "<|><|>");
			} else {
				logger.info("<|>HttpUtil<|>doPost<|>" + url + "/" + headerMap + "/" + proxyUrl + "/" + proxyPort + "/"
						+ outTime + "<|>" + code + "<|>" + postMethod

								.getStatusLine()
						+ "<|><|>");
			}
		} catch (IOException e) {
			logger.error("<|>HttpUtil<|>doPost<|>" + url + "/" + headerMap + "/" + proxyUrl + "/" + proxyPort + "/"
					+ outTime + "<|>IOException<|>" + e + "<|><|>", e);
		} finally {
			IOUtils.closeQuietly(inputStream);
			postMethod.releaseConnection();
		}
		return content;
	}

	public static String doPostJSON(String url, String jsonToString) {
		return doPostJSON(url, null, jsonToString, null, null, null, Integer.valueOf(10000));
	}

	public static String doPostJSON(String url, Map headerMap, String jsonToString, String paramCharset,
			String proxyUrl, Integer proxyPort, Integer outTime) {
		String content = null;
		HttpClient httpClient = new HttpClient();
		PostMethod postMethod = new PostMethod(url);
		paramCharset = StringUtils.isNotBlank(paramCharset) ? paramCharset : "UTF-8";

		postMethod.getParams().setContentCharset(paramCharset);
		postMethod.getParams().setHttpElementCharset(paramCharset);
		if (headerMap != null) {
			if (headerMap != null) {
				Iterator iterator = headerMap.entrySet().iterator();
				while (iterator.hasNext()) {
					Map.Entry entry = (Map.Entry) iterator.next();
					postMethod.addRequestHeader(entry.getKey().toString(), entry.getValue().toString());
				}
			}
		}
		try {
			RequestEntity entity = new StringRequestEntity(jsonToString, "text/xml", "UTF-8");

			postMethod.setRequestEntity(entity);
		} catch (Exception localException) {
		}
		if (StringUtils.isNotBlank(proxyUrl)) {
			httpClient.getHostConfiguration().setProxy(proxyUrl, proxyPort.intValue());
		}
		postMethod.getParams().setParameter("http.socket.timeout", Integer.valueOf(10000));

		InputStream inputStream = null;
		try {
			Integer code = Integer.valueOf(httpClient.executeMethod(postMethod));
			if (code.intValue() == 200) {
				inputStream = postMethod.getResponseBodyAsStream();
				content = IOUtils.toString(inputStream);
				logger.info("<|>HttpUtil<|>doPostJSON<|>" + url + "/" + headerMap + "/" + proxyUrl + "/" + proxyPort
						+ "/" + outTime + "<|>" + code + "<|>" + content

								.length()
						+ "<|><|>");
			} else {
				logger.info("<|>HttpUtil<|>doPostJSON<|>" + url + "/" + headerMap + "/" + proxyUrl + "/" + proxyPort
						+ "/" + outTime + "<|>" + code + "<|>" + postMethod

								.getStatusLine()
						+ "<|><|>");
			}
		} catch (IOException e) {
			logger.error("<|>HttpUtil<|>doPostJSON<|>" + url + "/" + headerMap + "/" + proxyUrl + "/" + proxyPort + "/"
					+ outTime + "<|>IOException<|>" + e + "<|><|>", e);
		} finally {
			IOUtils.closeQuietly(inputStream);
			postMethod.releaseConnection();
		}
		return content;
	}

	public static void main(String[] args) {
		String uel = "http://it.joincare.com:8080/erp/dto/json/sms2.ashx";
		Map<String, String> map = new HashMap();
		map.put("user_code", "VASTO");
		map.put("pwd", "KwUm2Ps8");
		map.put("action", "SMS");
		map.put("phone", "15915784546");
		map.put("content", "Hello.你好吗？知道我是哪个吗");
		String b = doPost(uel, map);
		System.out.println("-------------------" + b);
	}
}
