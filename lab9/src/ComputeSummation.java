
public class ComputeSummation {

	public static void main(String[] args) {
		System.out.println("i		m(i) ");
		for (int i = 1; i<= 20; i++) {
			System.out.printf("%d 		%.4f\n ", i , summation(i));
		}
		

	}
	
	public static double summation(int i) {
		double total = 0;
		for(double  j = 1; j<= i; j++) {
			total += j / (j+1);
			
		}
		return total;
	}

}
