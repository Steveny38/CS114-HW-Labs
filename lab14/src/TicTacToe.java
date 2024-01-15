import java.util.Scanner;
public class TicTacToe {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		char[][] board = {
				{'-', '-', '-'},
				{'-', '-', '-'},
				{'-', '-', '-'}
				};
		
		int state = 0;
		int turn = 1;
		int row, col;
		boolean finish = false;
		char token;
		while(!finish) {
			printBoard(board);
			System.out.println("Player" + turn +" turn");
			System.out.println("Enter row and column position");
			row = input.nextInt();
			col = input.nextInt();
			updateBoard(board, row, col, turn);
			if(turn %2== 1) token = 'x';
			else token = 'O';
			state = checkBoard(board, token);
			if(state != 0 || turn ==0) {
				finish = true;
			}
			turn += 1;
					
			
		}
		if (state == 0) System.out.println("Tie");
		else if(state ==1) System.out.println("P1 wins");
		else if( state == 2) System.out.println("P2 wins");
		
	}
	
	public static void printBoard( char[][] board) {
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[0].length; j++) {
				System.out.print(board[i][j]);
			}
		}
		System.out.println();
	}
	
	public static void updateBoard(char[][] board, int row, int col, int turn) {
		char token = '-';
		switch(turn) {
		case 1:
			token = 'x';
			break;
		case 2:
			token = 'O';
			break;
		default:
			System.out.println("Something went wrong");
		}
		board[row][col] = token;
	}
	
	public static int checkBoard(char[][] board, char token) {
		int check= 0;
		check = checkRow(board, token);
		if(check != 0) {
			return check;
		}
		check = checkCol(board, token);
		if(check!=0) {
			return check;
		}
		
	}
	
	public static int checkRow(char[][] board, char token) {
		boolean  check = true;
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j< board.length; j++) {
				if(board[i][j] != token) {
					check = false;
					break;
				}
			}
		}
		if(check) {
			if(token == 'x') return 1;
			else if(token == 'O') return 2;
		}
		return 0;
	}public static int checkCol(char[][] board, char token) {
		boolean  check = true;
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j< board.length; j++) {
				if(board[j][i] != token) {
					check = false;
					break;
				}
			}
		}
		if(check) {
			if(token == 'x') return 1;
			else if(token == 'O') return 2;
		}
		return 0;
	}
	public static int checkMajor(int[][] board, char token) {
		boolean check = true;
		
		for(int i = 0; i < board.length; i++) {
			if(board[i][i] != token) {
				check = false;
			}
		}
		if(check) {
			if(token == 'x') return 1;
			else if(token == 'O') return 0;
			
		}
		return 0;
	}
	public static int checkMinor(int[][] board, char token) {
		boolean check = true;
		for(int i = board.length-1; i >= 0; i--) {
			for(int j = 0; j < board.length; j++) {
				if(board[i][j] != token) {
					check = false;
				}
			}
		}
		if(check) {
			if(token == 'x') return 1;
			else if( token == 'O') return 2;
		}
		return 0;
		
	}

}
