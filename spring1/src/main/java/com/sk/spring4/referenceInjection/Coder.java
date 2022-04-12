package com.sk.spring4.referenceInjection;

public class Coder {
	private int code;
	private Laptop laptop;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		System.out.println("(Setter Injection): Setter method called by spring for int code.");
		this.code = code;
	}

	public Laptop getLaptop() {
		System.out.println("(Ref. Injection): Setter method called by spring for Ref. Laptop.");
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	public void code() {
		System.out.println("\nI am coding code-" + code + ".");
		laptop.compile();
	}

}
