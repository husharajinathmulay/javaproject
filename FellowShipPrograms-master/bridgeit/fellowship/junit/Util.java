package com.bridgeit.fellowship.junit;

public class Util {
	/*
	 * purpose: static function for convert decimal to binary
	 * @param : passing int value
	 * 
	 * */
	public static  String decToBin(int n)
	{
		String s = new String();	 

		int arr[]=new int[8];

		int i=0,r=0,l=0;
		
		while(0<n)
		{
			r=n%2;
			arr[i]=r;
			n=n/2;
			i++;
		}
		
		for(int j=7;j>=0;j--,l++)
		{
			System.out.print(arr[j]+" ");
		        s=s+arr[j];
		}
		return s;	
	}
	/*
	 * purpose: static function to find the day of week
	 * @param :passing three int value date,month,year
	 * @return: day of week 
	 * */
	public static int dayOfWeek(int d,int m,int y)
	{   
		int y0=y-(14-m)/12;
		
	    int	x = y0 + y0/4-y0/100 + y0/400;
		int	m0 = m + 12 * ((14-m) / 12) -2;
		int d0 = (d + x + (31*m0)/12)%7;
		return d0;		
	}
	
	
	/*
	 * purpose: static function for temperature conversion
	 * @param: passing one double and one string type
	 * @return : conversion 
	 * */
	public static double temperatureConversion(double tem, String t) 
	{
		double con;
		if (t.equals("c") || t.equals("C")) {
			con = (tem * 9 / 5) + 32;
		} else if (t.equals("f") || t.equals("F")) {
			con = (tem - 32) * 5 / 9;
		} else {
			System.out.println("Enter correct input");
			return 0;
		}
		return con;
	}
	/*
	 * purpose: calculates the monthly payments
	 * @param: passing  P, R double type and Y int type
     * @return : conversion 
	 * */
	public static double monthlyPayment(double P, int Y, double R) 
	{
		double n = 12 * Y;
		double r = R / (12 * 100);
		double payment = P * r / (1 - Math.pow((1 + r), -n));
		return payment;
	}
	/*
	 * purpose to calculate sqrt 
	 * @param: passing one value
	 * @return: return double type value
	 *  */
	public static double sqrt(double c) 
	{

		double t = c;
		double epsilon = 1e-15;
		while (Math.abs(t - c / t) > epsilon * t) {
			t = (c / t + t) / 2;
		}

		return t;
		
	}
	  /*
	 * purpose: static function to read from file and store in list
	 *@param: passing file name as string 
	 * @return: String array
	 * */
	

	

  public static void permutation(String str, int f, int l) 
	{ 
		if (f == l) 
			System.out.println(str); 
		else 
		{ 
			for (int i = f; i <= l; i++)
			{ 
				str = swap(str, f, i);         // to swapping of two char of f and i index
				permutation(str, f + 1, l);   //permutation is recursive function 
				str = swap(str, f, i); 
			} 
		} 
	} 
  
  
  /*
	 * purpose: To swap two string 
	 *@param: passing three param one string and two int values 
	 * @return: swapped string
	 * */
	
	public static String swap(String a, int i, int j) 
	{ 
		char temp; 
		char[] arr= a.toCharArray(); 
		temp = arr[i]; 
		arr[i] = arr[j]; 
		arr[j] = temp; 
		return String.valueOf(arr); 
	}
	/*
	 * purpose: To swap Nibbles 
	 *@param: passing decimal value 
	 * @return: int type decimal value
	 * */
	
	public static void toSwapNibbles(String s) 
	{
		String s1="";
			s1=s1+s.substring(4,8);
            s1=s1+s.substring(0,4);	
		System.out.println(s1);
		
	}
	/*
	 * purpose: convert binary to decimal
	 *@param: passing string type
	 * @return: int val
	 * */
	
	
	public static int toDecimal(String  s)
	{
	     
		int len=s.length();
		int i=0;
		int res=0;
		int pow=1;
		
		while(i<len)
		{
			
			if(i==0)
			{
				pow=1;
			}else // calculate power 
			{
				pow=pow*2;
			}
			//if 1 is found then add power into the result
			if((s.charAt(i))=='1')
			{
				res=res+pow;
			}
			i++;
		}
		return res;
	}
}
