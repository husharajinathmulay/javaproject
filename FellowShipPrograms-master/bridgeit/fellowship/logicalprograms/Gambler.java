package com.bridgeit.fellowship.logicalprograms;
import com.bridgeit.fellowship.utility.Utility;

/**
 *  Purpose: Print Number of Wins and Percentage of Win and Loss of Gambler 
 *
 *  @author  Milind Patil
 *  @version 1.0
 *  @since   13-11-2019
 *
 **/
public class Gambler {
	
	/**
	  * The main function is written to Print Number of Wins and Percentage of Win and Loss of Gambler 
	  **/
	
	public static void main(String[] args) {
		
		System.out.println("Enter the Stake ");
		
		//Take stake as Input Integer
		
		int s=Utility.inputInt();
		System.out.println("Enter the Goals");
		
		//Take Goal as Input Integer
		
		int g=Utility.inputInt();
		System.out.println("Enter the Number Of Times ");
		
		//Take Number Of Times as Input Integer
		
		int z=Utility.inputInt();
		int bets = 0 , wins = 0; 
		for(int i=0;i<z;i++) {
			int cash=s;
			while (cash>0 && cash<g) {
				bets++;
				if (Math.random() < 0.5)
					cash++;  
                else
                	cash--;
			}
			// if Gambler wins
			
			if (cash == g) {
				wins++;  
				System.out.println("Won");
			}
						
			//if Gambler lost
						
			else {
				System.out.println("Lost");
			}   
		}
		System.out.println(wins + " wins of " + z);
	    System.out.println("Percent of games won = " + 100.0 * wins / z);
	    System.out.println("Avg bets = " + 1.0 * bets / z);
	    
	    //Closing Scanner
	    
	    Utility.closeScanner();
	    
	}

}
