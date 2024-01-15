
public class ApproximatePI {

	public static void main(String[] args) {
		for(int i = 1000; i<= 100000; i+= 10000) {
			System.out.println("i = " + " PI approximate: " + calculatePi(i) );
		}

	}
	
	public static double calculatePi(int it) {
		double pi = 0;
		for (int i = 1; i < it; i++) {
			pi += 4.0 * (Math.pow(-1, i+1)/(2.0 * i-1));
		}
		
		return pi;
	}

}
