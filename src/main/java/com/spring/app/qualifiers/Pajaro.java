package com.spring.app.qualifiers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Pajaro extends Animal implements Volador {

	public Pajaro(@Value("12") String edad, @Value("Pajaro Loco") String nombre) {
		super(edad, nombre);
	}

	private static final Logger LOG = LoggerFactory.getLogger(Pajaro.class);

	@Override
	public void volar() {
		LOG.info("sera parajo nalgon");
	}

}
