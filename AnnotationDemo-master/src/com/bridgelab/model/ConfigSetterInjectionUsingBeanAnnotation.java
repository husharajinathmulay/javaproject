package com.bridgelab.model;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ConfigSetterInjectionUsingBeanAnnotation
{
  @Bean	 
  public E mybean()
  {
	 return new E(createObject());
	    
  }

public B createObject()
{
	return new B();
}
}
