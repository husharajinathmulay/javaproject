package com.bridgelab.controller.component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bridgelab.model.College;
import com.bridgelab.model.ConfigSetterMethodAnnotation;

public class ConfigSetterMethodAnnotationMain 
{
 public static void main(String[] args) {
	ApplicationContext context=new AnnotationConfigApplicationContext(ConfigSetterMethodAnnotation.class);
      College college= context.getBean("collegeBean",College.class);
      college.collegeInfo();
    
 }
}
