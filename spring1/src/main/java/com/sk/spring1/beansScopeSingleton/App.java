package com.sk.spring1.beansScopeSingleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext contextFactory = new ClassPathXmlApplicationContext("spring1.xml");

		Coder ob1 = (Coder) contextFactory.getBean("coderSingleton");
		ob1.setCode(1000);
		ob1.code();

		Coder ob2 = (Coder) contextFactory.getBean("coderSingleton");
		ob2.code();
	}
}
