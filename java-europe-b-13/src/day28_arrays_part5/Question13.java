package day28_arrays_part5;

import java.util.Arrays;

public class Question13 {

	public static void main(String[] args) {
		
	int[] x = {1,2} ; int[] y = {3,4};
	int[] a = {5,6} ; int[] b = {3,8};
	int[] c = {1,1} ; int[] d = {1,0};
	
	biggestSum(x, y);	
	biggestSum(a, b);
	biggestSum(c, d);	
	}
	
	public static void biggestSum(int [] arr, int [] arr1) {
		
		int a=0;
		int b=0;
		
		for( int value : arr) {
			
			a = a+value;
		}
		for( int value1 : arr1) {
			
			b = b+value1;
		}
		
		
		
		if (a>b) {
			System.out.println(Arrays.toString(arr));	
		}else if (b>a) {
			System.out.println(Arrays.toString(arr1));	
		}else if (a==b) {
			System.out.println("equal");	
		}
		
		
		
		
		
	}
	

	}
