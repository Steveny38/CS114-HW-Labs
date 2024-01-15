import java.util.Scanner;

public class SumDigit {

	public static int sumDigits(int num) {
		int output = 0;
		
		while(num != 0) {
			output += num % 10;
			
			num = num / 10;
		}
		
		return output;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter int");
		
		System.out.println(sumDigits(input.nextInt()));
	}

}
