package com.bridgelab.controller;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bridgelab.model.College;
import com.bridgelab.model.CollegeConfig;

public class AutowiredMain
{
  public static void main(String[] args) {
	  AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(CollegeConfig.class);
   College college=context.getBean("college",College.class);
   college.teacherInfo();
   context.close();
 
}
}
