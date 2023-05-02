package com.bridglabz.tictactoe;

import java.util.Random;
import java.util.Scanner;

/*@purpose : To crate Tic Tac Toe Game
  @author : Your name
  @since : 
*/
public class TicTacToeGame {

	// to create board
	public static char[] createBoard() {
		char[] board = new char[10];
		for (int i = 1; i < 10; i++) {
			board[i] = ' ';
		}

		return board;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Tic Tac Toe");
		TicTacToeGame tic = new TicTacToeGame();
		char board[] = tic.createBoard();	
		
		showBoard(board);
		
		moveToLocation(board);

		
	}

	private static void moveToLocation(char board[]) {
		System.out.println("Choose your possion");
		Scanner sc = new Scanner(System.in);
           int possion= sc.nextInt();	
           if(possion>0 && possion<10)
           {
        	   if(board[possion]==' ')
        	   { 
        	    char symbol= chooseLetter();
        		   board[possion]=symbol;
        		   showBoard(board);
        			
        	   }
           }
           sc.close();
	}

	private static void showBoard(char board[]) {
	
		System.out.println("|_"+board[1]+"|_"+board[2]+"|_"+board[3]+"| ");
		System.out.println("|_"+board[4]+"|_"+board[5]+"|_"+board[6]+"| ");
		System.out.println("|_"+board[7]+"|_"+board[8]+"|_"+board[9]+"| ");
		
	}

	private static char chooseLetter() {
		
		System.out.println("Choose your symbol");
		Scanner sc = new Scanner(System.in);
		char symbol=	sc.next().toUpperCase().charAt(0);
		symbol = (symbol == 'X') ? 'o' : 'x';
		sc.close();
		return symbol;
	}

}

//private static void allowToInsert(char[] board) {
//	 System.out.println("Payer 1 can enter X or Y sysmbol");				
//	Scanner sc=new Scanner(System.in);
//	 System.out.println("Please Enter symbol");
//			
//	 char symbol= sc.next().charAt(0);
//	 if(symbol=='X'|| symbol=='x')
//		{    int index = getRandom();
//		    if(board[index]==' ')
//		      {
//		    	board[index]=symbol;
//		      }
//		}
//	 else {
//		 
//	 }
//		
//	  if(symbol=='Y'|| symbol=='y')
//		  {    int index = getRandom();
//		    if(board[index]==' ')
//		      {
//		    	board[index]=symbol;
//		      }
//		  }
//		
//		
//		
//		
//		
//		
//	
//	
//}

//private static int getRandom() {
//	Random random=new Random();
//	 int r =random.nextInt(10);
//	 if(r < 0)
//	 {
//	   getRandom();	 
//	}
//	return r;
//}
