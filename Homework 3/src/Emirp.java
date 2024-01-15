//Steven Yan
// 115780161
public class Emirp {

	public static boolean non_palindrome(int n) {
	
		String strNumber = Integer.toString(n);
		
		int middle = strNumber.length()/2;
		
		
		
		for(int i = 1; i< middle + 1; i++) {
			if( strNumber.charAt(i-1) == strNumber.charAt(strNumber.length()-i)) {
				return false;
			}
		}
		return true;
		
	}
	
	public static boolean prime(int n) {
		for(int i =2; i< n; i++) {
			if( n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		int count = 0;
		
		for(int i = 13; count < 100; i++) {
			if(non_palindrome(i)) {
				
				int reverse = 0;
				int number = i;
				
				while(number != 0) {
					int digit = number % 10;
					reverse = reverse * 10 + digit;
					
					number /= 10;
				}
				
				
				if(prime(i) && prime(reverse)) {
					System.out.print(i + " ");
					count++;
				}
			}
		}
		
		
		
	}

}
