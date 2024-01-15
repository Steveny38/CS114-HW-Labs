//Steven Yan
//115780161

import java.util.Scanner;
public class BinaryToDecimal {
	
	public static int exp2(int power ) {
		int number = 1;
		
		if(power == 0) {
			return number;
		}
		
		for(int i = 0; i< power; i++) {
			number *= 2;
		}
		return number;
	}
	
	public static int bin2Dec(String binaryString) {
		
		int length = binaryString.length();
		int solution = 0;
		
		
		
		for(int i = 0; i < length; i++) {
			if(binaryString.charAt(i) == '1') {
				solution += exp2(length-1 - i);
			}
		}
		
		return solution;
		
		
		
		
	}

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter binary: ");
		
		String binary = input.nextLine(); 
		
		System.out.println("Decimal: " + bin2Dec(binary));
	
	}

}
