
public class BubbleSort {

	public static void main(String[] args) {
		
		double [] unsorted = {0.6, 5.4, 54.3, 1.0, 71.3};
		
		bubbleSort(unsorted);

	}
	
	public static void bubbleSort(double[] list) {
		boolean changed = true;
		
		do {
			changed = false;
			for(int j = 0; j< list.length -1; j++) {
				if( list[j] > list[j+1]) {
					double dummy = list[j];
					list[j] = list[j+1];
					list[j+1] = dummy;
					changed = true;
					for(double num : list) {
						System.out.print(num + " ");
					}
					System.out.println();
				}
			}
		}
		while(changed);
		
		
	}

}
