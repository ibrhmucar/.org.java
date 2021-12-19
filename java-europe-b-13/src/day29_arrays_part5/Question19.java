package day29_arrays_part5;

public class Question19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int [] x = {1,2,2,7};
	int [] y = {1,2,2,6,99,99,7};
	int [] a = {1,1,6,7,2};
	int [] b = {1,1,6,2};
	int [] c = {1,2,2,6,99,99,7,3,4};
	
	System.out.println(sum(x));
	System.out.println(sum(y));
	System.out.println(sum(a));
	System.out.println(sum(b));
	System.out.println(sum(c));
	
		
		
	}

	public static int sum(int[] arr) {
		
		int sum = 0 ;
		int sum1 = 0 ;
		int result = 0 ;
		
		
		for (int i=0 ; i<arr.length ; i++) {
			if (arr[i]!=6) {
				sum = sum + arr[i];
			}else if (arr[i]==6) {
				break;
			}
		}
		
		for (int i=arr.length-1 ; i>0 ; i--) {
	            for(int j=0 ; j<i ; j++) {
	            	if(arr[j]!=7) {
	          		continue;
	            	}else {
	            	sum1 = sum1+arr[i];	
	            	
	    		}
		      }
			}
		
		  result = sum+ sum1;
		  return result;
}}	
		
		