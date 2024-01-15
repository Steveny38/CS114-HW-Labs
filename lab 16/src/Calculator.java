
public class Calculator {

	public static void main(String[] args) {
		
		if(args.length !=3) {
			System.out.println("Inocrrect useage: op1 operant op2");
			return;
		}
		int result = 0;
		
		switch(args[1].charAt(0)) {
		case '+':
			result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
			System.out.println(result);
		
		
		}
		
		

	}

}
