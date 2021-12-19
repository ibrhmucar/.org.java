package day28_arrays_part5;

import java.util.Arrays;

public class Question6 {

	public static void main(String[] args) {
		
		int [] x = {1,2,3};
		int [] y = {11,5,9};
		int [] z = {110,5,98,0,1200,11,-4};
 		bigger(x);
 		bigger(y);
 		bigger(z);
	}

	
		public static void bigger(int[] arr) {
			
			int max = Integer.MIN_VALUE; 
			  for(int i=0; i<arr.length; i++){
			      if(max<arr[i]){
			         max = arr[i];
			         }        
			      }   

			     for (int i=0 ; i<arr.length ; i++) {
			    	 arr[i] = max ;
			    		 
			     }
			    	 
			     
			     System.out.println(Arrays.toString(arr));
			     
				  
			
			
			
			
		}
	
	
}
