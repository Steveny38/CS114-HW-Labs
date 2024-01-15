
public class GPA {

	public static void main(String[] args) {
		System.out.println(gpaCalculator(new String[] {"A" , "F", "C", "B"}));
		
		System.out.println(gpaCalculator(new String[] {"A-", "B-", "C-", "F"} ));

		System.out.println(gpaCalculator(new String[] {"F", "C+", "D+", "A+"}) );

	}
	
	public static double gpaCalculator(String[] grades) {
		String[] validGrades = {"A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "F"};
		
		double[] points = { 4.0, 3.67, 3.33,3.0 ,2.67,2.33,2.0,1.67,1.33,1.0,0.0 };
		
		if(grades.length == 0) {
			return -1;
			
		}
		double totalPoints = 0;
		for(String grade: grades) {
			int index = indexOf(validGrades, grade);
			
			if(index == -1) {
				return -1;
			}
			totalPoints += points[index];
		}
		
		return totalPoints / grades.length;
		
		
	}
	
	public static int indexOf(String[] array, String key) {
		for(int i = 0; i< array.length; i++) {
			if(array[i].equals(key)) {
				return i;
			}
		}
		return -1;
	}

}
