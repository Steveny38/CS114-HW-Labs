//Steven Yan
//115780161


	//	uncomment print statements to see results

public class InterleaveArrays {

	public static int[] interleaveArrays(int[] array1, int[] array2) {
		int[] interArray = new int[array1.length + array2.length];
		
		if(array1.length> array2.length) {

			for(int i = 0, j = 0; i< array2.length; j+=2, i++) {
				interArray[j] = array1[i];
				interArray[j+1] = array2[i];
			//	System.out.print(" "+ interArray[j] + " " + interArray[j+1] + " ");
		
			}
			
			
 
			for(int i = array2.length * 2, j = array2.length; i < interArray.length;i++, j++) {
				interArray[i] = array1[j];
			//	System.out.print( interArray[i] + " ");
		 
			}
		} else {
			
		
		
			for(int i = 0, j = 0; i< array1.length; j+=2, i++) {
				interArray[j] = array1[i];
				interArray[j+1] = array2[i];
			//	System.out.print(interArray[j] + " " + interArray[j+1] + " ");
			}
 
			for(int i = array1.length * 2, j = array1.length; i < interArray.length;i++, j++) {
		 
				interArray[i] = array2[j];
			//	System.out.print(interArray[i] + " ");
			}
		}
		
		
		return interArray;

		
		

		
	}
	
	public static void main(String[] args) {
		interleaveArrays(new int[]{1,3,5}, new int[]{2,4,6,8,10});
		interleaveArrays(new int[]{1,3,5}, new int[]{2,4,6}) ;
		interleaveArrays(new int[]{10,20,30,40,50,60,70,80}, new int[]{2,4,6,8});
		interleaveArrays(new int[]{1,2,3,4,5,6,7,8}, new int[]{20,40,60,80});
		interleaveArrays(new int[]{10, 20}, new int[]{2,4,6,8});
		
	}

}
