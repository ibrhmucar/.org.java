package day29_arrays_part5;

public class Question17 {

	public static void main(String[] args) {
	
	int [] x = {10,3,5,6};
	int [] y = {7,2,10,9};
	int [] z = {2,10,7,2};
	System.out.println(sumProblems(x));
	System.out.println(sumProblems(y));
	System.out.println(sumProblems(z));
	
	}

	public static int sumProblems(int[] arr) {
		
		//int i = 0;
		
		int max = 0;
		for (int i=0 ; i<arr.length ; i++) {
			if (arr[i]>max) {
		    max = arr[i];
			}
		}
		int min = arr[0];
		for (int i=0 ; i<arr.length ; i++) {
			if (min>arr[i]) {
			min = arr[i];  	
			}
		}
		
		 int result = max-min;
		 	
		 return result;
	
	
	
	}	
}
