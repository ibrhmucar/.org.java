package day28_arrays_part5;

import java.util.Arrays;

public class Question9 {

	public static void main(String[] args) {
		
		
		int [] x = {4,5,6};
		int [] y = {1,2,3,4,8};
		
		System.out.println(Arrays.toString(doubleArray(x)));
		System.out.println(Arrays.toString(doubleArray(y)));
				
		}

	public static int[] doubleArray(int [] arr) {
		
		int [] lastArray = new int[arr.length*2];
		
		for(int a : lastArray) {
			
			lastArray[lastArray.length-1] = arr[arr.length-1];
			
			
		}
		
			return lastArray;
		
		
		
	}
	
	
	

}
