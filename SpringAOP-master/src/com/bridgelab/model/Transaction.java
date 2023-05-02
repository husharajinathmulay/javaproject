package com.bridgelab.model;

import org.springframework.stereotype.Component;

@Component
public class Transaction 
{
	public void transactionStart()
	  {
		  System.out.println("doing transaction");
	  }
}
