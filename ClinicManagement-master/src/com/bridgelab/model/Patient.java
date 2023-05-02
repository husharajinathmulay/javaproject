package com.bridgelab.model;

import com.bridgelab.utility.Utility;

public class Patient
{
	private String name;
	private int id;
	private long mobileno;
	private int age;
	private String appointment;
	
	public String getAppointment() {
		return appointment;
	}

	public void setAppointment(String appointment) {
		this.appointment = appointment;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getId() 
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public long getMobileno() 
	{
		return mobileno;
	}

	public void setMobileno(long mobileno) 
	{ 
		 boolean status =Utility.mobileNoValidate(String.valueOf(mobileno));  //this method validate to mobile number
	     if(status==false)
	     {
	    	 System.out.println("mobile should be 10 digit");
	    	 System.out.println("Enter your mobile number");
	    	 mobileno = Utility.inputLong();
	     }
		this.mobileno = mobileno;
	}

	public int getAge() 
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	

}
