import java.util.Scanner;

public class GasRefillCalculator {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the distance");
		double dist = input.nextDouble();
		
		System.out.println("Enter the mph");
		
		double mph = input.nextDouble();
		System.out.println("Enter the price");
		double price = input.nextDouble();
		
		double total = (dist/mph) * price;
		
		System.out.println("Price for the trip:" + total);

	}

}
