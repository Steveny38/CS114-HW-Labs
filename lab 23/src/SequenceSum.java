
public class SequenceSum {
	
	public static double sequenceSum(int i ) {
		if(i ==1) {
			return 1;
		} else {
			return sequenceSum(i-1) + 1.0/i;
		}
	}
	
	public static void main(String[] args) {
		for(int i = 1; i < 10; i++) {
			System.out.println("sequenceSum(" + i+ ") = " + sequenceSum(i) );
		}

	}

}
