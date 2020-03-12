package com.app.restservices.beans;

public class AutheticationBean {
	private String msg;
	
	public AutheticationBean(String msg) {
		// TODO Auto-generated constructor stub
		this.msg = msg;
	}
	
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "HelloWorldBean [msg=" + msg + "]";
	}

}
