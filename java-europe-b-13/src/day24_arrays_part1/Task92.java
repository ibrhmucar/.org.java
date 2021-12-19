package day24_arrays_part1;

import java.util.Arrays;

public class Task92 {

	public static void main(String[] args) {
		
		int [] number = new int [10];
		
		
		for (int i=0 ; i<number.length ; i++) { // burada number [0] --> number [1] olarak değiştiriyoruz.
			
			number[i]= i+1; 
		}
		
		
		
		
		for (int i=0 ; i<number.length ; i++) {
			
		
			System.out.println(number[i]*19);
			
		}

			System.out.print(Arrays.toString(number));
		
	}
	

}
