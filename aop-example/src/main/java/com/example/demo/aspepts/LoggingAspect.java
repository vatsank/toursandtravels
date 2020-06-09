package com.example.demo.aspepts;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.Slf4j;

@Aspect
@Slf4j
@Configuration
public class LoggingAspect {

	
	@Before(value = "com.example.demo.utils.PointCutConfigs.logInfo()")
	public void  logging(JoinPoint joinpoint) {
		
		log.info(joinpoint.getSignature().getName()+"Called");
	}
}
