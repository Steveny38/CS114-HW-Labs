
public class ReverseDisplay {

	public static void main(String[] args) {
		reverseDisplay(12345);

	}
	
	public static void reverseDisplay(int num) {
		if(num < 10) {
			System.out.println(num);
			
		}
		
		else {
		System.out.print(num % 10);
		reverseDisplay(num / 10);
		}
		}
}
