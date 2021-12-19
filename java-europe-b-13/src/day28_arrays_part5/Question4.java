package day28_arrays_part5;

public class Question4 {

	public static void main(String[] args) {
		
	int []	x = {1,2,3};
	int []	y = {5,11,2};
	int []  z = {7,0,0};
	int []  a = {3,-2,10,4};

	System.out.println(sum(x));
  	System.out.println(sum(y));
  	System.out.println(sum(z));
  	System.out.println(sum(a));
		

	}
	
	public static int sum(int [] arr) {
		int result = 0;
		
		for(int i=0 ; i<arr.length ; i++) {
			result += arr[i];
		}
		
			return result;
		
		
	}

}
