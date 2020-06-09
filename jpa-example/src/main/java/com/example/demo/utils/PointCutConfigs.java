package com.example.demo.utils;

import org.aspectj.lang.annotation.Pointcut;

public class PointCutConfigs {

	
	@Pointcut("execution(* com.example.demo.services.*.*(..))")
	public void allMethods() {}
}
