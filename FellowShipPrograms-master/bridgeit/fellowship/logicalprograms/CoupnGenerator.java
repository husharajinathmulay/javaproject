package com.bridgeit.fellowship.logicalprograms;  
import com.bridgeit.fellowship.utility.Utility;                      
import java.util.Random;


public class CoupnGenerator {
	public static void createRandomcode(int n)
	{
		char ch[]="abcdefghijklmnopqrstuvwxyz0123456789".toCharArray();
		StringBuilder sb=new StringBuilder();
		Random r=new Random();
		for(int i=0;i<n;i++)
		{
			char c=ch[r.nextInt(ch.length)];
			sb.append(c);
		}
		System.out.println(sb);
	}
	
public static void main(String[] args) {
	System.out.println("How many times do you want to generate ramdom number");
	int num=Utility.inputInt();
	for(int i=0;i<num;i++)
	{
		createRandomcode(10);
	}

}
}
