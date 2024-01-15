import java.lang.reflect.Array;
import java.util.Scanner;
public class DistinctNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter numbers: ");
		
		int[] numbers = new int[10];
		int [] distinctNumbers = new int[10];
		int distinctCount = 0;
		for(int i = 0; i< 10; i++) {
			numbers[i] = input.nextInt();
		}
		
		for(int i = 0; i < 10; i++) {
			if(!isInArray(distinctNumbers, numbers[i])) {
				distinctNumbers[distinctCount] = numbers[i];
				distinctCount ++;
			}
		}
		System.out.println("Unique Numbers: ");
		for(int i = 0; i < distinctCount; i++) {
			System.out.print(distinctNumbers[i] + "" );
			
			
		}
		
		
		
		
		
		
		
		
		
		
	}
	
	public static boolean isInArray(int[] array, int number) {
		for(int i = 0; i < array.length; i++) {
			if(array[i] == number) {
				return true;
			}
		}
		return false;
		
		
		
	}

}
