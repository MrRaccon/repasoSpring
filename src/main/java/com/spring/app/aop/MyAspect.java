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
@Order(1)
public class MyAspect {
	
	
	private static final Logger log = LoggerFactory.getLogger(MyAspect.class);

	/**
	 *  "*" inicial--refiere a un posible retorno del metodo a interceptar
	 *  TargetObject.* -- se refiera a que cualquier metodo que tenga la clase targetobject sera afectado
	 *  (..) -- se refiere a que no le importa el numero de parametros entrada
	 */
	
	@Before("PointCutExample.targetObjectMethods()")
	public void before(JoinPoint joinPont) {
		log.info("1 Method Name--- {}",joinPont.getSignature().getName());
		log.info("1 Object Type--- {}",joinPont.getSignature().getDeclaringTypeName());
		log.info("1 Is public--- {}",Modifier.isPublic(joinPont.getSignature().getModifiers()) );
		log.info("1 Arguments--- {}",joinPont.getArgs());


		log.info("1 Before Advice");
	}

}
