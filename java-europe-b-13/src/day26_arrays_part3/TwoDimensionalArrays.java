package day26_arrays_part3;

public class TwoDimensionalArrays {

	public static void main(String[] args) {
		
		
		int [][] notes = new int [3][4];
		
		notes [1][2] = 10;
		notes [1][3] = 15;
		
		int result = notes [1][2] + notes [1][3];
		System.out.println(result);
		

	}

}
