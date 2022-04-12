package com.sk.springbootaop;

import java.util.logging.Logger;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	private Logger LOGGER = Logger.getLogger("LoggingAspect.class");

	@Before("execution(public * com.sk.springbootaop.HomeController.getAllCoders())")

	public void logBefore() {
		LOGGER.info("called before getAllCoders()");
	}

	@After("execution(public * com.sk.springbootaop.HomeController.getAllCoders())")
	public void logAfterFinallyByDefault() {
		LOGGER.info("called after getAllCoders() even if Exception is thrown");
	}

	@AfterReturning("execution(public * com.sk.springbootaop.HomeController.getAllCoders())")
	public void logAfterSuccess() {
		LOGGER.info("called after successful execution of getAllCoders()");
	}

	@AfterThrowing("execution(public * com.sk.springbootaop.HomeController.getAllCoders())")
	public void logAfterException() {
		LOGGER.info("called after getAllCoders() only if Exception is thrown or not");
	}
}
