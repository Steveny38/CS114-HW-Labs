import java.util.Scanner;
public class ReversedString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter String: ");
		String word = input.nextLine();
		String reverse = "";
		for(int i = word.length()-1; i>= 0; i--) {
			reverse = reverse + word.charAt(i);
		}
		
		System.out.print(reverse);
		
		

	}

}
