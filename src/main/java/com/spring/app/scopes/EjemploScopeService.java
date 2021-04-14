package com.spring.app.scopes;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class EjemploScopeService {
	
	
	//TODO EJEMPLOS DESDE EL APPLICATION
//	EjemploScopeService bean= context.getBean(EjemploScopeService.class);
//	EjemploScopeService bean1= context.getBean(EjemploScopeService.class);
//	log.info("los bean son iguales?: {}" ,bean.equals(bean1));
//	log.info("neta son iguales?: {}" ,bean==(bean1));

}
