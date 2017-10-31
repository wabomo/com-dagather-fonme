package com.dagather.fonme.util;

import com.alibaba.druid.filter.config.ConfigTools;
import java.io.PrintStream;

public class Text {
	public static void main(String[] args) throws Exception {
		String[] arr = ConfigTools.genKeyPair(512);
		System.out.println("privateKey:" + arr[0]);
		System.out.println("publicKey:" + arr[1]);
		System.out.println("password:" + ConfigTools.encrypt(arr[0], "Expay_2019"));
	}
}
