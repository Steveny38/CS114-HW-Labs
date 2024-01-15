
public class Driver {

	public static void main(String[] args) {
		Triangle tri = new Triangle(2,3,4, "blue", true);
		
		System.out.println(tri.toString());
		System.out.println("Color = " + tri.getColor());
		System.out.println("Filled = " + tri.isFilled());
		System.out.println("Area = " + tri.getArea());
		System.out.println("Perimeter = " + tri.getPerimeter());
		

	}

}
