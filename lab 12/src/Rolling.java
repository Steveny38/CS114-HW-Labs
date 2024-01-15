import java.util.Random;
public class Rolling {

	public static void main(String[] args) {
		Random rand = new Random();
		int d1 = rand.nextInt(6)+1;
		int d2 = rand.nextInt(6)+1;
		int t = d1 + d2;
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(t);
	}

}
