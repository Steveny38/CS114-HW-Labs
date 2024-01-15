import java.util.Scanner;
public class BusinessStats {

	public static double deviation(double[] x) {
		double mean = mean(x);
		double sumSquaredDifference = 0;
		
		for(double v: x) {
			sumSquaredDifference += Math.pow(v-mean,2);
		}
		return Math.sqrt(sumSquaredDifference/9);
	}
	
	public static double mean(double[] x) {
		double sum = 0;
		
		for(double v: x) {
			sum+= v;
		}
		return sum/10;
		
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 10 numbers: ");
		
		double[] numbers = new double[10];
		
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextDouble();
			
		}

		System.out.println("The mean is " + mean(numbers));
		System.out.println("The standard deviation is " + deviation(numbers));
		

	}

}
