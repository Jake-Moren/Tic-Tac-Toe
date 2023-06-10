// Programmer: Jake Moren
// Class: CS 145 OL
// Date: 06/05/2023
// Assignment: Assignment 3 Freedom File  
// Reference Material: CS145 Quarter
// Purpose: To practive elements CS elements gone over during the quarter
// File Purpose: This file is suppose to format the board that will represent the tic tac toe board

import java.util.*;
public class TicTacToeBoard 
{
	public static void printBoard(String[] board)
	{
   /*This method is using print statements that represent a tic tac toe board. 
   Within the boxes formed there are placeholders from the board array the array spands from 1-9.
   The user will be an x or an o and will replace the place holder with there symbol. 
   The Game.java will be checking to see if one of the players can get a three in a row.
   If the three in a row is met then that user will win. If it is not met then there will be 
   no winners. Or in other words a tie! 
   */
		System.out.println("|---|---|---|");
		System.out.println("| " + board[0] + " | "
						+ board[1] + " | " + board[2]
						+ " |");
		System.out.println("|-----------|");
		System.out.println("| " + board[3] + " | "
						+ board[4] + " | " + board[5]
						+ " |");
		System.out.println("|-----------|");
		System.out.println("| " + board[6] + " | "
						+ board[7] + " | " + board[8]
						+ " |");
		System.out.println("|---|---|---|");
   }//end of print board method
}//end of TicTacToeBoard Class