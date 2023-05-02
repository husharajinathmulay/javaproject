package com.bridgelab.controller;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.bridgelab.model.A;
import com.bridgelab.model.B;
import com.bridgelab.model.SetterInjection;
import com.bridgelab.service.D;
public class IOCTest 
{
 public static void main(String[] args) 
 { 
	 ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");	
      D  d = context.getBean("b",B.class);											// injection dependency
      d.disp();
      
      
    SetterInjection si= context.getBean("s",SetterInjection.class);                  //setter injection
     si.displayData();
     
     
     
     si= context.getBean("s1",SetterInjection.class);                  //constructor injection 
     si.displayData();
     
    si=context.getBean("s2",SetterInjection.class);
    si.displayData();
    
   A a= context.getBean("a",A.class);
    
    a.disp();
    context.close();
    
     
 }
}
