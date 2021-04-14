package com.spring.app.autowired;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Square implements Figure {
	@Value("${square:1}")
	private double side;

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return side*side;
	}

	@Override
	public String figureName() {
		// TODO Auto-generated method stub
		return "Cuadrado";
	}

}
