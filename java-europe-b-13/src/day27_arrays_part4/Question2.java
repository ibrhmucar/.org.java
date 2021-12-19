package day27_arrays_part4;

public class Question2 {

	public static void main(String[] args) {
		
		int [] x = {1,2,3};
		int [] y = {1,2,3,1};
		int [] z = {1,2,1};
		int [] k = {1};
		
		System.out.println(isFirstLastEqual(x));
		System.out.println(isFirstLastEqual(y));
		System.out.println(isFirstLastEqual(z));
		System.out.println(isFirstLastEqual(k));
		System.out.println(Question3.checkArray(x, z));
		System.out.println(Question3.checkArray(x, k));
	}

	public static String isFirstLastEqual(int [] arr) {
		
		if (!(arr.length>1)) {
			return "not a valid array";
		
		}			
			if (arr[0]==arr[arr.length-1]) {
				return "true";
			}else {
				return "false";
			}	
		}
			
	}
	
