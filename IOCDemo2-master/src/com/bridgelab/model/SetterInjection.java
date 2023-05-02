package com.bridgelab.model;

public class SetterInjection
{
  private String studentName;
  private int studentAge;
  private String studentCollegeName;

  public SetterInjection()
  {
	  
  }
  
  public SetterInjection(String studentName, int studentAge) {
	super();
	this.studentName = studentName;
	this.studentAge = studentAge;
}
 
  public SetterInjection(String studentName, int studentAge, String studentCollegeName) {
	this.studentName = studentName;
	this.studentAge = studentAge;
	this.studentCollegeName = studentCollegeName;
}
  
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public void setStudentAge(int studentAge) {
	this.studentAge = studentAge;
}
public void setStudentCollegeName(String studentCollegeName) {
	this.studentCollegeName = studentCollegeName;
}

public void displayData()
 {
	 System.out.println("StudentName 		:"+studentName);
	 System.out.println("studentAge			:"+studentAge);
	 System.out.println("studentCollegeName :"+studentCollegeName);
	 
 }
}
