import java.util.Scanner;

public class DecimalToBinary {

	public static String dec2Bin(int value) {
		String binary = "";
		int dumVal = value;
		while(dumVal > 0) {
			binary = ((dumVal % 2)+"")+ binary ;
			dumVal /= 2;
		}
		
		return "(" + binary+ ")_2";
		
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter decimal: ");
		int dec = input.nextInt();
		
		System.out.println("Binary: " + dec2Bin(dec));
		

	}

}
