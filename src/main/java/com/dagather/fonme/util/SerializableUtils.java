package com.dagather.fonme.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import org.apache.commons.lang.ObjectUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName: SerializableUtils
 * @Description: (java序列化操作)
 * @author shejia@gz-mstc.com
 * @date 2016年3月1日 下午2:15:43
 */
public class SerializableUtils {
	private static Logger logger = LoggerFactory.getLogger(SerializableUtils.class);

	/**
	 * @Title: serializeObj
	 * @Description: (对象序列化为btye[])
	 * @param object
	 *            对象
	 * @return byte[] 返回类型 序列化之后数据
	 */
	public static byte[] serializeObj(Serializable object) {
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		ObjectOutputStream oos = null;
		byte[] perBytes = null;
		try {
			oos = new ObjectOutputStream(out);
			oos.writeObject(object);
			if (out != null) {
				perBytes = out.toByteArray();
			}
			logger.info("<|>2013011811<|>java序列化操作工具类<|>serializeObj把对象序列化为btye[]<|>"
					+ (StringUtils.isNotBlank(ObjectUtils.toString(object)) ? true : false) + "<|><|><|>备用参数<|>");
			return perBytes;
		} catch (IOException e) {
			logger.error("<|>2013011811<|>java序列化操作工具类<|>serializeObj把对象序列化为btye[]<|>" + object + "<|><|><|>备用参数<|>",
					e);
			return null;
		}
	}

	public static <T> T reSerializeObj(byte[] bytes, Class<T> objClass) {
		// TODO Auto-generated method stub
		try {
			ByteArrayInputStream in = new ByteArrayInputStream(bytes);
			ObjectInputStream ois = new ObjectInputStream(in);
			Object obj = ois.readObject();
			logger.info("<|>2013011812<|>java序列化操作工具类<|>reSerializeObj反序列化<|>" + objClass + "<|>"
					+ (StringUtils.isNotBlank(ObjectUtils.toString(obj)) ? true : false) + "<|><|>备用参数<|>");
			return (T) obj;
		} catch (Exception e) {
			logger.error("<|>2013011812<|>java序列化操作工具类<|>reSerializeObj反序列化<|>" + objClass + "<|>null<|><|>备用参数<|>", e);
			return null;
		}
	}

}
