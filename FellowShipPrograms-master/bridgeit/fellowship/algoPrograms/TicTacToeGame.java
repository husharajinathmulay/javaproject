package com.bridgeit.fellowship.algoPrograms;
import com.bridgeit.fellowship.utility.Utility;

/*
 * purpose:   TicTacToe Game
 * 
 * @author Milind Patil
 * @version 1.0
 * @since 11-11-2019
 * */
class TicTacToe
{  
   
 	int arr_val[][] = new int[3][3];
	char arr_char[][] = new char[3][3];

//constructor of TicTacToe class is initialize the arrays
	public TicTacToe() 
	{
//Constructor 
		for (int i = 0; i < 3; i++) 
		{
			for (int j = 0; j < 3; j++) 
			{
				arr_val[i][j] = 7;
				arr_char[i][j] = '_';
			}
		}

	}

//show the first table of Array
	public void printNumArray() 
	{
		int count = 1;
		for (int i = 0; i < 3; i++) 
		{
			for (int j = 0; j < 3; j++) 
			{
				System.out.print(" " + (count++) + " = " + arr_char[i][j]);
			}
			System.out.println();
		}
	}

// show the tictoctoe matrix
	public void printCharArray() 
	{
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++) 
			
			{
				System.out.print(" " + arr_char[i][j]);
			}
			System.out.println();
		}
	}

	public boolean win(int val) 
	{
		boolean win = false;
//win condition for first player
		if (val == 1) 
		{

	   	/* row */if (  arr_val[0][0] + arr_val[0][1] + arr_val[0][2] == 3
					|| arr_val[1][0] + arr_val[1][1] + arr_val[1][2] == 3
					|| arr_val[2][0] + arr_val[2][1] + arr_val[2][2] == 3  
	/* column */	|| arr_val[0][0] + arr_val[1][0] + arr_val[2][0] == 3
					|| arr_val[0][1] + arr_val[1][1] + arr_val[2][1] == 3
					|| arr_val[0][2] + arr_val[1][2] + arr_val[2][2] == 3 					
  /* diagonal */    || arr_val[0][0] + arr_val[1][1] + arr_val[2][2] == 3
					|| arr_val[0][2] + arr_val[1][1] + arr_val[2][0] == 3 ) 
	   		{
				win = true;
			}

		}

		else {
//win condition for second player

		 /* row */ if (arr_val[0][0] + arr_val[0][1] + arr_val[0][2] == 6
					|| arr_val[1][0] + arr_val[1][1] + arr_val[1][2] == 6
					|| arr_val[2][0] + arr_val[2][1] + arr_val[2][2] == 6 
    /* column */	|| arr_val[0][0] + arr_val[1][0] + arr_val[2][0] == 6
					|| arr_val[0][1] + arr_val[1][1] + arr_val[2][1] == 6
					|| arr_val[0][2] + arr_val[1][2] + arr_val[2][2] == 6 
/* diagonal */		|| arr_val[0][0] + arr_val[1][1] + arr_val[2][2] == 6
					|| arr_val[0][2] + arr_val[1][1] + arr_val[2][0] == 6 ) 
			{
				win = true;
			}

		}
		return win;
	}

//this method set value to perticular position
	public void setPosAndVal(int pos, int value, char ch)
	{
		switch (pos)
		{
		case 1:
			if (arr_val[0][0] != 1 || arr_val[1][1] != 2) 
			{
				arr_val[0][0] = value;
				arr_char[0][0] = ch;
			}

			break;
		case 2:
			if (arr_val[0][1] != 1 || arr_val[0][1] != 2)
			{
				arr_val[0][1] = value;
				arr_char[0][1] = ch;
			}
			break;
		case 3:
			if (arr_val[0][2] != 1 || arr_val[0][2] != 2) 
			{
				arr_val[0][2] = value;
				arr_char[0][2] = ch;
			}
			break;

		case 4:
			if (arr_val[1][0] != 1 || arr_val[1][0] != 2) 
			{
				arr_val[1][0] = value;
				arr_char[1][0] = ch;
			}
			break;
		case 5:
			if (arr_val[1][1] != 1 || arr_val[1][1] != 2)
			{
				arr_val[1][1] = value;
				arr_char[1][1] = ch;
			}
			break;

		case 6:
			if (arr_val[1][2] != 1 || arr_val[1][2] != 2) 
			{
				arr_val[1][2] = value;
				arr_char[1][2] = ch;
			}
			break;
		case 7:
			if (arr_val[2][0] != 1 || arr_val[2][0] != 2) 
			{
				arr_val[2][0] = value;
				arr_char[2][0] = ch;
			}
			break;
		case 8:
			if (arr_val[2][1] != 1 || arr_val[2][1] != 2) 
			{
				arr_val[2][1] = value;
				arr_char[2][1] = ch;
			}
			break;
		case 9:
			if (arr_val[2][2] != 1 || arr_val[2][2] != 2) 
			{
				arr_val[2][2] = value;			
				arr_char[2][2] = ch;
			}
			break;
		}
	}
}

public class TicTacToeGame {
	public static void main(String ar[]) {
//take input from the user
		
//create object TicTacToe type
		
		TicTacToe t = new TicTacToe();
		int position;
		t.printNumArray();
		int i;

		for (i = 0; i < 5; i++) {

			System.out.println("1st Player Enter the Position");
			position = Utility.inputInt();
			t.setPosAndVal(position, 1, 'X');
			t.printCharArray();
			if (t.win(1)) {
				System.out.println(".....Congo........First... Player is win the game");
				break;
			}
			if (i == 4) {
				break;
			}
			System.out.println("2nd Player Enter the Position");
			position = Utility.inputInt();
			t.setPosAndVal(position, 2, 'O');
			t.printCharArray();
			if (t.win(2)) {
				System.out.println(".....Congo........Second Player is win the game");
				break;
			}
		}

		if (i == 4) {
			System.out.println("Sorry......game end......");
		}
	}
}
