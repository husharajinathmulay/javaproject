package com.bridgelab.model;

public class College 
{
	
    private Teacher teacher;
		
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public void collegeInfo()
	{
	  teacher.teach();
	}
  
}
