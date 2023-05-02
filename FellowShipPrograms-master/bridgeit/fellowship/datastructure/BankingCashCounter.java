package com.bridgeit.fellowship.datastructure;

import com.bridgeit.fellowship.utility.Utility;
/*
*
* purpose: To maintain Banking ransaction deposit and withdraw money. 
* 
* @author Milind Patil
* @version 1.0
* since: 19-11-2019
* */


public class BankingCashCounter 
{
	public static void main(String[] args) 
	{  
		System.out.println("How many users do you want to add");
	

		int n=Utility.inputInt();
		while(n<0)
		{
			System.out.println("Please Enter possitive number");
			System.out.println("Enter account Number");
			n=Utility.inputInt();
		}
		int accNo;
		float balance;
		String Uname;
		for(int i=1;i<=n;i++)
		{   
			System.out.println("Enter Account number ");
			accNo=Utility.inputInt();
			if(accNo<0)
			{   System.out.println("Please Enter possitive number");
				System.out.println("Enter account Number");
				accNo=Utility.inputInt();
			}
			System.out.println("Enter User Name");
			Uname=Utility.inputString();
			System.out.println("Enter Balance ");
			balance=Utility.inputFloat();
			QueueUtility.addUser(accNo, Uname, balance);	
		}
		QueueUtility.show();
		System.out.println();
		System.out.println("=======WELCOME TO BANK=======");
			System.out.println("Enter the Account Number");
			int acc=Utility.inputInt();
			QueueUtility.search(acc);
	}

}
