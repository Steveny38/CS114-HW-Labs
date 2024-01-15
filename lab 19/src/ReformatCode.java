import java.io.PrintWriter;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;
public class ReformatCode {
	
	
	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		Scanner reader = new Scanner(file);
		String buffer = " ";
		
		while(reader.hasNext()) {
			buffer += reader.nextLine() + "\n";
			
		}
		
		buffer = buffer.replaceAll("\\s*\\n\\s*\\{", " {");
		
		PrintWriter output = new PrintWriter(file);
		output.print(buffer);
		reader.close();
		output.close();
		
		
		
		
	}
	
}
