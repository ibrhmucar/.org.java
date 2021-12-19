package day29_arrays_part5;

public class Question24 {

	public static void main(String[] args) {
		
	int [] x = {1,2,1,3};
	int a = 2;
	
	
	int [] y = {1,2,1,3};
	int b = 1 ;
	System.out.println(numbers(x,a));
	System.out.println(numbers(y,b));
	
	
	
	}

	public static boolean numbers(int [] arr, int num) {
		
		
		for(int i=0 ; i<arr.length ; i++) {
			
		if(arr[i]==num && (arr[i+1]==num || arr[i+2]==num)) {
			return true;
		}
			
		}
		return false ;
	}
	       
	}	
	

