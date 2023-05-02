package com.bridgelabz.controller;


import com.bridgelabz.util.Utility.Queue;
import com.bridgelabz.util.Utility.Utility;
/**@purpose: To perform Deck of cards  in queue
 * @author:
 * @date:
 * */

public class DeckOfCardsInQueue 
{
   public static void main(String[] args)
   {
	   String[] suit = { "Hearts", "Spades","Clubs", "Diamonds"};                                         
	     String[] rank = {"Jack", "Queen", "King", "Ace","2", "3", "4", "5", "6", "7", "8", "9", "10"};
	     String store[][]=new String[4][9];
	    
	     int n = suit.length * rank.length;
	     String[] deck = new String[n];
	     
	     for (int i = 0; i < rank.length; i++) 
	     {
	         for (int j = 0; j < suit.length; j++)
	         {
	             deck[suit.length*i + j] = rank[i] + "->" + suit[j];     //store rank and suit in  string array
	         }
	     }
	     
	     
	     String shufflecards[]=Utility.suffleCards(deck);               //shuffle cards 
	     
	     
	     int k=0;
	     for(int i=0;i<4;i++)
	     {	 
	         System.out.println("-----------------------------------------------------------------------------------------------------");

	    	 for(int j=0;j<9;j++)
	    	 {
	    		Queue.enqueue(shufflecards[k]);                         //insert into queue
	    		k++;
	    	 }
	        
	    	 Queue.printQueue();
	    	 for(int j=0;j<9;j++)
	    	 {
	    		 Queue.dequeueFront();							//  delete form queue
	    	 }
	         System.out.println();

	     }
   }
}
