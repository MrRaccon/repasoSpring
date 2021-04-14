package com.spring.app.qualifiers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class Avion implements Volador{

	
	private static final Logger LOGGER = LoggerFactory.getLogger(Avion.class);

	@Override
	public void volar() {
		LOGGER.info("SOY UN AVION VOLANDO");
		
	}

}
