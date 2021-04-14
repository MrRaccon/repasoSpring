package com.spring.app.qualifiers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Perro extends Animal{

	public Perro(@Value("2") String edad, @Value("el negrito") String nombre) {
		super(edad, nombre);
		// TODO Auto-generated constructor stub
	}

}
