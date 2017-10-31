package com.dagather.fonme.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SignatureUtil {
	private static Logger logger = LoggerFactory.getLogger(SignatureUtil.class);

	public static String generateSignature(Map<String, Object> map) {
		return generateSignature(map, null);
	}

	public static String generateSignature(Map<String, Object> map, String keyStr) {
		StringBuffer signStr = new StringBuffer();
		Collection<String> keyset = map.keySet();
		List<String> keyList = new ArrayList(keyset);

		Collections.sort(keyList);
		for (int i = 0; i < keyList.size(); i++) {
			signStr.append((String) keyList.get(i) + "=" + map.get(keyList.get(i)) + "&");
		}
		if (StringUtils.isNotBlank(keyStr)) {
			signStr.append("key=" + keyStr);
		}
		return signStr.toString();
	}
}
