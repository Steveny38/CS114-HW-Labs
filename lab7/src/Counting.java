import java.util.Scanner;
public class Counting {

	public static void main(String[] args) {
		int negatives = 0;
		int positives= 0;
		double total = 0;
		int intInput = 0;
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter any number of integers. Enter 0 to stop");
		
		do {
			intInput = input.nextInt();
			if(intInput > 0) {
				positives += 1;
			} else if(intInput < 0) {
				negatives += 1;
			}
			total += intInput;
			
			
		} while(intInput != 0);
		
		System.out.println("Number of positives: "+ positives);
		
		System.out.println("Number of negatives: "+ negatives);
		System.out.println("Total: " + total);
		System.out.println("Average: "+ total/(negatives+positives));
		
		

	}

}
