package com.sk.spring6.autowire;

public class Coder {
	private int code;
	private Computer com;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public Computer getCom() {
		return com;
	}

	public void setCom(Computer com) {
		this.com = com;
	}

	public void code() {
		System.out.println("\nI am coding code-" + code + ".");
		com.compile();
	}
}
