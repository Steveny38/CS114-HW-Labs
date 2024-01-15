import java.util.Scanner;

public class CarInsurance {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter in the premium price of the auto insurance policy");
		
		double price = input.nextDouble();
		
		System.out.println("Please enter in the person's age");
		
		int age = input.nextInt();
		
		System.out.println("Please enter in either Male or Female for gender:");
		
		String gender = input.next();
		
		if (age <18) {
			System.out.println("-1.0");
		}
		
		if (age >= 18 && age < 21) {
			
			if(gender.equals("Male")) {
				System.out.println("Premium: " + price);
			} else if (gender.equals("Female")) {
				System.out.println("Premium: " + price * 0.9);
			}
			
		} 
		
		if ( age >= 21 && age < 30) {
			System.out.println("Premium: " + price * 0.75);
			
		}
		
		if(age >= 30 && age < 60) {
			if(gender.equals("Male")) {
				System.out.println("Premium: " + price * 0.6);
				
				
			}
			
			if (gender.equals("Female")) {
				System.out.println("Premium: " + price * 0.7);
			}
			
		}
		
		if( age >= 60) {
			System.out.println("Premium: "+ price);
		}
		
		

	}

}
