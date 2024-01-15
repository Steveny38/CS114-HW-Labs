import java.util.Scanner;
public class CountVowelsAndConstants {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String inputStr = input.nextLine();
		
		int vowels = 0;
		int conso = 0;
		
		for(int i =0; i< inputStr.length(); i++) {
			if(inputStr.charAt(i) == ('a')||inputStr.charAt(i) == ('e')||inputStr.charAt(i) == ('i')||inputStr.charAt(i) == ('o')||inputStr.charAt(i) == ('u')) {
				vowels++;
			} else if(inputStr.charAt(i) == ' '){
				continue;
			} else
			{
				conso++;
			}
		}
		System.out.println("The numbe of vowels is " + vowels);
		System.out.println("The numbe of consonants is " + conso);
		

	}

}
