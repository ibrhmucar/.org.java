package day27_arrays_part4;

public class Length {

	public static void main(String[] args) {
		
		int [][] numbers = {
				
				{1,2,3,4},
				{5,6},
				{7,8,9,10,15,45,50}
         		};
		
			
		for (int i=0 ; i<numbers.length ; i++) {
			
			System.out.println("The number of columns in row " + (i+1) + " is " + numbers[i].length);
		}
	
		for (int i=0 ; i<numbers.length ; i++) {
			
			for (int j=0 ; j<numbers[i].length ; j++) {
				
				System.out.print(numbers[i][j]+" ");
				
			}
			    System.out.println();
		}
			
		
		

	}

}
