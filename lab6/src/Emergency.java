import java.util.Scanner;

public class Emergency {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input the message: ");
		
		String inputMessage = input.nextLine();
		
		System.out.println(emergency(inputMessage));

	}
	
	public static String emergency(String message) {
		int nameStart = "Hello my name is ".length();
		
		int nameEnd = message.indexOf(". I need");
		
		String name = message.substring(nameStart, nameEnd);
		
		int eventStart = message.indexOf("I need to report ") + "I need to report ".length();
		int eventEnd = message.indexOf(". Please come");
		
		String event = message.substring(eventStart, eventEnd);
		
		int locationStart = message.indexOf("Please come to ")+"Please come to".length();
		
		String location = message.substring(locationStart, message.length()-1);
		
		return event + " at " + location + "reported by " + name;
				
	}

}
