import java.util.Scanner;
public class test {

	 
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int lines = input.nextInt();
		
		for(int i = 1; i <= lines; i++) {
			
			for(int x = i; x<= lines; x++) {
				System.out.print(x);
			}
			
			for(int y = lines-1; y >= i; y-- ) {
				System.out.print(y);
			}
			System.out.println(".");
			
		}


	}

}
