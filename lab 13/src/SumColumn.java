import java.util.Scanner;
public class SumColumn {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the dim of n x m matrix");
		int rows = input.nextInt();
		int cols = input.nextInt();
		
		System.out.printf("Enter the matrix of %d x %d matrix:  \n" , rows,cols);
		double[][] matrix = new double[rows][cols];
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				matrix[i][j] = input.nextInt();
			}
		}
		
		for(int j = 0; j < cols; j++) {
			System.out.println("The sums of the column are: " + sumColumn(matrix, j));
		}

	}
	

	public static double sumColumn(double [][] m, int c) {
		double total = 0;
		for(int i = 0; i< m.length; i++) {
			total += m[i][c];
		}
		
		return total;
	}

}
