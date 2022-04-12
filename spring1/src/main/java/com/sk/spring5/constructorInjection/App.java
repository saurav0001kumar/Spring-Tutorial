package com.sk.spring5.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext a = new ClassPathXmlApplicationContext("spring5.xml");
		Coder ob = (Coder) a.getBean("coder");
		ob.code();
	}
}
