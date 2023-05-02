package com.bridgelab.model;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class Alert 
{  
   @Before("allMethods())")
   public  void alertMsgBeforTransaction()
   {
	   System.out.println("transaction start");
   }

  @After("allMethods()")
  public void alertMsgAfterTransaction() 
  {
	  System.out.println("transaction end");
  }
  @Pointcut("within(com.bridgelab.model.Transaction)")
  public void allMethods()
  {}
  
}
//@Before("execution(public void transactionStart())")
//public  void alertMsgBeforTransaction()
//{
//	   System.out.println("transaction start");
//}
//
//@After("execution(public void transactionStart())")
//public void alertMsgAfterTransaction() 
//{
//	  System.out.println("transaction end");
//}
