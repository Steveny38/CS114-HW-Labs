
public class Person {
	private String name;
	private String address;
	private String phoneNumber;
	private int age;
	private String email;
	
	Person(String name, String address, String phoneNumber, int age, String email){
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.age = age;
		this.email = email;
	}
	
	public int getAge(){
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		return "Person: " + this.getName();
	}
	
	
}
