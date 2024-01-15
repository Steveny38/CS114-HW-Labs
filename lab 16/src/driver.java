
public class driver {

	public static void main(String[] args) {
		char[] myStr = {'h','E',' ','L','L',' ','O'};
		MyString str = new MyString(myStr);
		System.out.println("Char at ind 1: " + str.charAt(1));
		System.out.println("Length: " + str.length());
		System.out.println("subString: " + str.substring(1, 4).twoString());
		System.out.println("To Lowercase: " + str.toLowerCase().twoString());
		
		
		MyString equalsCheck = new MyString(myStr);
		System.out.println("Equals: " + str.equals(equalsCheck));
		System.out.printf("Valueof: %s " , MyString.valueOf(3).twoString());
		MyString delim = new MyString(new char[] {' '});
		MyString[] splitResult = str.split(delim);
		System.out.println("Split:");
		
		for( MyString s: splitResult) {
			System.out.println(s.twoString());
		}
		
		
		}
	}


