//Steven Yan
//115780161

import java.util.Scanner;
public class Palindrome {
	
	public static boolean isPal(String word) {
		
		word = word.toLowerCase().replaceAll(" ","");
		System.out.println(word);
		int middle = word.length()/2;
		
		for( int i = 1; i < middle+1; i++) {
			if(word.charAt(i-1) != word.charAt(word.length()-i)) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the input string");
		String word = input.nextLine();
		
		if(isPal(word)) {
			System.out.println("Input string " + word + " is a palindrome");
		} else {
			System.out.println("Input string " + word + " is NOT a palindrome");
		}
		
		
		

	}

}
