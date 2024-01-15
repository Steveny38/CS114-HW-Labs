
public class Factorial {

	public static long Factorial(int num) {
		long result = 1;
		
		for(int i = 1; i <= num; i++) {
			result = result * i;
		}
		return result;
	}
	
	public static void main(String[] args) {
		for(int i = 1; i<= 10; i++) {
			System.out.println("Factorial " + i + " = " + Factorial(i));
		}

	}

}
