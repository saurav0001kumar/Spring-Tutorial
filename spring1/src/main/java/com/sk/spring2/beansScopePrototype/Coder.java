package com.sk.spring2.beansScopePrototype;

public class Coder {
	private int code;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public void code() {
		System.out.println("\nI am coding code-" + code + ".");

	}

}
