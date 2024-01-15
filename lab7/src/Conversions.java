import java.util.Scanner;
public class Conversions {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String option;
		
		while(true) {
			displayMenu();
			System.out.println("Enter your option: ");
			option = input.next();
			
			switch(option) {
				case "A":
					System.out.println("Enter a quanitity in pounnds: ");
					double pounds = input.nextDouble();
					System.out.printf("%.2f pounds is %.4f kgs\n", pounds,pounds*.453592);
					break;
					
				case "B":
					System.out.println("Enter a quanitity in kilos: ");
					double kilos = input.nextDouble();
					System.out.printf("%.2f pounds is %.4f kgs\n", kilos ,kilos/.453592);
					break;
				case "C":
					System.out.println("Enter a distance in kilometers: ");
					double kilometers = input.nextDouble();
					System.out.printf("%.2f kilometers is %.4f miles \n", kilometers,kilometers *.621371);
					break;
					
				case "D":
					System.out.println("Enter a distance in miles: ");
					double mi = input.nextDouble();
					System.out.printf("%.2f miles is %.4f kilometers\n", mi,mi/.621371);
					break;
				
				case "E":
					System.out.println("Enter a temperature in celsius: ");
					double celsius = input.nextDouble();
					System.out.printf("%.2f celsius is %.4f fahrenheit\n", celsius, ((celsius*9/5)+32));
					break;
				
				case "F":
					System.out.println("Enter a temperature in fahrenheit: ");
					double fah = input.nextDouble();
					System.out.printf("%.2f fahrenheit is %.4f celsius \n", fah,(5/9)*(fah-32));
					break;
				case "G":
					System.out.println("Goodbye!");
					return;
					
				default:
					System.out.println("Invalid Option!");
					break;
			}	
		}
		
	}

	
	public static void displayMenu() {
		System.out.println("A - convert pounds to kilos\r\n"
				+ "B - convert kilos to pounds\r\n"
				+ "C - convert kilometers to miles\r\n"
				+ "D - convert miles to kilometers\r\n"
				+ "E - convert Celsius to Fahrenheit\r\n"
				+ "F - convert Fahrenheit to Celsius\r\n"
				+ "G - Exit");
		
	}
}
