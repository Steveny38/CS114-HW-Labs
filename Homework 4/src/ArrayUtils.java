//Steven Yan
//115780161

public class ArrayUtils {

	public static int[] randomArray(int size, int upperLimit) {
		
		int[] returnList = new int[size];
		int count = 0;
		
		for(int i = 0; count < size;) {
			int rand = (int) (Math.random() * 100);
			if(rand < upperLimit) {
				returnList[i] = rand;
				count++;
				i++;
			}
		}
		return returnList;
	}
	
	public static void print(int[] array) {
		
		System.out.print("[");
		for(int a: array) {
			System.out.print(a + " ");
		}
		System.out.println("]");
	}
	
	public static int arraySum(int[] array) {
		int sum = 0;
		
		for(int a: array) {
			sum += a;
		}
		
		return sum;
	}
	
	public static int contains(int[] array, int element) {
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] == element) {
				return i;
			}
		}
		return -1;
		
	}
	
	public static int countMultiplesOf(int[] array, int target) {
		int counter = 0;
		
		for(int i: array) {
			if( i % target == 0) {
				counter++;
			}
		}
		return counter;
	}
	
	public static void main(String[] args) {
		
		int[] mainList = randomArray(100,21);
		// create a random array
		//print(mainList);
		//print the random array
		double avg = (double)  arraySum(mainList) / mainList.length;
		// arraySum sums all elements in the array
		// dividing the sum by the number of elements 
		// results in the average of the array
		System.out.println(avg);
		
		
		System.out.println(contains(mainList, 12));
		
		System.out.println(countMultiplesOf(mainList, 7) );
		
		
		
	}

}
