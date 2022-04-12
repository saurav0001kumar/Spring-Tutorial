package com.sk.spring3.setterInjection;

public class Coder {
	private int code;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		System.out.println("(Setter Injection): Setter method called by spring for int code.");
		this.code = code;
	}

	public void code() {
		System.out.println("\nI am coding code-" + code + ".");

	}

}
