package com.spring.app.aop;

import java.lang.reflect.Modifier;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(0)
public class MyAspect2 {
	
	private static final Logger log = LoggerFactory.getLogger(MyAspect.class);


	
	@Before("PointCutExample.targetObjectMethods()")
	public void before(JoinPoint joinPont) {
		log.info("2 Method Name--- {}",joinPont.getSignature().getName());
		log.info(" 2 Object Type--- {}",joinPont.getSignature().getDeclaringTypeName());
		log.info(" 2 Is public--- {}",Modifier.isPublic(joinPont.getSignature().getModifiers()) );
		log.info(" 2 Arguments--- {}",joinPont.getArgs());


		log.info("2 Before Advice");
	}

}
