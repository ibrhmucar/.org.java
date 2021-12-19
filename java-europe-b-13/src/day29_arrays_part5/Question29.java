package day29_arrays_part5;

import java.util.Arrays;

public class Question29 {

	public static void main(String[] args) {
	
	int [] x = {2,10,3,4,20,5};	
	int [] y = {2,10,3,3,3,20,4,5,10,4,5};
	System.out.println(Arrays.toString(tenRun(x)));
	System.out.println(Arrays.toString(tenRun(y)));
	
	
	}

	public static int[] tenRun(int [] arr) {
		
		for (int i=0 ; i<arr.length ; i++) {
			if(arr[i]%10==0) {
				 
				 for (int j=i+1 ; j<arr.length && arr[j]%10 !=0 ; j++) {
					 
					 arr[j] = arr [i];
				 }
			}
		}	
			
		return arr;
		
		
		
		
		
	}
	
	
	
}
