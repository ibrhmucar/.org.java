package day28_arrays_part5;

public class Question12 {

	public static void main(String[] args) {
		
	int [] x = {1,2,3};
	int [] y = {1,3};
	
	int [] a = {2,2,1};
	int [] b = {1};
	
	
	int [] e = {3,2,4};
	int [] z = {4,3,4};
	
	System.out.println(howMany(x,y));	
	System.out.println(howMany(a,b));
	System.out.println(howMany(e,z));

	}
	public static int howMany(int[] arr, int [] arr1) {
		
		 int count = 0;
		
         if( arr[0] == 1) {
        	 count ++;
         }
		 if ( arr1[0] == 1) {
			 count ++;
	}
		 
		   return count;
	}		 
		 
}
		
		