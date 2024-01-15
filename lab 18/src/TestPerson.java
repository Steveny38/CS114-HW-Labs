
public class TestPerson {

	public static void main(String[] args) {
		Person P = new Person("Steven", "Home", "1234567890", 17, "person@gmail.com");
		
		Student S = new Student("Sam", "Home", "1234567890", 13," student@gmail.com", 3);
		
		Employee E = new Employee("Worker", "Home", "1234567890",20, "employee@gmail.com", 120000, new myDate(2023, 9, 10) );
		
		Faculty F = new Faculty("Faculty", "Home", "123456789", 31, "faculty@gmail.com", 140000, new myDate(2021, 8, 12));
		
		Staff St = new Staff("Staff", "Home", "123456789", 52, "staff#gmail.com", 200000, new myDate(2000, 11, 11), "The Destroyer");

		System.out.println(P);
		System.out.println(S);
		System.out.println(E);
		System.out.println(F);
		System.out.println(St);
		
	}

}
