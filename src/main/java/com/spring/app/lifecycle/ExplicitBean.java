package com.spring.app.lifecycle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExplicitBean {
     
	private static final Logger log = LoggerFactory.getLogger(ExplicitBean.class);

	public void init() {
		log.info("INIT METHOD");
	}
	
	

	public void destroy() {
		log.info("DESTROY METHOD");

	}
}
