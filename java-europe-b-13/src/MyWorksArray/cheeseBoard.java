package MyWorksArray;

import java.util.Arrays;

public class cheeseBoard {

	public static void main(String[] args) {
		
	 int [][] numbers =  {{1, 2, 3}, {5, 33, 9}};		
		

      int max = Integer.MIN_VALUE; 
	  for(int i=0; i<numbers.length; i++){
	      for(int j =0; j<numbers[i].length; j++){ // ikinci satır kesinle value[i] şeklinde olmalıdır.
	         if(max<numbers[i][j]){
	         max = numbers[i][j];
	         }        
	      }   
	      
	  }
	     System.out.println(max);
	     for (int i=0 ; i<numbers.length ; i++) {
	    	 for (int j=0 ; j<numbers[i].length ; j++) {
	    		 numbers[i][j] = max ;
	    		 
	    	 }
	    	 
	     }
	     
	       System.out.println(Arrays.deepToString(numbers));
	}
}
	  
	  //System.out.println(Arrays.toString(numbers));*/
	 		
