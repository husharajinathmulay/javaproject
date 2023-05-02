package com.bridgelab.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages ="com.bridgelab.model")

public class CollegeConfig
{
  @Bean
  public MathTeacher mathTeacher()
  {
	 return new MathTeacher();
  }
  @Bean
  public ScienceTeacher scienceTeacher()
  {
	  return new ScienceTeacher();
  }
  
  
}
