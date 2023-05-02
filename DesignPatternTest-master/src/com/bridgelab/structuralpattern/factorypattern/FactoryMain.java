package com.bridgelab.structuralpattern.factorypattern;

public class FactoryMain 
{
  public static void main(String[] args) 
  {
	  FactoryOfOS obj=new FactoryOfOS();
	  
	  OS os=obj.getInstance("IOS"); 
	  os.specification();
  }
}
