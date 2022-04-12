package com.sk.spring1.beansScopeSingleton;

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
