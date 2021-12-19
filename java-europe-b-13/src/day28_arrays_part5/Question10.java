package day28_arrays_part5;

import java.util.Arrays;

public class Question10 {

	public static void main(String[] args) {
		
		int [] x = {2,2};
		int [] y = {3,3};
		int [] a = {2,3};
		int [] b = {13,3,42,1};
		int [] c = {2,2,2};
		System.out.println((twice(x)));
		System.out.println((twice(y)));
		System.out.println((twice(a)));
		System.out.println((twice(b)));
		System.out.println((twice(c)));
	}
	
	public static boolean twice(int[] arr) {
		int count = 0; int count1 = 0;
		for (int a : arr) {
			
			if(a==2) {
			count++;
			}else if (a==3) {
			count1++;	
			}
	   }
		
		if((count==2)||(count1==2)) {
		 return true;
	   }
		
		return false;	
}
}