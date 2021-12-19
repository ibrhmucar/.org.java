package day29_arrays_part5;
public class Question21 {

	public static void main(String[] args) {
		
	int [] x = {2,3,2,2,4,2}; 
	int [] y = {2,3,2,2,4,2,2};
	int [] z = {1,2,3,2};
	
	
	
 	System.out.println(sumOfTwo(x));
 	System.out.println(sumOfTwo(y));
 	System.out.println(sumOfTwo(z));

	}

	public static boolean sumOfTwo(int [] arr) {
		
		int sum = 0;
		for (int i=0 ; i<arr.length ; i++) {
			if(arr[i]==2) {
				sum = sum + arr[i];
			}else {
				continue;
			}
		}
		
		if(sum==8) {
			return true;
			}else {
			return false;
		}
		
	}
	
	
}
