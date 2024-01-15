
public class MyString {
	private char[] str;
	
	public MyString(char[] chars) {
		this.str = chars;
	}
	public char charAt(int index) {
		return this.str[index];
	}
	public int length() {
		int count = 0;
		
		for( char c : str) {
			count+= 1;
		}
		return count;
	}
	
	public MyString substring(int begin, int end) {
		char[] subStr = new char[end-begin];
		int iter = 0;
		for(int i = begin; i < end; i++) {
			subStr[iter] = str[i];
			iter++;
		}
		
		return new MyString(subStr);
		
	}
	public MyString toLowerCase() {
		char[] lowerCaseStr = new char[str.length];
		for(int i = 0; i < str.length; i++) {
			if(str[i] >= 'A' && str[i] <= 'Z' ) {
				lowerCaseStr[i] = (char)(str[i] + ('a' - 'A'));
			} else {
				lowerCaseStr[i] = str[i];
			}
		}
		
		return new MyString(lowerCaseStr);
	}
	public boolean equals(MyString s) {
		if(this.length() != s.length()) {
			return false;
		}
		for(int i = 0; i < s.length(); i++) {
			if(this.charAt(i) != s.charAt(i)) {
				return false;
			}
		}
		return true;
	}
	public static MyString valueOf(int i) {
		String strValue = Integer.toString(i);
		char[] charValue = new char[strValue.length()];
		for(int j = 0; j < strValue.length(); j++) {
			charValue[j] = strValue.charAt(j);
		}
		return new MyString(charValue);
	}
	
	public MyString[] split(MyString s) {
		int count = 1;
		for(int i = 0; i < this.length(); i++) {
			if(this.charAt(i) == s.charAt(0)) {
				count++;
			}
		}
		MyString[] splitStrings = new MyString[count];
		int startIndex = 0, endIndex;
		for( int i = 0; i < count; i++) {
			endIndex = -1;
			for(int j = startIndex; j < this.length(); j++) {
				boolean delimiterFound = true;
				
				for(int k = 0; k < s.length(); k++) {
					if((j + k) >= this.length() || this.charAt(j+k) != s.charAt(k)) {
						delimiterFound = false;
						break;
					}
				}
				if(delimiterFound) {
					endIndex = j;
					break;
				}
			}
			if(endIndex == -1) {
				endIndex = this.length();
			}
			char[]subStr = new char[endIndex - startIndex];
			int iter = 0;
			for(int j = startIndex; j < endIndex; j++) {
				subStr[iter] = str[j];
				iter++;
			}
			splitStrings[i] = new MyString(subStr);
			
			startIndex = endIndex + s.length();
		}
		return splitStrings;
	}
	
	
	public String twoString() {
		return new String(str);
	}
}
