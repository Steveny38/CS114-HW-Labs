
public class Vehicle {
	private String ownerName;
	private int numWheels;
	
	Vehicle(){
		
	}
	Vehicle(String ownerName, int numWheels){
		this.numWheels = numWheels;
		this.ownerName = ownerName;
	}
	
	public int getNumWheels() {
		return this.numWheels; 
	}
	public String getOwnerName() {
		return this.ownerName;
	}
	
	public void setNumWheels(int numWheels) {
		this.numWheels = numWheels;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	public String toString() {
		return "Vehicle: " + "ownerName: " + this.ownerName + " numWheels: " + this.numWheels;
	}
	
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if( o == null || getClass() != o.getClass()) {
			return false;
		}
		Vehicle v = (Vehicle) o;
		
		return numWheels == v.numWheels && ownerName.equals(v.ownerName);
	}
	
	public static void main(String[] args) {
		Vehicle v1 = new Vehicle("Steven", 4);
		Vehicle v2 = new Vehicle("Steven", 4);
		
		System.out.println(v1);
		System.out.println(v2.toString());
		System.out.println(v1.equals(v2));

		MotorizedVehicle m1 = new MotorizedVehicle("Steven", 4, 2.0);
		MotorizedVehicle m2 = new MotorizedVehicle("Steven", 4, 3.0);
		
		System.out.println(m1.toString());
		System.out.println(m2.toString());
		System.out.println(m1.equals(m2));
		
		System.out.println("hp: " + m1.computeHorsePower());
		
		
	}
	
}
