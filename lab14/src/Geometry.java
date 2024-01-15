import java.util.Scanner;
public class Geometry {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter x1, y1, x2, y2, x3, y3:");
		double[][] points = new double [3][2];
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 2; j++) {
				points[i][j] = input.nextDouble();
			}
		}
		
		double area = getTriangleArea(points);
		
		System.out.println(area);
		

	}

	
	public static double getTriangleArea(double[][] points) {
		
		double side1 = Math.abs(Math.sqrt((Math.pow(points[1][0]-points[0][0], 2) + Math.pow(points[1][1] -points[0][1], 2))));
		double side2 = Math.abs(Math.sqrt((Math.pow(points[2][0]-points[1][0], 2) + Math.pow(points[2][1] -points[1][1], 2))));
		double side3 = Math.abs(Math.sqrt((Math.pow(points[0][0]-points[2][0], 2) + Math.pow(points[0][1] -points[2][1], 2))));
		double semiPerm = (side1 + side2 + side3)/2;
		
		double valueInsideSqrt = semiPerm * ((semiPerm - side1) * (semiPerm -side2) *(semiPerm - side3));
		if(valueInsideSqrt == 0) {
			return 0;
		}
		
		double area = Math.sqrt(valueInsideSqrt);
		return area;
		
		
	}
}
