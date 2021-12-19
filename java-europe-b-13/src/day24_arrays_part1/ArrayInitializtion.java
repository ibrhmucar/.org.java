package day24_arrays_part1;

public class ArrayInitializtion {

	public static void main(String[] args) {
		
		
		int [] myList = {1,2,3,4,5};
		
		System.out.println(myList[2]);
		
		System.out.println(myList.length);
		
		int [] myArray = {1,2,3,4,5,6};
		
		for (int i=0 ; i<myArray.length ; i++) {
			
			System.out.print(myArray[i]+",");
			System.out.println();
		}
		
		
		
		int [] scores = {80,90,100,35,60,72,64,30,10,5,3,99,89,80,90,100,35,60,72,64,30,10,5,3,99,89};
		
		int result = 0;
		int avg = 0;
		
		for (int i=0 ; i<scores.length ; i++) {
			
			result+=scores[i];
			
		}
			
		avg = result/(scores.length);
		System.out.println(avg);
		System.out.println(result);
		System.out.println(scores.length);
		
	}

}
