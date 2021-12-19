package day28_arrays_part5;

import java.util.Arrays;

public class Question7 {

	public static void main(String[] args) {
		
	int [] x =  {1,2,3};
	int [] y =  {};
	int [] a =  {4,5,6,7,9,40,54};
	int [] b =  {};
	
	System.out.println(Arrays.toString(twoArrays(x,y)));
	System.out.println(Arrays.toString(twoArrays(a,b)));	
		
		
	}

	    public static int [] twoArrays(int [] arr1 , int [] arr2) {
	    
	    arr2 = new int [2];
	    
	    arr2[0] = arr1[0];
	    arr2[1] = arr1[arr1.length-1];
	    	
	    return arr2;	
	    	
	    
	    
	    }
	    
}
	    