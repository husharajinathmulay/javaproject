package com.bridgelab.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan(basePackages= "com.bridgelab.model")
public class ConfigSetterMethodAnnotation 
{  @Bean
    public Teacher mathTeacherBean()
    {
    	return new MathcTeacher();
    }
    
    
    @Bean
    public College collegeBean()
    {
         College college= new College();
         college.setTeacher(mathTeacherBean());
   
         return college;
    }
   
}
