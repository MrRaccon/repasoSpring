package com.spring.app.autowired;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Circle implements Figure {

	@Value("${circle:1}")
	private double radious;
	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return Math.PI*Math.pow(radious,2);
	}
	@Override
	public String figureName() {
		// TODO Auto-generated method stub
		return "Circle";
	}

}
