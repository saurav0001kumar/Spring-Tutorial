package com.sk.spring5.constructorInjection;

public class Coder {
	private int code;
	private Laptop laptop;

	public Coder(int code, Laptop laptop) {
		this.code = code;
		this.laptop = laptop;
		System.out.println("(Constructor Injection): Parameterized constructor called this by spring.");
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public Laptop getLaptop() {
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
