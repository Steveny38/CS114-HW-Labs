
public class RectangleTest {

	public static void main(String[] args) {

		Rectangle rect1 = new Rectangle();
		rect1.setHeight(40);
		rect1.setWidth(4);
		rect1.setColor("red");
		
		Rectangle rect2 = new Rectangle(3.5, 35.9);
		rect2.setColor("red");
		
		System.out.println("Rectangle 1: " + rect1.getArea());
		System.out.println("Rectangle 2: " + rect2.getArea());

		System.out.println("Rectangle 1: " + rect1.getPerimeter());
		System.out.println("Rectangle 2: " + rect2.getPerimeter());			
		System.out.println(rect1);
		System.out.println(rect2);

	}

}
