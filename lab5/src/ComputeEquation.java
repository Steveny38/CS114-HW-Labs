import java.util.Scanner;

public class ComputeEquation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the first value: ");
		double x = input.nextDouble();
		
		System.out.println("Enter the second value:");
		
		double y = input.nextDouble();
		
		double result =  x/(y - 3*x) + (x-1)/(y/(x+1));
		
		System.out.println("Equation Value: " + result);
		
		
	}

}
