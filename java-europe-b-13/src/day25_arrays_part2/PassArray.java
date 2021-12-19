package day25_arrays_part2;
import java.util.*;
public class PassArray {

	public static void main(String[] args) {
		
		
		int [] numbers = new int[4];
		
		getValues(numbers);
		showArray(numbers);

	}

	private static void showArray(int[] numbers) {
		System.out.println("Here is the number that you entered");	
		for(int value : numbers){
		System.out.println(value);
	}	
		//for(int i=0 ; i<numbers.length ; i++) {
		//System.out.print(numbers[i] + "  ");
		
		
	
		
		
		
		
	}

	public static void getValues(int[] numbers) {
		
	Scanner scan = new Scanner (System.in);
	System.out.println("Please enter " + numbers.length + " numbers" );
	
	for(int i=0 ; i<numbers.length ; i ++) {
	System.out.println("Enter number " + (i+1) + " :");
	numbers[i] = scan.nextInt();	
			
		
	}
		
		
		
		
	}

}
