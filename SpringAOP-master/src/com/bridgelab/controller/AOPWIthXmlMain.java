package com.bridgelab.controller;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgelab.model.ShapeService;

public class AOPWIthXmlMain 
{
	public static void main(String[] args)
	{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		ShapeService service = context.getBean("shapeService", ShapeService.class);
		System.out.println(service.getCircle().getName());
		context.close();
	}
}
