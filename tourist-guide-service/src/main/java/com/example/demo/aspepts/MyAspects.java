package com.example.demo.aspepts;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;

import com.example.demo.domains.TouristGuide;

import lombok.extern.slf4j.Slf4j;

@Aspect
@Slf4j
@Configuration
public class MyAspects {

	
	@Before(value = "com.example.demo.utils.PointCutConfigs.allMethods()")
	public void  logging(JoinPoint joinpoint) {
		
		log.info(joinpoint.getSignature().getName()+"Called");
	}
	
	@Around(value = "com.example.demo.utils.PointCutConfigs.allMethods()")
	public Object manageResult(ProceedingJoinPoint pjp) throws Throwable {
		
		  Object obj = pjp.proceed();
		  
		  if(obj instanceof TouristGuide) {
			  
			  TouristGuide guide = (TouristGuide)obj;
			   guide.setMobileNumber(555555);
			   obj =guide;
		  }
		   return obj;
	}
}
