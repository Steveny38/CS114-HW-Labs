
public class SumDigits {

	public static void main(String[] args) {
		System.out.println(sumDigits(1234));

	}
	public static int sumDigits(long num) {
		if(num == 0) {
			return 0;
		}
		return (int) (sumDigits(num/10) + num %10);
		
	}
	
	public static int sumDigitsHelper( int num, int rem) {
		if(num ==0) {
			return num;
		}
		
		else {
			return sumDigitsHelper((int)(num + rem%10), rem/10);
		}
	}

}
