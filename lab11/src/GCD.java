import java.util.Scanner;
public class GCD {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the first integer: ");
		int first = input.nextInt();
		
		System.out.println("Enter the second integer: ");
		int second = input.nextInt();
		
		
		int third = 0;
		while(second !=0) {
			third = second;
			second= first % second;
			first = third;
		}
		
		
		System.out.println("GCD is:  "+ first);
		
	}

}
