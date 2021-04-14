package com.spring.app.lifecycle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class Devs4jBeansPostProcessor implements BeanPostProcessor {
 
	
	private static final Logger log = LoggerFactory.getLogger(Devs4jBeansPostProcessor.class);

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if(bean instanceof LifeCycleBean) {
			log.info("BEFORE initialization of bean {}", beanName);
		}
		
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if(bean instanceof LifeCycleBean) {
			log.info("AFTER initialization of bean {}", beanName);
		}
		

		return bean;
	}

}
