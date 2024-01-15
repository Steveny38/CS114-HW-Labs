import java.util.Scanner;

public class PremiumAirlines {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Membership (Diamond/Platinum/Regular): ");
		
		String memb = input.next();
		
		
		
		System.out.println("Price");
		
		int price = input.nextInt();
		
		System.out.println("Points");
		
		int points = input.nextInt();
		
		if(memb.equals("Diamond")) {
			
		
			
			if( price >= 5000) {
				System.out.println("Points: " + (points + 35));
				System.exit(0);
				
				
			}
			
			else if( price >= 2000 && points > 300) {
				System.out.println("Points: " + (points + 30));
				System.exit(0);
			}
			
			else if( price >= 500 && points > 100) {
				System.out.println("Points: " + (points + 10));
				System.exit(0);
			}
			
			else if( points >= 25) {
				System.out.println("Points: " + (points + 2));
				System.exit(0);
			}
			
		}
		
		if(memb.equals("Plantinum")) {
			if (price >= 5000) {
				System.out.println("Points: "+ ( points + 35));
				System.exit(0);
			}
			
			else if( price >= 2000) {
				System.out.println("Points: " +( points + 20));
				System.exit(0);
			}
			
		} 
		
		if (memb.equals("Regular") && price >= 5000) {
			System.out.println("Points: " + (points + 5));
			System.exit(0);
		}
		
		else {
			System.out.println("Points: "+ points);
			System.exit(0);
		}
	
		
		

	}

}
