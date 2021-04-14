package com.spring.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.spring.app.aop.TargetObject;
import com.spring.app.lifecycle.ExplicitBean;
import com.spring.app.lifecycle.LifeCycleBean;

@SpringBootApplication // ESTA NOTACION SIMPLIFICA LAS DE ABAJO
//@Configuration
//@EnableAutoConfiguration
//@ComponentScan
public class DependencyinjectionApplication {
	private static final Logger log = LoggerFactory.getLogger(DependencyinjectionApplication.class);

//	@Bean(initMethod = "init",destroyMethod = "destroy")//SE DEFINE METODO QUE SERAN POST Y PRE
//	public ExplicitBean getExplicitBean() {
//		return new ExplicitBean();
//	}

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DependencyinjectionApplication.class, args);

		TargetObject bean =context.getBean(TargetObject.class);
		bean.hello("QUE PASO MI PERRO");
		bean.foo();
	}

	
	/**
	 * METODO DONDE SE EXPLICA LOS QUALIFIER Y PRIMARY
	 */
//	public static void main(String[] args) {
//		//TODO el contexto de spring es donde viven los objetos que este administra
//	ConfigurableApplicationContext context=	SpringApplication.run(DependencyinjectionApplication.class, args);
//	//si se manda el valor, se hace referencia al bean al que quiere
////	Animal animal=context.getBean("pajaro",Animal.class);
//	
//	Nido animal=context.getBean(Nido.class);
//	
//	animal.imprimir();
//	
//	
//	
//	
//	//si se hace asi, se debe de indicar el nombre del calificador
////	context.getBean("pajaro",Animal.class);
//
//
//	}

}
