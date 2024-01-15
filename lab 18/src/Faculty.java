import java.util.Date;
public class Faculty extends Employee {

	private String officeHours;
	private int rank;
	
	Faculty(String name, String address, String phoneNumber, int age, String email, double salary, myDate dateHired){
		super(name, address, phoneNumber, age, email, salary, dateHired);
		this.officeHours = officeHours;
		this.rank = rank;
	}
	
	public int salaryRange() {
		int currentYear = new Date().getYear();	
		int years = currentYear - this.getDateHired().getYear();
		
		if(rank * years < 10) {
			return 1;
		}
		else if ( rank * years >= 10 && rank * years <= 20) {
			return 2;
		} else {
			return 3;
		}
		
	}
	
	public String toString() {
		return "Faculty: " + this.getName();
	}
	
}
