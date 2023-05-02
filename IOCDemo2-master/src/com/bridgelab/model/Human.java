package com.bridgelab.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Human
{
  private Heart heart;


@Autowired
public Human(Heart heart) {

	this.heart = heart;
}

public void startPumping()
{
	 if(heart!=null)
	 {
		 heart.pump();
	 }
	 else
	 {
		 System.out.println("you r dead ");
	 }
}

}
