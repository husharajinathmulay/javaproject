package com.bridgelab.controller.component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bridgelab.model.B;
import com.bridgelab.model.ConfigUsingBinAnnotation;

public class ConfigUsingBeanAnnotationMain 
{
	public static void main(String[] args) {
		ApplicationContext context=new  AnnotationConfigApplicationContext(ConfigUsingBinAnnotation.class);	
	     B b =context.getBean("beanId",B.class);
	        b.disp();
	}
    
   
}
