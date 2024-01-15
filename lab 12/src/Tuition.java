
public class Tuition {

	public static void main(String[] args) {
		double tuition = 10000;
		double totalcost = 0;
		double tenyears = 0;
		for(int i = 1; i<= 14; i++) {
			tuition *= 1.05;
			if(i == 10) {
				tenyears=tuition;
			
			}
			if(i>10) {
				totalcost += tuition;}
			}
		System.out.printf("Tuition:  $%.2f\n", tenyears);
		System.out.printf("Total Cost:  $%.2f", totalcost);
		

	}

}
