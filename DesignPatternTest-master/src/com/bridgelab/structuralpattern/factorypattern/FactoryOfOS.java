package com.bridgelab.structuralpattern.factorypattern;

public class FactoryOfOS 
{
  public OS getInstance(String str)
  {
	  if(str=="Android")
		  return new Android();
	  else if(str=="IOS")
		    return new IOS();
	  else 
		  return new Windows();
  }
}
