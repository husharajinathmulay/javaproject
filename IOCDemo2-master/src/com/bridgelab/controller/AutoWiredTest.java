package com.bridgelab.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgelab.model.Human;

public class AutoWiredTest 
{
   public static void main(String[] args) 
   {
	 ApplicationContext context=  new  ClassPathXmlApplicationContext("AutoWired.xml");
	              Human m = context.getBean("hmn",Human.class);
	              m.startPumping();
   }
}
