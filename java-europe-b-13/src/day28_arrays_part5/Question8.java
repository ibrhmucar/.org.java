package day28_arrays_part5;

import java.util.Arrays;

public class Question8 {

	public static void main(String[] args) {
		
	int [] x = {2,5};
	int [] y = {4,3};
	int [] z = {4,5};
	
	
	System.out.println(contains(x));
	System.out.println(contains(y));
	System.out.println(contains(z));
	System.out.println(Arrays.toString(Question9.doubleArray(x)));
	
	}
	
	public static boolean contains(int [] arr) {
		
	     
		for(int a : arr) {
	
		if (a==2 || a==3){
			return true;
		}
			// eğer buraya else eklersen doğru çalışan kod çalışmıyor.
		}
	
		return false;       
	
		
		
		
	}

}
