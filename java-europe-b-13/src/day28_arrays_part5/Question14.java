package day28_arrays_part5;

import java.util.Arrays;

public class Question14 {

	public static void main(String[] args) {
		
		int [] x = {1,2,3}; int [] y = {3,4} ;
		int [] a = {4,4,5,6}; int [] b = {2,2} ;
		int [] c = {9,2,5,6,7}; int [] d = {3,4,5,6} ;
		
		System.out.println(Arrays.toString(newArray(x,y)));
		System.out.println(Arrays.toString(newArray(a,b)));
		System.out.println(Arrays.toString(newArray(c,d)));
	}

	public static int[] newArray(int [] arr, int[] arr1) {
		
		
		int [] last = new int[arr.length + arr1.length];
		
		for (int i=0 ; i<arr.length ; i++) {
			last [i]= arr[i];
		}
		for (int j=arr.length ; j<last.length ; j++) {
			last [j]= arr1[j-arr.length];
			
	}
	
			return last;
}
}