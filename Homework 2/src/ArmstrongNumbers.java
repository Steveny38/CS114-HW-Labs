//Steven Yan
//115780161
import java.util.Scanner;
public class ArmstrongNumbers {

	public static int exponent(int number, int exponent) {
		int dumNum = number;
		for(int i =1; i<exponent; i++ ) {
			dumNum = dumNum * number;
		}
		return dumNum;
		
	}
	
	public static boolean isArmstrong(int number, int numberLength ) {
		int sum = 0;
		int dumNum = number;
		for(int i =0; i < numberLength; i++) {
			sum += exponent(dumNum%10, numberLength);
			dumNum = dumNum/10;
			
			
		}
		

		
		if(sum == number) {
			return true;
		} else { return false;}
		
	}

	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the lower limit: ");
		int lowerLimit= input.nextInt();
		System.out.println("Enter the upper limit: ");
		int upperLimit = input.nextInt();
		
		System.out.print("The Armstrong numbers between " +lowerLimit +" and " + upperLimit +" are: ");
		for(int i = lowerLimit; i< upperLimit; i++) {
			if(isArmstrong(i, Integer.toString(i).length()) == true) {
				System.out.print(i + " ");
			}
		}
	}

}
