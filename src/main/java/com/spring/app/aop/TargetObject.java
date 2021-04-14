package com.spring.app.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class TargetObject {
	
	
	private static final Logger log = LoggerFactory.getLogger(TargetObject.class);

	
	@Devs4jAnnotation
	public void hello(String message) {
		log.info("Mensaje {}",message);
	}
	
	
	public void foo() {
		log.info("metodo sin entradas");
	}


}
