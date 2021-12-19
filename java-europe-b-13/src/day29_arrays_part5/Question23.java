package day29_arrays_part5;

import java.util.Arrays;

public class Question23 {

	public static void main(String[] args) {
		
	System.out.println(Arrays.toString(lastArray(4)));
	System.out.println(Arrays.toString(lastArray(1)));
	System.out.println(Arrays.toString(lastArray(10)));
	
	}
	public static int[] lastArray(int num) {
	
	int[] lastArrays = new int [num];	
	
	for (int i=0 ; i<num ; i++) { 
		lastArrays [i] = i;
	
	}
	
		return lastArrays;
	
	}
}
