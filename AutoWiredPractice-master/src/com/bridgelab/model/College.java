package com.bridgelab.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class College {
	
    @Value("pande")
	private String name;
    
    @Autowired
	@Qualifier("scienceTeacher")
	private Teacher teacher;
	
   
	public void teacherInfo()
	{  System.out.println("Teacher name is="+name);
	  teacher.teacherDetail();
	}
}
