package com.dagather.fonme.dial.pojo;

public class RevertCode<T> {
	private Integer code = null;
	private String msg = null;
	private T data = null;

	public RevertCode(Integer code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public RevertCode(Integer code, String msg, T data) {
		this.code = code;
		this.msg = msg;
		this.data = data;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMsg() {
		return this.msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public T getData() {
		return this.data;
	}

	public void setData(T data) {
		this.data = data;
	}
}
