package com.dagather.fonme.dial.handler;

import java.util.Map;

public abstract class Handler {
	protected Handler successor = null;

	public abstract Object execute(Long paramLong, String paramString1, String paramString2,
			Map<String, Object> paramMap);

	public Handler getSuccessor() {
		return this.successor;
	}

	public void setSuccessor(Handler successor) {
		this.successor = successor;
	}
}
