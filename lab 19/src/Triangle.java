
public class Triangle {

	private double side1;
	private double side2;
	private double side3;
	
	public Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
		if(side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
			throw new IllegalTriangleException("The sum of 2 sides are greater than the other side.");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Triangle t = new Triangle(1, 3 , 1);
			System.out.println("Valid Triangle");
		} catch (IllegalTriangleException e ) {
			System.out.println(e.getMessage());
		}
	}

}
