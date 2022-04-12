package com.sk.springbootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Coders {
	@Autowired
	Laptop ob;

	public void code() {
		ob.compile();
		System.out.println("I am coding...");
	}
}
