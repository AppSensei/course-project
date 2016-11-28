package com.infiniteskills.aopAspects;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@EnableAspectJAutoProxy
@Component("loggingAspect")
@Aspect
public class LoggingAspect {

	private Logger logger = Logger.getLogger(getClass());
	
	@Before("execution(* com.infiniteskills.mvc.controllers.*.*(..))")
	public void beforeLog(JoinPoint point) {
		logger.info("[BEFORE] " + point.getSignature().getName() + " Called.");
	}
	
	@AfterReturning("execution(* com.infiniteskills.mvc.controllers.*.*(..))")
	public void returnLog(JoinPoint point) {

		//Object argus = point.getArgs()[0].toString();		
		logger.info("[AFTER] " + point.getSignature().getName() + " (INVOKED-Success) ");
	}
	
	@After("execution(* com.infiniteskills.mvc.controllers.AlbumController.*(..))")
	public void Afterlog(JoinPoint point) {
		logger.info(point.getSignature().getName() + " out of method execution ....");
		logger.info(point.getStaticPart().getSignature());
	}
}
