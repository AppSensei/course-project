package com.infiniteskills.aopAspects;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

	private Logger logger = Logger.getLogger(getClass());

	@Before("execution(* com.infiniteskills.mvc.controllers.*.*(..))")
	public void beforeLog(JoinPoint point) {
		logger.info(point.getSignature().getName() + " About to be called");
		logger.info(point.getStaticPart().getSignature());
	}
	
	@AfterReturning("execution(* com.infiniteskills.mvc.controllers.AlbumController.*(com.infiniteskills.mvc.model.Album, ..))")
	public void returnLog(JoinPoint point) {
		logger.info(point.getSignature().getName() + " called ....");
	}
	
	@After("execution(* com.infiniteskills.mvc.controllers.AlbumController.*(..))")
	public void Afterlog(JoinPoint point) {
		logger.info(point.getSignature().getName() + " out of method execution ....");
		logger.info(point.getStaticPart().getSignature());
	}
}
