//Steven Yan
//115780161
import java.util.Scanner;
public class LongestCommonPrefix {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the first string:");
		
		String first = input.nextLine();
		
		System.out.println("Enter the second string: ");
		
		String second = input.nextLine();
		
		if(first.length() > second.length()) {
			String temp = first;
			first = second;
			second = temp;
		}
		
		if(first.charAt(0) != second.charAt(0)) {
			System.out.print(first + " and " + second +" share no common prefix");
		}	else {
				for(int i = 0; i < first.length(); i++) {
					if(first.charAt(i) == second.charAt(i)) {
						System.out.print(first.charAt(i));
					} else {
						break;
					}
					
				}			
		}
			

		

	}

}
