package com.sk.spring4.referenceInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext contextFactory = new ClassPathXmlApplicationContext("spring4.xml");

		Coder ob1 = (Coder) contextFactory.getBean("coder");
		ob1.code();
	}
}
