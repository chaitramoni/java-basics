package com.xworkz.monith.Aspect;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Aspect
@Slf4j
public class LoggingAspect {
	
	
	
	
//	@Before("execution(*  com.xworkz.monith.controller.**.**(..))")
//	public void logBefore(JoinPoint joinPoint) {
//		log.info("Running in before loging");
//		System.err.println("Hi moni");
//		log.info("Enter:{}() with argument[s] = {}",joinPoint.getSignature().getDeclaringTypeName(),joinPoint.getSignature().getName(),Arrays.toString(joinPoint.getArgs()));
//		
//		}
	
	
	@After("execution(* com.xworkz.monith.controller.ElectionRestController.onPost(..))")
	public void logAfter(JoinPoint joinPoint) {
		log.info("Running in after loging");
		System.err.println("Hi chaitra");
		log.info("Enter:{}() with argument[s] = {}",joinPoint.getSignature().getDeclaringTypeName(),joinPoint.getSignature().getName(),Arrays.toString(joinPoint.getArgs()));
		
		}
	

	@Before("execution(* com.xworkz.monith.service.CrackerServiceImpl.save(..))")
	public void logBefore(JoinPoint joinPoint) {
		log.info("Running in before loging");
		System.err.println("Hi loki");
		log.info("Enter:{}() with argument[s] = {}",joinPoint.getSignature().getDeclaringTypeName(),joinPoint.getSignature().getName(),Arrays.toString(joinPoint.getArgs()));
		
		}
	
}
