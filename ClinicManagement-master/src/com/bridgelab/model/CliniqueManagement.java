package com.bridgelab.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import com.bridgelab.repository.JsonCliniqueConnection;
import com.bridgelab.utility.Utility;

public class CliniqueManagement 
{ 	JsonCliniqueConnection connection=new JsonCliniqueConnection();
    List<Doctor> listofdoctors;
    List<Patient> listofpatient;
    static int max;
	public void addDoctor()
	{
		Doctor doctor = new Doctor();
		System.out.println("Enter Name ");
		doctor.setName(Utility.inputString());
		System.out.println("Enter Id ");
		doctor.setId(Utility.inputInt());
		System.out.println("Enter Specialization");
		doctor.setSpecialization(Utility.inputString());
        System.out.println("Enter Aailability");
		doctor.setAvailability(Utility.inputString());
		listofdoctors = getListofdoctors();
		listofdoctors.add(doctor);
		writeDoctorsData();
	}
	 public void addPatient()
	 {  int flag=0;
		 Patient patient=new Patient();
		 System.out.println("Enter name");
		 patient.setName(Utility.inputString());
		 System.out.println("Enter id");
		 patient.setId(Utility.inputInt());
		 System.out.println("Enter mobile number");
		 patient.setMobileno(Utility.inputLong());
		 System.out.println("Enter age");
		 patient.setAge(Utility.inputInt());
	     System.out.println("Enter Specialization for apointment");
		   List<Doctor> list1=searchBySpecialization(Utility.inputString());
	 	  printDoctors(list1);
	      System.out.println("Enter Doctor Name");
	      List<Doctor> list3=getListofdoctors();
	      String name=Utility.inputString();
	      patient.setAppointment(name);
	      for(Doctor doctor:list3)
	      {  
	    	  if((doctor.getName()).equals(name))
   	        	{	    		  
	    		  int num=doctor.getAppointment();
	    		  
	    		  doctor.setAppointment(++num);
	    		  flag=1;
	    		  System.out.println(num);
	    		  //list3.add(doctor);
	    		  setListofdoctors(list3);
	    		  writeDoctorsData();
	    		  break;
	    	  }
	    	  
	    	  
	      }
	     if (flag==0)
	     {
	    	 System.out.println("doctor not available");
	    	 
	     }
	     
		 listofpatient=getListofPatient();
		 listofpatient.add(patient);
		 writePatientData();
		 
	 }
	 public void availabilityOfDoctors()
	 { int i=1;
		 listofdoctors=getListofdoctors();
		 for(Doctor doctor:listofdoctors)
		 {    System.out.println("=================================================================");
			 System.out.println("doctor "+i);
			 System.out.println(" Name 					:"+doctor.getName());
			 System.out.println(" specialization 		:"+doctor.getSpecialization());
			 System.out.println(" Availability 			:"+doctor.getAvailability());
			 i++;
		 }
	 }
	 public void searchDoctor()
	 { int search;
	  
		 do
		{
		 System.out.println("Select Option============>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		 System.out.println("1: Search By  Name");
		 System.out.println("2: Search By Id");
		 System.out.println("3: Search By Specialization");
		 System.out.println("4: Exit");
		 System.out.println("Enter your choice");
		 search=Utility.inputInt();
		 switch(search)
		 {
		 case 1: System.out.println("Enter name");		     
		 		List<Doctor> list =searchByName(Utility.inputString());
	 			printDoctors(list);
	 		break;
		 case 2:
			 	System.out.println("Enter Id");
		        List<Doctor> list1=searchById(Utility.inputInt());
		        printDoctors(list1);
			 break;
		 case 3:
			 	System.out.println("Enter Specialization");
		 		List<Doctor> list2=searchBySpecialization(Utility.inputString());
		 		printDoctors(list2);
			 break;
		 case 4:
			  break;
		      
			 default: System.out.println("Enter proper choice");
		 }
		}while(search>0 && search<4);
		
	 }
	 public void searchPatient()
	 {
		 int search;
		 do
		{
		 System.out.println("Select Option============>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		 System.out.println("1: Search By  Name");
		 System.out.println("2: Search By Id");
		 System.out.println("3: Search By Mobile number");
		 System.out.println("4: Exit");
		 System.out.println("Enter your choice");
		 search=Utility.inputInt();
		 switch(search)
		 {
		 case 1:	
			 	System.out.println("Enter name");
		 		List<Patient> list=searchPatientByName(Utility.inputString());
		 		printPatients(list);
			 break;
		 case 2:
			   System.out.println("Enter  Id");
		       List<Patient> list1=searchPatientById(Utility.inputInt());
		       printPatients(list1);
			 break;
		 case 3:System.out.println("Enter Mobile Number");
		 		List<Patient> list2=searchPatientByMobileNumber(Utility.inputLong());
		 		printPatients(list2);
			 break;
		 case 4:
			 break;
		      
			 default: System.out.println("Enter proper choice");
		 }
		}while(search>0 && search<4);	
		 
	 }
	 public List<Patient> searchPatientByName(String name)
	 {
	 	listofpatient=getListofPatient();
	 	List<Patient> list=listofpatient.stream().filter(e->e.getName().contains(name)).collect(Collectors.toList());
	     return list;
	 }
	 public List<Patient> searchPatientById(int id)
	 {
		 listofpatient=getListofPatient();
		 	List<Patient> list=listofpatient.stream().filter(e->e.getId()==id).collect(Collectors.toList());
		     return list;
	 }
	 public List<Patient> searchPatientByMobileNumber(long mobno)
	 {
		 listofpatient=getListofPatient();
	 	List<Patient> list=listofpatient.stream().filter(e->e.getMobileno()==mobno).collect(Collectors.toList());
	     return list;
		 
	 }
	 public void printDoctors(List<Doctor> list)

	 {
		 for(Doctor doctor:list)
		{  
		  System.out.println(" Name  			:"+doctor.getName());
		  System.out.println(" Id  				:"+doctor.getId());
		  System.out.println(" Specialization  	:"+doctor.getSpecialization());
		  System.out.println(" Appointment 		:"+doctor.getAppointment());		 		
		}
		 
	 }
	 public void printPatients(List<Patient> list)

	 {
		 for(Patient patient:list)
		{  
		  System.out.println("Name  		:"+patient.getName());
		  System.out.println("Id  			:"+patient.getId());
		  System.out.println("Mobile Number :"+patient.getMobileno());
		  System.out.println("Appointment  	:"+patient.getAppointment());		 		
		}
		 
	 }

	 public List<Doctor> searchByName(String name) 
	 {
		 listofdoctors=getListofdoctors();  	
		 List<Doctor> list= listofdoctors.stream().filter(e->e.getName().contains(name)).collect(Collectors.toList());
		return list;
	 }
	 public List<Doctor> searchById(int id)
	 {  listofdoctors=getListofdoctors();
	 List<Doctor> list= listofdoctors.stream().filter(e -> e.getId()==(id)).collect(Collectors.toList());
		return list;
	 }
	 public List<Doctor> searchBySpecialization(String specialization)
	 {
		  listofdoctors=getListofdoctors();
		  List<Doctor>list= listofdoctors.stream().filter(e -> e.getSpecialization().contains(specialization)).collect(Collectors.toList());
		return list;
	 }
	 public void showPopularDoctor()
	 {	
		 List<Integer> list=new  ArrayList<Integer>();
		
	 		listofdoctors=getListofdoctors();
		   for(Doctor doctor: listofdoctors)
		   {
			  list.add(doctor.getAppointment());			  			  			  
		   }
		  max=Collections.max(list);
		 for(Doctor doctor: listofdoctors)
		   {
			 if( max==doctor.getAppointment())
			 {
				 System.out.println(doctor.getName());
			 }
		   }
	 }
	 public void popularSpecialization()
	 {   	listofdoctors=getListofdoctors();	
		 for(Doctor doctor: listofdoctors)
		 {
			 if( max==doctor.getAppointment())
			 {
				 System.out.println(doctor.getSpecialization());
			 }
		 }
	 }

	public List<Doctor> getListofdoctors() 
	{      listofdoctors=connection.readDoctorList();
	
		return listofdoctors;
	}

	public void setListofdoctors(List<Doctor> listofdoctors) 
	{
		this.listofdoctors = listofdoctors;
	}

	public List<Patient> getListofPatient()
	{     listofpatient=connection.readPatientList();
		return listofpatient;
	}

	public void setListofpatient(List<Patient> listofpatient)
	{
		this.listofpatient = listofpatient;
	}
  
	public void writeDoctorsData()
	{
	  connection.writeDoctorList(listofdoctors);	
	}
	public void readDoctorsData()
	{
		connection.readDoctorList();
	}
	
	public void readPatientsData()
	{
		connection.readPatientList();
	}
	public void writePatientData()
	{
		connection.writePatientList(listofpatient);
	}
}
