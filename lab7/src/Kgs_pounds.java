
public class Kgs_pounds {

	public static void main(String[] args) {
		final double POUNDS_PER_KG = 2.2;
		
		System.out.printf("%-12s%s-8s%-8s%-12s\n", "Kilograms", "Pounds", "Pounds", "Kilograms");
		for( int kgs = 1, lbs = 20; kgs <= 199 && lbs <= 515; kgs +=2 , lbs += 5 ) {
			
			System.out.printf("%-12s%s-8s%-8s%-12s\n", kgs,kgs * POUNDS_PER_KG, lbs, lbs/POUNDS_PER_KG);
			
		}

	}

}
