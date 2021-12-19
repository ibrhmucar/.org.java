package day29_arrays_part5;

public class Question22 {

	public static void main(String[] args) {
		
	int [] x = {1,4,1};	
	int [] y = {1,4,1,4};
	int [] z = {1,1};
	int [] a = {1,1,2,4,4,1,4,1,4,4};
 	
	
	System.out.println(greater(x));
	System.out.println(greater(y));
	System.out.println(greater(z));
	System.out.println(greater(a));
	}
	
	public static boolean greater(int [] arr) {
		
	int count = 0;
	int count1 = 0;
	
	
	for(int i=0 ; i<arr.length ; i++) {
		
		if(arr[i]==1) {
			count++;
		}else if(arr[i]==4) {
			count1++;
		}
	}
	
	    if (count>count1) {
	    	return true;
	    }else {
	    	return false;
	    }
		
		
		
		
}
}