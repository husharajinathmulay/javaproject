package com.bridgelab.model;

import com.bridgelab.service.D;

public class A implements D
{


	public void disp() {
		System.out.println("hello from class A");
		
	}
	public void init()
	{
		System.out.println(" bean initialized ");
	}
	public void destroy()
	{
		System.out.println(" bean is destroyed");
	}
}
