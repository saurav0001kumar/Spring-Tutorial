package com.sk.spring2.beansScopePrototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext contextFactory = new ClassPathXmlApplicationContext("spring2.xml");

		Coder ob1 = (Coder) contextFactory.getBean("coderPrototype");
		ob1.setCode(1000);
		ob1.code();

		Coder ob2 = (Coder) contextFactory.getBean("coderPrototype");
		ob2.code();
	}
}
