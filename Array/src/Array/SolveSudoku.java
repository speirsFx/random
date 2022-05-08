package Array;

import java.util.HashSet;
import java.util.Set;

public class SolveSudoku {
	
	  public static boolean isValidSudoku(char[][] board) {
	        int n = board.length;
	        Set<Integer>[] rows = new Set[n];
	        Set<Integer>[] cols = new Set[n];
	        Set<Integer>[] blocks = new Set[n];
	        
	        for(int i = 0; i < n; i++) {
	            rows[i] = new HashSet<Integer>();
	            cols[i] = new HashSet<Integer>();
	            blocks[i] = new HashSet<Integer>();
	        }
	            
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {

	                if (board[i][j] == '.') continue;                
	                int k = 3 * (i /3) + (j / 3);
	                
	                int num = board[i][j] - '0';
	                if (rows[i].contains(num)) return false;
	                if (cols[j].contains(num)) return false;
	                if (blocks[k].contains(num)) return false;
	                
	                rows[i].add(num);
	                cols[j].add(num);
	                blocks[k].add(num);
	            }
	        }                
	        return true;
	  }

	public static boolean isValid(char[][] board, int row, int col, char c) {
		
		//row check
		for(int i = 0; i < 9; i++) {
			if(board[i][col] == c) {
				return false;
			}
			
			if(board[row][i] == c) {
				return false;
			}
			
			if(board[3*(row/3)+i/3][3*(col/3)+i%3] == c) {
				return false;
			}
		}
		
		return true;
	}
	
	  public static boolean solve(char[][] board) {
		   
		  for(int i = 0; i < 9; i++) {
			  for(int j = 0; j < 9; j++) {
				  if(board[i][j] == '.') {
					  for(char k = '1'; k <= '9'; k++) {
						 if(isValid(board,i,j,k) == true) {
							  board[i][j] = k;
						 
						  
						  if(solve(board) == true) {
							  return true;
						  }
						  else {
							  board[i][j] = '.';
							  
						  }}
					  }
					  return false;
				  }
			  }
		  }
		  return true;

	  }
	  
	  
	  public static void main(String[] args)
	  {
	  	char[][] board = new char[][] {
	        { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
	        { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
	        { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
	        { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
	        { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
	        { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
	        { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
	        { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
	        { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
	  	};

	  boolean s =	solve(board);
	  
	    for(char k = '1'; k < '9'; k++){
	        System.out.println("Hello, world!"+k); 
	      }
	  }

	  
	  
}





