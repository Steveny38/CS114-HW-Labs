import java.util.Random;
public class RandomMatrix {

	public static void main(String[] args) {
		Random rand = new Random();
		int[][] board = new int[8][8];
		for(int i = 0; i< board.length; i++) {
			for(int j = 0; j < board[0].length; j++ ) {
				board[i][j] = rand.nextInt(2);
				System.out.print(board[i][j] + " ");
			}
		System.out.println();
		}
		
		checkRow(board, 0);
		checkRow(board, 1);
		checkCol(board, 0);
		checkCol(board, 1);
		checkMajorDiagonal(board, 0);
		checkMajorDiagonal(board, 1);
		checkMinorDiagonal(board, 0);
		checkMinorDiagonal(board, 1);

	}
	public static void checkMinorDiagonal( int[][] board, int check) {
		boolean allSame = true;
		for(int i = board.length-1; i>= 0; i--) {
			if(board[board.length-i-1][i] != check) {
				allSame = false;
				break;
			}
		}
		if(allSame) {
			System.out.printf("All %d on the minor diagonal. \n", check);
		}
	}
	
	public static void checkMajorDiagonal(int[][] board, int check) {
		boolean allSame = true;
		for(int i = 0; i < board.length; i ++) {
			if(board[i][i] != check) {
				allSame = false;
				break;
				
			}
			
		}
		if(allSame) {
			System.out.printf("All %d on the major diagonal. \n", check);
		}
	}
	
	public static void checkCol ( int[][] board, int check) {
		boolean allSame = true;
		for(int j = 0; j< board[0].length; j ++) {
			allSame = true;
			
			for(int i = 0; i < board.length; i++) {
				if(board[i][j] != check) {
					allSame = false;
					break;
				}
			}
		}
	}

	public static void checkRow( int[][] board ,int check) {
		boolean allSame = true;
		for(int i = 0; i < board.length; i++) {
			allSame = true;
			for(int j = 0; j< board[i].length; j++) {
				if(board[i][j] != check ) {
					allSame = false;
					break;
				}
			}
			if(allSame) {
				System.out.printf("All %d on row %d. \n", check, i);
			}
			
			
			
		}
	}
}
