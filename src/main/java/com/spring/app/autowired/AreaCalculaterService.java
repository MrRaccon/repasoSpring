package com.spring.app.autowired;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AreaCalculaterService {
	@Autowired
	private List<Figure> figures;
	
	//TODO lista de beans con interfaces y sus componentes que implementan esta interface
	private static final Logger log = LoggerFactory.getLogger(AreaCalculaterService.class);


	public double calAreas() {
		double area =0.0;
		for (Figure figure : figures) {
			area+=figure.calculateArea();
			log.info("Area de : {} = {}", figure.figureName(), figure.calculateArea());

		}
		return area;

	}

}