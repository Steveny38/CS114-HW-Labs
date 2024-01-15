import java.util.Scanner;
public class CharacterCount {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String str = input.nextLine();
		System.out.println("Enter a character");
		char a = input.next().toLowerCase().charAt(0);
		System.out.printf("The string %s has %d %c", str, count(str.toLowerCase(),a), a);
		
	}
	
	public static int count(String str, char a) {
		int counter = 0;
		for (int i =0; i < str.length(); i++) {
			if(str.charAt(i) == a) {
				counter++;
			}
		}
		return counter;
	}

}
