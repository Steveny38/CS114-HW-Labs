
public class ReverseNumber {

	public static void main(String[] args) {
		System.out.println(reverseNumber(1234));

	}
	
	public static int reverseNumber(int num) {
		return reverseNumberHelper(0,num);
		
	}
	public static int reverseNumberHelper(int curr, int rem) {
		if( rem == 0) {
			return curr;
		}
		return reverseNumberHelper(curr * 10 + rem % 10, rem /10);
	}

}
