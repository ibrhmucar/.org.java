package MyWorksArray;

import java.util.Arrays;

public class FrontPiece {

	public static void main(String[] args) {
		
	int[] a =	{1, 2, 3}; 
	int[] b =   {1};
	int[] c =   {4, 5, 4, 3, 8};
	
	method(a);
	method(b);
	method(c);
	
	
	
	
	}
	
	public static void method(int [] arr) {
		String [] last = new String [2];	
		for(int i=0 ; i<arr.length ; i++) {
		if(arr.length<2) {
			System.out.println("["+arr[i]+"]");
		}
		}
		
		if(arr.length>2) {
			
			for (int j=0 ; j<last.length ; j++) {
			last [j] = ""+ arr[j];	
			
		
		}
			
		System.out.println(Arrays.toString(last));
		
		}
  
	}
	
}
	
	
	
	
	

		
		
		
		
		
		
	

