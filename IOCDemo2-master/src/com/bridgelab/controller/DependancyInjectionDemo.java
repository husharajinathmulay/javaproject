package com.bridgelab.controller;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgelab.model.Student;

public class DependancyInjectionDemo {

	public static void main(String[] args)
	{
		

		
		@SuppressWarnings("resource")
		ApplicationContext context =new ClassPathXmlApplicationContext("DIDbean.xml"); 
		 System.out.println("beans loaded"); 
	Student student =	context.getBean("stud",Student.class);
		student.displayStudentInfo();
		student= context.getBean("stud1",Student.class);
		student.displayStudentInfo();
		
	}

}
