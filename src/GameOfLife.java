import java.util.*;
public class GameOfLife 
{	
	public void gameOfLife(int[][] board) 
	{
		//next board
		int[][] nextBoard = new int[board.length][board[0].length];
		
		//loop over the current board
		for(int y = 0; y < board.length; y++)
		{
			for(int x = 0; x < board[y].length; x++)
			{
				//get current cell info
				int cell = board[y][x];
				boolean alive = cell == 1;
				
				//get info of neighbors
				int aliveNeighbors = 0;
				for(int column = y - 1; column < y + 2; column++)
				{
					for(int row = x - 1; row < x + 2; row++)
					{
						//check to see if the target neighbor exists
						if(row >= 0 && column >= 0 && row < board[y].length && column < board.length && !(column == y && row == x))
						{
							if(board[column][row] == 1)
							{
								aliveNeighbors++;
							}
						}
					}
				}
				
				if(alive)
				{
					if(aliveNeighbors < 2)
					{
						alive = false;
					}
					else if(aliveNeighbors == 2 || aliveNeighbors == 3)
					{
						alive = true;
					}
					else if(aliveNeighbors > 3)
					{
						alive = false;
					}
				}
				else
				{
					if(aliveNeighbors == 3)
					{
						alive = true;
					}
				}
				
				int state = 0;
				if(alive)
				{
					state = 1;
				}
				
				nextBoard[y][x] = state;
			}
		}
		
		//Tester.printMatrix(nextBoard);
		//board = nextBoard;
		
		//set the board to the nextBoard
		for(int y = 0; y < board.length; y++)
		{
		    for(int x = 0; x < board[y].length; x++)
		    {
		        board[y][x] = nextBoard[y][x];
		    }
		}
		
	}
}
