import java.util.Scanner;
public class AreaOfTriangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter values base and height");
		double base = input.nextDouble();
		double height = input.nextDouble();
		
		System.out.println("Area is " + areaOfTriangle(base,height));

	}
	
	public static double areaOfTriangle(double base, double height) {
		return (0.5 * base*height);
	}

}
