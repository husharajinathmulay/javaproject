package com.bridgelab.controller.component;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgelab.model.A;
import com.bridgelab.model.C;

public class ComponentAnnotation
{

 public static void main(String[] args)
 {
	ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
    A  a  =context.getBean("classA",A.class);
  
    a.disp();
    C c=   context.getBean("classC",C.class);
 
    c.disp();
 }
}
