import java.util.Scanner;
public class ReverseDisplay {

	public static void reverseDisplay(int num) {
		String numString = num + "";
		String returnString = "";
		for(int i = numString.length() - 1 ; i >= 0; i--) {
			returnString += numString.charAt(i);
		}
		
		System.out.println(returnString);
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter integer");
		
		int num = input.nextInt();
		
		reverseDisplay(num);
		

	}

}
