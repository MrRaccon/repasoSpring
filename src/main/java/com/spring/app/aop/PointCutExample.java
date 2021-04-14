package com.spring.app.aop;

import org.aspectj.lang.annotation.Pointcut;

public class PointCutExample {

//	@Pointcut("within(com.spring.app.aop.TargetObject)")
//	@Pointcut("within(TargetObject)")
	@Pointcut("@annotation(Devs4jAnnotation)")
	public void targetObjectMethods() {	}
	
	
//	@Pointcut("execution(* com.spring.app.aop.TargetObject.*(..))")
//	public void targetObjectMethods() {	
}
