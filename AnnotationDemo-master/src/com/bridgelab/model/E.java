package com.bridgelab.model;

public class E 
 { B b;
    public E(B b)
    {
	  	this.b=b;
	}
    
    public void dispIfo()
    {
    	b.disp();
    	System.out.println("from E class");
    }
    
}
