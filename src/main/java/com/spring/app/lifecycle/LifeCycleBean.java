package com.spring.app.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Lazy //-- no se inicializa el bean hsta que alguien lo necesita
//@Scope("prototype")--pre destroy no se ejecuta en beans con scope prototype
public class LifeCycleBean implements BeanNameAware,InitializingBean,DisposableBean {
	
	private static final Logger log = LoggerFactory.getLogger(LifeCycleBean.class);

  /**
   * Se ejecuta durante la construccion del bean "BeanNameAware"
   */
	@Override
	public void setBeanName(String name) {
		log.info("Bean Name Aware LifeCycleBean: {}", name);
		
	}
	
	/**
	 * se ejecuta despues la inyeccion de las dependencias
	 */
	@PostConstruct
	public void init() {
		log.info("Post construct LifeCycleBean");
	}
	/**
	 * se ejecutans antes de que el bean sea destruido
	 * ademas de que este metodo no se ejecuta en metodos prototype
	 * siempre y cuando la VM ternime normalmente
	 */
	@PreDestroy
	public void destroyBean() {
		log.info("predestroy LifeCycleBean");
	}

	
	
	@Override
	public void afterPropertiesSet() throws Exception {
		log.info("After properties set method LifeCycleBean");
		
	}

	@Override
	public void destroy() throws Exception {
		log.info("Destroy method override LifeCycleBean");
		
	}

}
