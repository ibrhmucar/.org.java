package MyWorksArray;

import java.util.Arrays;

public class MethodsArray {

	public static void main(String[] args) {
		
	System.out.println(Arrays.toString(printArray(5)));
	
	
		
	}
	
	public static int [] printArray(int num) {
		
		int[] deck = new int[num];
		
		for (int i=0 ; i<deck.length ; i++) {
			
			deck [i] +=i;
	}
		return deck;
		
	}
	
	
	
	
	
	

}
