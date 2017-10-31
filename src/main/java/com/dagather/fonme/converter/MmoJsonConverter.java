package com.dagather.fonme.converter;

import com.google.gson.GsonBuilder;
import org.springframework.http.converter.json.GsonHttpMessageConverter;

public class MmoJsonConverter extends GsonHttpMessageConverter {
	public MmoJsonConverter() {
		super.setGson(new GsonBuilder().serializeNulls().setDateFormat("yyyy-MM-dd HH:mm:ss").create());
	}
}
