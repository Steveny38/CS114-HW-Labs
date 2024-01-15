
public class Student extends Person{
	public static final int FRESHMAN = 1;
	public static final int SOPHMORE = 2;
	public static final int JUNIOR = 3;
	public static final int SENIOR = 4;
	
	private int classStatus;
	
	Student(String name, String address, String phoneNumber, int age, String email, int classStatus){
		super(name, address, phoneNumber, age, email);
		this.classStatus = classStatus;
		
	}
	
	public String toString() {
		return "Student: " + this.getName();
	}
	
	
}
