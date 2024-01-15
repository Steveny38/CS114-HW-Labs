
public class Employee extends Person {

	private double salary;
	private myDate dateHired;
	
	Employee(String name, String address, String phoneNumber, int age, String email, double salary, myDate dateHired){
		super(name, address, phoneNumber, age, email);
		this.salary = salary;
		this.dateHired = dateHired;
		
	}
	
	public myDate getDateHired() {
		return this.dateHired;
	}
	
	public double getSalary() {
		return this.salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String toString() {
		return "Employee: " + this.getName();
	}
	
}
