package com.bridgelab.model;

public class College 
{
  @SuppressWarnings("unused")
private String college_name;
  @SuppressWarnings("unused")
private String college_address;
  
  public College()
  {
	  System.out.println("constructor call");
  }
  
public void setCollege_name(String college_name) {
	this.college_name = college_name;
}
public void setCollege_address(String college_address) {
	this.college_address = college_address;
}

public void displayCollegeInfo()
{
	System.out.println("college_name	 :"+college_name);
	System.out.println("college_address  :"+college_address);
	
}
  
}
