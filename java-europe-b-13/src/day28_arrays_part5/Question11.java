package day28_arrays_part5;

import java.util.Arrays;

public class Question11 {

	public static void main(String[] args) {

		
		int [] x = {1,2,3};
		int [] z = {2,3,5}; 
		int [] a = {1,2,1};
		int [] b = {11,2,3,13,2,3};
		
		System.out.println(Arrays.toString(changedArray(x)));
		System.out.println(Arrays.toString(changedArray(z)));
		System.out.println(Arrays.toString(changedArray(a)));
		System.out.println(Arrays.toString(changedArray(b)));
		
	}

	public static int[] changedArray(int[] arr) {
		int a = 0;
		
		
		for (int i=0 ; i<arr.length-1 ; i++) {
			
			if (arr[i]==2 && arr[i+1]==3) {
			
			  arr[i+1]=0;
				
		}
	}	
		
			return arr;
			
			
	
	
	}	
}
