package com.bridgelab.cotroller;

import com.bridgelab.model.CliniqueManagement;
import com.bridgelab.utility.Utility;

public class CliniqueMain
{
 public static void main(String[] args) 
 { int choice;
	 do
	 {
		 CliniqueManagement cliniqueManagement=new CliniqueManagement();  
	 	System.out.println("Select Options=================================>>>>>>>>>>>>>>>>>>>>");
	 	System.out.println("1:	Add Doctor");
	 	System.out.println("2:	Add Patient");
	 	System.out.println("3:	Availability of Doctors");
	 	System.out.println("4:	Search Doctor ");
	 	System.out.println("5:	Search patient");
	 	System.out.println("6: 	Show popular doctor");
	 	System.out.println("7: 	Show popular Specialization");
	 	System.out.println("8: 	Exit");
	 	System.out.println("Enter proper choice");
	 	choice=Utility.inputInt();
	 	switch(choice)
	 	{
	 	case 1:cliniqueManagement.addDoctor();
	 		break;
	 	case 2:cliniqueManagement.addPatient();
	 		break;
	 	case 3: cliniqueManagement.availabilityOfDoctors();

	 		break;
	 	case 4: cliniqueManagement.searchDoctor();

	 		break;
	 	case 5: cliniqueManagement.searchPatient();

	 		break;
	 	case 6: cliniqueManagement.showPopularDoctor();

	 		break;
	 	case 7: cliniqueManagement.popularSpecialization();
	 		break;
	 	case 8:System.exit(0);
	 	    break;
	 	default:System.out.println("Enter proper choice");	 		
	 	}	 	
	 }while(choice>0 && choice<8);
 } 
}

 
