package com.bridgelab.controller.component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bridgelab.model.A;
import com.bridgelab.model.ComponentConfig;

public class ConfigAnnoMain 
{
 public static void main(String[] args) {
	 ApplicationContext context= new AnnotationConfigApplicationContext(ComponentConfig.class);
	A obj=  context.getBean("classA",A.class);
	 obj.disp(); 
}
}
