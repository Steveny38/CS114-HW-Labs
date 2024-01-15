import java.util.Scanner;

public class CalculateRunnerSpeed {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input the distance in miles");
		double  miles = input.nextDouble();
		
		System.out.println("Input the time in minutes");
		
		int minutes = input.nextInt();
		
		double avgSpeed = miles/(minutes/60.0);
		
		System.out.println("Speed: " + avgSpeed);

	}

}
