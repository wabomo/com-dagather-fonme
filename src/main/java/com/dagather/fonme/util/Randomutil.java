package com.dagather.fonme.util;

public class Randomutil {
	public static String getRandom(int digit) {
		String num = "";
		for (int i = 0; i < digit; i++) {
			num = num + String.valueOf((int) Math.floor(Math.random() * 9.0D + 1.0D));
		}
		return num;
	}
}
