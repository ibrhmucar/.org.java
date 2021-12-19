package day29_arrays_part5;

public class Question16 {

	public static void main(String[] args) {
		
	int [] x = {2,1,2,3,4};	
	int [] y = {2,2,0};
	int [] z = {1,3,5};
	
	System.out.println(evenNumbers(x));
	System.out.println(evenNumbers(y));
	System.out.println(evenNumbers(z));
	
	}
	
	public static int evenNumbers(int[] arr) {
		
		int count = 0;
		for(int a : arr) {
			
			if(a%2==0) {
				count++;
			}
		}
		
		  return count;
		
		
		
	}
	
	
	
}
