package day26_arrays_part3;
import java.util.*;
public class ArrayMethods {

	public static void main(String[] args) {
		
	printArray(10);
		
		
	}	
	
	public static int [] creatArray(int myArray) {
		
		Random rn = new Random();
		
		int [] myArrays = new int [myArray];
	
		for (int i=0 ; i<myArrays.length ; i++ ) {
			
			myArrays[i] = rn.nextInt(100);
							
		}
		
			return myArrays;
			
	}
	
	
	public static void printArray(int numbers) {
		
		for (int value : creatArray(numbers)) {
			
			System.out.println(value);
			
			
		}
	
	}

	
}	