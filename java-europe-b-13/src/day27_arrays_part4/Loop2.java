package day27_arrays_part4;

import java.util.Arrays;

public class Loop2 {

	public static void main(String[] args) {
		
		int [][] students = { {4,5,6} , {12,5,7} , {23,56,12,55,3}};
		System.out.println(students[0][1]);
		
		for (int[] value : students) {
			
			System.out.println(Arrays.toString(value));
		}
		
		for (int  value : students[2]) {
			
			System.out.print(value+ " ");
			
		}
			System.out.println();
		for (int i=0 ; i<students.length ; i++) {
			for (int j=0 ; j<students[i].length ; j++) {
				System.out.print(students[i][j]+" ");
			}System.out.println();
		}
		
		
			for (int[] value : students) {
				
				for (int studentID : value) {
					
					System.out.println(studentID);
				}
			}
			
			
		
		
	}

}
