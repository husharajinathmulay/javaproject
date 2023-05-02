package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
	 ConfigurableApplicationContext context=SpringApplication.run(SpringBootDemoApplication.class, args);
	
	context.getBean("person",Person.class).personDetail();
	
	
	}

}
