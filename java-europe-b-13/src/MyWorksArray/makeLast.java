package MyWorksArray;

import java.util.Arrays;

public class makeLast {

	public static void main(String[] args) {
		
	int [] nums = {4,5,6};
	
	int [] last = new int [nums.length*2];
	
	
	for (int i=0 ; i<last.length ; i++) {
		if(last.length-1>i) {
			  last[i]=0;
	    }if(last.length-2<i) {
	    	  last[i]=nums[nums.length-1]; 
		
	}
	}
	
	System.out.println(Arrays.toString(last));
	
	
		
	}

}
