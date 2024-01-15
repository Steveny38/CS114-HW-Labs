import java.util.Scanner;
public class ReverseNumber {
	
	public static Integer reverseNumber(int num) {
		String numString = num + "";
		String out = "";
		for(int i = numString.length()-1; i >= 0; i--) {
			out+= numString.charAt(i);
		}
		
		return Integer.valueOf(out);
	}
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer");
		System.out.println(reverseNumber(input.nextInt()));

	}

}
