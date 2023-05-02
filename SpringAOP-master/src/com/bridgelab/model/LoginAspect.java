package com.bridgelab.model;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoginAspect 
{
	@Before("execution(public * get*(..))")
  public void msg()
  {
	  System.out.println(" u  r  login");
  }
}
