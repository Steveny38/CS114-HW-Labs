
public class SequenceSum {

	public static double sum(int num) {
		double result = 0;
		
		for (int i = 1; i <= num; i++) {
			result += 1.0/i ;
		}
		return result;
	}
	
	public static void main(String[] args) {
		for ( int i = 1; i <= 10; i++) {
			System.out.println("Seq sum" + i + " = " + sum(i));
		}

	}

}
