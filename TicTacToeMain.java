// Programmer: Jake Moren
// Class: CS 145 OL
// Date: 06/05/2023
// Assignment: Assignment 3 Freedom File  
// Reference Material: CS145 Quarter
// Purpose: To practive elements CS elements gone over during the quarter
/* File Purpose:The purpose of this file to call the needed methods that are housed in other files.
   The file is also suppose to house a for loop that will allow the users to play over and over 
   and over again until they wish to stop. 
*/

import java.util.*;
public class TicTacToeMain 
{//this class will just hold the main method because it is a main class
 //(calling on methods from other classes)
   public static void main(String[] args)
   {//this method call the methods needed to run the game and keep it running untill told to quit
      Scanner scannerObject = new Scanner(System.in);//make scanner
      TicTacToeGame.playGame();//run game that is made in other java file/class
      System.out.println("Would you like to play again?");//prompt user with qustion
      String userInput = scannerObject.nextLine();//take in user input with help of scanner
      while(userInput.equals("yes") ||userInput.equals("y"))
      {//while loop to run the game and ask again to keep loop running
         TicTacToeGame.playGame();//plays game agian if they input y or yes
         System.out.println("Would you like to play again?");//asks again to continue or end loop
         userInput = scannerObject.nextLine();//take in user inputs
      }//end of while loop
      System.out.println("Thank you for playing!");
   }//end of main method
}//end of class