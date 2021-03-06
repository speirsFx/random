package Array;

public class ValidSudoku {
	
//Not a good solution and also not tested	
	public static boolean columnCheck(char[][] board, char c, int row) {
		
		boolean check = true;
		
		for(int i = 0; i <9; i++) {
			if(board[row][i] == c && board[row][i] != '.') {
				check = false;
			}
		}
		
		return check;
		
		
	}
	
	public static boolean rowCheck(char[][] board, char c, int col) { 
		
		boolean check = true;
		
		for(int i = 0; i <9; i++) {
			if(board[i][col] == c && board[i][col] != '.') {
				check = false;
			}
		}
		
		return check;
	}
	
	
	public static boolean gridCheck(char[][] board, char c, int col, int row) {
		
		boolean check = true;
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++ ) {
				if(i != col && row != j && board[i + row%3][j + col%3] == c && c != '.') {
					check = false;
				}
			}
		}
		return check;
	}
	
    public boolean isValidSudoku(char[][] board) {
    	
    boolean result = true; 
    boolean r1 = true,r2 = true,r3 = true;    
    
    	for(int i = 0; i < 9; i++) {
    		for(int j = 0; j < 9; j++) {
    			if(board[i][j] != '.') {
    				r1 = gridCheck(board, board[i][j], i,j);
    				r2 = rowCheck(board, board[i][j], j);
    				r3 = columnCheck(board, board[i][j], i);
    				
    				
    			}
    			
    			if(r1 != true && r2 != true && r3 != true) {
    				result = false;
    				break;
    			}
    		}
    	}
    	
    	return result;
    }
	
}
