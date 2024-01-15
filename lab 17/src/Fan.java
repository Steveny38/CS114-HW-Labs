
public class Fan {
	
	public static final int SLOW = 1;
	public static final int MEDIUM = 2;
	public static final int FAST = 3;
	
	private boolean on = false;
	
	private int speed = SLOW;
	
	private double radius = 5;
	private String color = "blue";
	
	Fan(){}
	
	public boolean getOn() {
		return this.on;
	}
	
	public int getSpeed() {
		return this.speed;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public String getColor() {
		return this.color;
	}
	public void setOn(boolean on) {
		this.on = on;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String toString() {
		if(on) {
			return "Fan Speed: " + this.speed + " Color: " + this.color + " Radius: " + this.radius;
		} else {
			return "Fan Color: " + this.color + " Radius: " + this.radius + " The fan is off";
		}
	}
	
	public static void main(String[] args) {
		
	}

}
