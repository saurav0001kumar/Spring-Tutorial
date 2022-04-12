package com.sk.spring6.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext contextFactory = new ClassPathXmlApplicationContext("spring6.xml");

		Coder ob1 = (Coder) contextFactory.getBean("coder");
		ob1.code();
	}
}
