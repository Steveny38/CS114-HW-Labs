//Steven Yan
//115780161

import java.util.Scanner;
public class SortRows {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a 3-by-3 matrix row by row:");
		
		double[][] matrix = new double[3][3];
		
		for(int i = 0; i < 3; i++) {
			for( int j = 0; j < 3; j++) {
				matrix[i][j]= input.nextDouble();
			}
		}
		
		
		for(double[] row: sortRows(matrix)) {
			for(double num: row) {
				System.out.print(num + " ");
			}
			System.out.println();
		}

	}
	
	public static double[][] sortRows(double[][] m){
		for(double[] col : m) {
			boolean check = true;
			while(check) {
				check = false;
				for(int i = 0; i < col.length-1; i++) {
					if(col[i] > col[i+1]) {
						double temp = col[i];
						col[i] = col[i+1];
						col[i+1] = temp;
						check = true;
					}
					
				}
			}
		}
		
		return m;
	}

}
