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
/**
   A 3 x 3 tic-tac-toe board.
*/
public class TicTacToe
{
   private String[][] board;
   private static final int ROWS = 3;
   private static final int COLUMNS = 3;

   /**
      Constructs an empty board.
   */
   public TicTacToe()
   {
      board = new String[ROWS][COLUMNS];
      // Fill with spaces
      for (int i = 0; i < ROWS; i++)
         for (int j = 0; j < COLUMNS; j++)
            board[i][j] = " ";
   }
   
   public boolean isBoardFilled() {
	   boolean isFilled = true;
	   
	   for(int i= 0; i<3; i++) {
		for(int j=0; j<3; j++) {
			if (board[i][j]=="") {
				isFilled = false;
			}
			
		}
   }
	   return isFilled;
   }

   /**
      Sets a field in the board. The field must be unoccupied.
      @param i the row index 
      @param j the column index 
      @param player the player ("x" or "o")
   */
   public void set(int i, int j, String player, String winner)
   {
      if (board[i][j].equals(" "))
         board[i][j] = player;
   }
   
   	
   	public String getWinner()
   		{
   		String winner = "";
   			if (board[0][0].equals(board [0][1]) && 
   				board[0][1].equals(board[0][2]) && 
   				!board[0][0].equals(""))
   				{
   				winner=board[0][0];
   				}
   			
   			if(board[1][0].equals(board [1][1]) &&
   				board[1][1].equals(board[1][2]) &&
   				!board[0][0].equals(""))
   				{
   				winner=board[0][0];
   				}
   			
   			if(board[2][0].equals(board [2][1]) &&
   				board[2][1].equals(board [2][2]) &&
   				!board[0][0].equals(""))
   				{
   				winner=board[0][0];
   				}
   			
   			if(board[0][0].equals(board [1][1]) &&
   				board[0][2].equals(board[2][2]) &&
   				!board[0][0].equals(""))
   				{
   				winner=board[0][0];
   				}
   			
   			if(board[0][1].equals(board [1][1]) &&
   				board[2][1].equals(board [1][0]) &&	
   				!board[0][0].equals(""))
   				{
   				winner=board[0][0];
   				}
   			
   			
   			return winner;
   		}

   			
   			
   		

   /**
      Creates a string representation of the board, such as
      |x  o|
      |  x |
      |   o|
      @return the string representation
   */
   public String toString()
   {
      String winner = "";
      for (int i = 0; i < ROWS; i++)
      {
         winner = winner + "|";
         for (int j = 0; j < COLUMNS; j++)         
            winner = winner + board[i][j];
         winner = winner + "|\n";
         System.out.println("The winner is " + "x");
      }
      return winner;
   }


	
}

