
public class Staff extends Employee {

	private String title;
	
	Staff(String name, String address, String phoneNumber, int age, String email, double salary, myDate dateHired, String title){
		super(name, address, phoneNumber, age, email, salary, dateHired);
		this.title = title;
	}
	
	public String toString() {
		return "Staff: " + this.getName();
	}
	
}
