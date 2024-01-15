//Steven Yan
//115780161
import java.util.Scanner;
public class Interests {


	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Loan Amount: ");
		
		double loanAmount = input.nextDouble();
		
		System.out.println("Number of Years: ");
		
		int numberOfYears = input.nextInt();
		
		
		
		
		 System.out.println("Interest Rate \t Monthly Payment\tTotal Payment");
		
		for (double r = 5.000; r <= 8.000; r+= 0.125){
			double monthlyInterestRate = r / 1200;
			double monthlyPayment = loanAmount * monthlyInterestRate / (1 -
			(Math.pow(1 / (1 + monthlyInterestRate), numberOfYears * 12)));
			double totalPayment = monthlyPayment * numberOfYears * 12;
			System.out.printf("%.3f%%  %.2f  %.2f\n", r,
			monthlyPayment, totalPayment);
		}


	}

}
