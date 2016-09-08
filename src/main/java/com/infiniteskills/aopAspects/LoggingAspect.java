package com.infiniteskills.aopAspects;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	
	@Around("within(com.infiniteskills.mvc.*)")
	public void LoggingAdvice() {
		System.out.println("1st Advice Instantiated, Method call in" + getClass().getName());
	}

}
