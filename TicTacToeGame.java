// Programmer: Jake Moren
// Class: CS 145 OL
// Date: 06/05/2023
// Assignment: Assignment 3 Freedom File  
// Reference Material: CS145 Quarter
// Purpose: To practive elements CS elements gone over during the quarter
/* File Purpose: The purpose of this file is to house the methods that will be called in the main.
   The methods housed in this file will be the game aspects of tic tac toe. 
*/

import java.util.*;
public class TicTacToeGame {
   private static String[] board;//init an array to make number for the bord
   private static String turn;
   private static String checkWinner() {
      for (int a = 0; a < 8; a++) {
         String line = null;
         //for loop checks for winners in the possible variations
         switch (a) {//this switch is putting together different possible cominations of the array 
         //these possible combinations represent the different ways one can get a three in a row 
            case 0://cases 0-2 represent hoizont 3 in a row
               line = board[0] + board[1] + board[2];
               break;
            case 1:
               line = board[3] + board[4] + board[5];
               break;
            case 2:
               line = board[6] + board[7] + board[8];
               break;
            case 3://cases 3-5 represent the vertical 3 in a row
               line = board[0] + board[3] + board[6];
               break;
            case 4:
               line = board[1] + board[4] + board[7];
               break;
            case 5:
               line = board[2] + board[5] + board[8];
               break;
            case 6://cases 6 and 7 for a diagnol 3 in a row
               line = board[0] + board[4] + board[8];
               break;
            case 7:
               line = board[2] + board[4] + board[6];
               break;
         }//end of switch case 
         //For X winner
         if (line.equals("XXX")) {
            return "X";
         }//end of else statement to see if X wins

         // For O winner
         else if (line.equals("OOO")) {
            return "O";
         }//end of else to see if O wins
      }//end of for statement that checks for every winning variation for X and for O

      for (int a = 0; a < 9; a++) {
         if (Arrays.asList(board).contains(
               String.valueOf(a + 1))) {//if statement is checking if there is an empty spot 
            break;//if there is then the game continues 
         }//end of check to see if there is an empty position on the board
          else if (a == 8) {
            return "draw";//if there is not and no one has won then it is a tie
         }//end of else if to check for a drawed game
      }//end of for loop to check if game is still going 

      // To enter the X Or O at the exact place on board.
      System.out.println(
         turn + "'s turn; enter a slot number to place " +
         turn + " in:");
      return null;
   }//print statement to tell which players is habing their turn then placing the symbol 
   public static void playGame() {
      Scanner in = new Scanner(System.in);//scanner for taking in inputs by the user
      board = new String[9];
      turn = "X";
      String winner = null;
      //the turn will always start with the x 
      //the play game will make a new board that will be "empty"
      for (int a = 0; a < 9; a++) {
         board[a] = String.valueOf(a + 1);
      }//just making a for loop for the amount of turns that will be had during the round played

      System.out.println("Welcome to 3x3 Tic Tac Toe.");
      TicTacToeBoard.printBoard(board);
      //prints out statement for user then prints the board out by pulling from other java files
      System.out.println(
         "X will play first. Enter a slot number to place X in:");
      //first part of instructions
      while (winner == null) {
      //will run when there is no winner
      //method loop used for crash protection
         int numInput;
                 try {
            numInput = in.nextInt();
            if (!(numInput > 0 && numInput <= 9)) {
               System.out.println(
                  "Invalid input; re-enter slot number:");
               continue;
            }
         } catch (InputMismatchException e) {
            System.out.println(
               "Invalid input; re-enter slot number:");
            continue;
         }//this is keeping the game form crashing and repromting the user when a wrong input -
         // or repeat input is given

         
         if (board[numInput - 1].equals(
               String.valueOf(numInput))) {
            board[numInput - 1] = turn;

            if (turn.equals("X")) {
               turn = "O";//if it was x's turn then its O's turn
            } else {
               turn = "X";//if not then its x's turn 
            }

            TicTacToeBoard.printBoard(board);
            winner = checkWinner();
         }//end of if statement that houses logic to decide next turn for game
          else {
            System.out.println(
               "Slot already taken; re-enter slot number:");
         }//end of else when user inputs a slot already taken
      }//end of while loop that runs when there is no winner
      //if for when the game is not won by anyone
      if (winner.equalsIgnoreCase("draw")) {
         System.out.println(
            "It's a draw! Thanks for playing.");
      }//end of if where game ends in draw
      // to display a winning message
      else {
         System.out.println(
            "Congratulations! " + winner +
            "'s have won! Thanks for playing.");
      }//end of else where someone wins
   }//end of play game method 
}//end of class