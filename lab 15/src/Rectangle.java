
public class Rectangle {
	private double width = 1.0;
	private double height = 1.0;
	private String color = "White";
	
	Rectangle(){
	}
	
	Rectangle(double width, double height){
		this.width = width;
		this.height = height;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	public void setWidth( double width) {
		this.width = width;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public double getArea() {
		return this.width * this.height;
	}
	public double getPerimeter() {
		return 2 * this.width + 2 * this.height;
	}
	public String toString() {
		return "Height: " + height + " Width: " + width + " Color: " + color;
	}

	


}
