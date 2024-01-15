

import java.util.Scanner;

public class RegularPolygon {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the Number of Sides");
		
		int sidenum = input.nextInt();
		
		System.out.println("Enter the side lengths");
		
		double length = input.nextDouble();
		
		double Area = sidenum *(length*length) / (4 * Math.tan(Math.PI/sidenum));
		
		System.out.println("Area of the polygon is " + Area);
	}

}
