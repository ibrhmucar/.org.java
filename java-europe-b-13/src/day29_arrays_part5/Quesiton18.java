package day29_arrays_part5;

public class Quesiton18 {
	public static void main(String[] args) {
		
	int [] x = {1,2,2,1}; 
	int [] y = {1,1};
	int [] z = {1,2,2,1,13};
	int [] a = {1,2,2,1,13,3};
	
	System.out.println(sum(x));	
	System.out.println(sum(y));	
	System.out.println(sum(z));	
	System.out.println(sum(a));	
	
	}

	public static int sum(int [] arr) {
		
		int sum = 0;
		
		for (int i=0 ; i<arr.length ; i++) {
			
			if(arr[i]!=13) {
				sum = sum + arr[i];
			}if (arr[i]==13) {
				
				break;
			}
		}
		
		return sum;
		
	
	}
}
