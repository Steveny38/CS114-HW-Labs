//Steven Yan
//115780161

import java.util.Scanner;

public class Anagram {

	public static boolean anagram(String s1, String s2) {
		s1 = s1.toLowerCase().replaceAll(" " , "");
		s2 = s2.toLowerCase().replaceAll(" ", "");
		
		
		
		if(s1.length() != s2.length()) {
			return false;
		}
		
		for(int i = 0; i < s1.length(); i++) {
			char letter = s1.charAt(i);
			int index = s2.indexOf(letter);
			
			if( index == -1) {
				return false;
			}
			
			s2 = s2.substring(0,index) + s2.substring(index + 1);
			
			
		}
		
		return true;
		
		
		
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the first string");
		
		String str1 = input.nextLine();
		System.out.println("Enter the second string");
		String str2 = input.nextLine();
		
		if(anagram(str1, str2)) {
			System.out.println(str1 + " and " + str2 + " are anagrams");
		} else {
			System.out.println(str1 + " and " + str2 + " are NOT anagrams");
		}
		
		
	}

}
