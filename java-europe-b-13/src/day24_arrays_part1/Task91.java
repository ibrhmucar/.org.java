package day24_arrays_part1;
import java.util.*;
public class Task91 {

	public static void main(String[] args) {
		
	Random rn = new Random();
		
	int[] number = new int[10];

	for (int i=0 ; i<number.length ; i++) {
		
		number[i] = rn.nextInt(100);
		
		System.out.println(number[i]);
		
		
	}
    
	System.out.println("-----------------------");
	
	int[] numbers = new int[10];
	numbers [0] = rn.nextInt(100);
	numbers [1] = rn.nextInt(100);
	numbers [2] = rn.nextInt(100);
	numbers [3] = rn.nextInt(100);
	numbers [4] = rn.nextInt(100);
	numbers [5] = rn.nextInt(100);
	numbers [6] = rn.nextInt(100);
	numbers [7] = rn.nextInt(100);
	numbers [8] = rn.nextInt(100);
	numbers [9] = rn.nextInt(100);
	
	System.out.println(numbers [0]);
	System.out.println(numbers [1]);
	System.out.println(numbers [2]);
	System.out.println(numbers [3]);
	System.out.println(numbers [4]);
	System.out.println(numbers [5]);
	System.out.println(numbers [6]);
	System.out.println(numbers [7]);
	System.out.println(numbers [8]);
	System.out.println(numbers [9]);
	
	

	
	
	
	
	
	
	}

}
