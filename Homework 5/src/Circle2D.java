//Steven Yan
//115780161
public class Circle2D {

	private double x;
	private double y;
	private double radius;
	
	public Circle2D() {
		this.x = 0;
		this.y=0;
		this.radius = 1;
	}
	
	
	public Circle2D(double x, double y, double radius) {
		this.x = x;
		this.y=y;
		this.radius = radius;
	}
	
	public double getX() {
		return this.x;
	}
	
	public  double getY() {
		return this.y;
	}
	
	public  double getRadius() {
		return this.radius;
	}
	
	public double getArea() {
		return Math.PI * Math.pow(this.radius, 2);
	}
	
	public double getPerimeter() {
		return Math.PI * (this.radius * 2);
	}
	
	public boolean contains(double x, double y) {
		
		double distance = Math.pow( Math.pow(this.x + x, 2) + Math.pow(this.y + y, 2) , 1/2);
		
		if(distance < this.radius)
			return true;
		else {
			return false;
		}
	}
	
	public boolean contains(Circle2D circle) {
		double circleX = circle.getX();
		double circleY = circle.getY();
		
		double distance = Math.pow( Math.pow(this.x + circleX, 2) + Math.pow(this.y + circleY, 2), 1/2);
		
		if(this.radius > circle.getRadius()) {
			if(this.radius > distance) {
				return true;
			}
		}
		return false;
		
	}
	
	public boolean overlaps(Circle2D circle) {
		double circleX = circle.getX();
		double circleY = circle.getY();
		
		double distance = Math.pow( Math.pow(this.x + circleX, 2) + Math.pow(this.y + circleY, 2), 1/2);
		
		if(this.radius + circle.getRadius() < distance) {
			return false;
		} else {
			return true;
		}
		
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		Circle2D c1 = new Circle2D(2,2,5.5);
		System.out.println("Area of c1: " + c1.getArea());
		System.out.println("Perimeter of c1: " + c1.getPerimeter());
		
		System.out.println(c1.contains(3,3));
		System.out.println(c1.contains(new Circle2D(4,5,10.5)));		
		System.out.println(c1.overlaps(new Circle2D(3,5,2.3)));
		
	}

}
