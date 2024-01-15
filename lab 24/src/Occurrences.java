import java.util.Arrays;

public class Occurrences {

	public static void main(String[] args) {

			char[] chars = {'a','a','b','c','d','c','a'};
			
			System.out.println(count(chars,'a'));

	}

	public static int count(char[] chars, char ch) {
		if(chars.length == 0) {
			return 0;
		}
		return count(chars, ch, 0);
	}
	
	public static int count(char[] chars, char ch, int high) {
		if(chars[0]== ch ) {
			high += 1;
		}
		if(chars.length <=1 ) {
			return high;
		}
		
		return count(Arrays.copyOfRange(chars, 1, chars.length), ch, high);
		
	}
	
	
}
