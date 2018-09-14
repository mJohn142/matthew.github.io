/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

/**
 *
 * @author HP-
 */
import java.util.Scanner;

/**
   This program runs a TicTacToe game. It prompts the
   user to set positions on the board and prints out the
   result.
*/
public class TicTacToeRunner
{
   public static void main(String[] args)
   {
	   int row, column;
	String chance = null;
      Scanner in = new Scanner(System.in);
      String player = "x";
      TicTacToe game = new TicTacToe();
      boolean done = false;
      while (!done)
      {
         System.out.print(game.toString()); 
         System.out.print(
               "Row for " + player + " (-1 to exit): ");
         do {
        	  row = in.nextInt();
         }
         while(row<0 || row>2);
         
         
         {
            System.out.print("Column for " + player + ": ");
            do {
            	 column = in.nextInt();
            }
            while(column<0 || column>2);
      
         
            game.set(row, column, player, chance);
            if (player.equals("x")) 
               player = "o"; 
            else 
               player = "x";
            
       
          
            	
            		
            	
            	
            	
            }
         }
      }
   }


