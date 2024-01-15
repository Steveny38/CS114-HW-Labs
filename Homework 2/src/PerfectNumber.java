//Steven Yan
//115780161

import java.util.Scanner;
public class PerfectNumber {

	public static boolean method(int number) {
		int sum = 0;
		for( int i =1; i< number; i++) {
			if(number %i ==0 ) {
				sum+= i;
			}
			
		}
		
		if(sum == number) {
			return true;
		} else { return false;}
	}

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the upper limit: ");
		
		
		int number = input.nextInt();
		
		if(number <=5 ) {
			System.out.print("There the perfect numbers below " +number+ " are: 1"  );
		} else {
			System.out.print("The perfect numbers below " +number +" are: ");
			for(int i = 1; i <= number; i++) {
				if(method(i) == true) {
					System.out.print(i + " ");
				} 
			}
		}
		
		
		
	}

}
