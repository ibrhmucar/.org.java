package week6;

import java.util.Arrays;

public class A11_BiggstIn2dArray {

	public static void main(String[] args) {
		
	int [][] arr = { {3,12,3,34,12}, {13,7,456,34,3}, {-5,-24,-2,-10,-4} };	
	
	System.out.println(Arrays.toString(biggestValues(arr)));
	System.out.println(Arrays.deepToString(arr));
	}

	public static int [] biggestValues(int [][] arr) {
	
	int [] biggestArr = new int [arr.length];
	
	
	for (int i=0 ; i< arr.length ; i++) {
		int max = arr[i][0];
		 
		for (int each : arr[i]) {
			if (each>max) {
				max = each;
			}
		}
		 
		 biggestArr [i] = max;
		
		
		
		
	}
	  
	    return biggestArr;
	
	
	}

}
