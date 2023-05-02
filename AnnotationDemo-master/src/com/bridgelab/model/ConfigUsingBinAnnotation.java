package com.bridgelab.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
@Component
public class ConfigUsingBinAnnotation 
{  @Bean
    public B beanId()
    {                           //Method name always bean id
    	return new B();
    }
}
