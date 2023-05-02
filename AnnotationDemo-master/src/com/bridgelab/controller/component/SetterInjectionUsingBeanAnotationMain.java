package com.bridgelab.controller.component;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bridgelab.model.ConfigSetterInjectionUsingBeanAnnotation;
import com.bridgelab.model.E;

public class SetterInjectionUsingBeanAnotationMain {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				ConfigSetterInjectionUsingBeanAnnotation.class);
		     E e = context.getBean("mybean", E.class);
		e.dispIfo();
		context.close();
	}

}
