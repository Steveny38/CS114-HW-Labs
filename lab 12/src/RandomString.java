import java.util.Random;
import java.util.Scanner;
public class RandomString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input lengtht");
		int length = input.nextInt();
		
		System.out.print("Input the ulCase:");
		char ulCase = input.next().charAt(0);
		System.out.println(randomString(length,ulCase));
	}
	
	public static String randomString(int len, char ulCase) {
		Random rand = new Random();
		StringBuilder result = new StringBuilder();
		
		char ch = 'A';
		if(ulCase =='u')
			ch = 'A';
		else if (ulCase == 'l')
			ch = 'a';
		
		for(int i = 0; i< len; i++) {
			char randomChar = (char) (rand.nextInt(26) + ch);
			result.append(randomChar);
		}
		return result.toString();
	}

}
