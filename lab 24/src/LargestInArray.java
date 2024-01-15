
public class LargestInArray {

	public static void main(String[] args) {

		int[] a = {1,2,7,4,5};
		
		System.out.println(findLargest(a, 0));

	}
	
	public static int max(int a, int b){
	    if (a > b) { return a; }
	    else { return b; }
	}

	public static int findLargest(int[] ints, int currentIndex) {
		if(currentIndex == ints.length-1) {
			return ints[currentIndex];
		}
		
		return max(ints[currentIndex], findLargest(ints, ++currentIndex));	
	}
	
	
	
	
}
