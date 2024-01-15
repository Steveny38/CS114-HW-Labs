//Steven Yan
//115780161
import java.util.Scanner;

public class Pyramid {
	
	
	 

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input number of lines");
		
		int lines = input.nextInt();
		
		lines++;
		
		for( int i = 1; i <= lines; i++) {
			int x = 1;
			
			for (int y = 1; y < lines -1; y++) {
				System.out.println(" ");
			}
			
			for( int j = 1; j < i; j++) {
				System.out.print(" " + x);
				x *= 2;
			}
			x /= 2;
			
			for ( int n =2; n < i; n++ ) {
				x/= 2;
				System.out.print(" " + x);
				
			}
	
			
		}

	}

}
