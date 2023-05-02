package com.bridgelab.model;

public class Student
{
  @SuppressWarnings("unused")
private String stud_id;
  @SuppressWarnings("unused")
private String stud_name;
  @SuppressWarnings("unused")
private College college;
  
   


public College getCollege() {
	return college;
}
public void setCollege(College college) {
	this.college = college;
}
public String getStud_id() {
	return stud_id;
}
public String getStud_name() {
	return stud_name;
}
public void setStud_name(String stud_name) {
	this.stud_name = stud_name;
}
public void setStud_id(String stud_id) {
	this.stud_id = stud_id;
}



public void displayStudentInfo()
{
   System.out.println("stud_name :"+stud_name);
   System.out.println("stud_id   :"+stud_id);
    college.displayCollegeInfo();
}

}
