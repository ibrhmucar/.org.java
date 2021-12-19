package week6;

import java.util.Arrays;

public class A08_ReverseArray {

	public static void main(String[] args) {
		//1. çözüm
		int [] nums = {5, 10, 4, 100};
		
		for (int i=nums.length-1 ; i>=0 ; i-- ) {
			
			System.out.print(nums[i]+ " ");
		}
		   
		
		// 2.çözüm
		
		int [] reversNums = new int [nums.length];
		for (int i=nums.length-1, j=0 ; i>=0 ; i-- , j++) {
			reversNums[j] = nums[i];
		

	}
			System.out.println();
			System.out.println("Second result" + Arrays.toString(reversNums));
			
			//int [] nums = {5, 10, 4, 100};
			
			for (int i=0 ; i<nums.length/2 ; i++) {
				
				int temp = nums [i];
				
				nums [i] = nums[nums.length-1-i];
				nums [nums.length-1-i] = temp;
				
				
						
				
			}
			
			System.out.println("Third swap" + Arrays.toString(nums));
			
}
}