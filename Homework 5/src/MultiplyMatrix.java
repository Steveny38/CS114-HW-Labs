//Steven Yan
//115780161
import java.util.Scanner;
public class MultiplyMatrix {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first 3 x 3 matrix");
		
		double[][] mA = new double[3][3];
		
		for(int row = 0; row < 3; row++) {
			for(int col = 0; col < 3; col++) {
				mA[row][col] = input.nextDouble();
				
			}
		}
		
		System.out.println("Enter the second 3 x 3 matrix");
		
		double[][] mB = new double[3][3];
		
		for(int row = 0; row < 3; row++) {
			for(int col = 0; col < 3; col++) {
				mB[row][col] = input.nextDouble();
				
			}
		}
		
		for(int row = 0; row < 3; row++) {
			for(int col = 0; col < 3; col++) {
				System.out.print(multiplyMatrix(mA,mB)[row][col] + " ");
				
				
			}
			System.out.println();		}

	}
	
	
	public static double[][] multiplyMatrix(double [][] a,double[][] b){
		int n = a.length; 
		double[][] c = new double[n][n];

		for(int i = 0;  i < n ; i++ ) {
			
			for( int k = 0; k < n; k++) {
				
				double total = 0;
				
				for(int j = 0 ; j < n; j++) {
					
					total += a[i][j] * b[j][k];
			
				}
				
				c[i][k] = total;
				
			}
	
		}
		
		return c;
		
		
	}
	
	

}
