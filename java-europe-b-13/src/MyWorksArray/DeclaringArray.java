package MyWorksArray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DeclaringArray {

	public static void main(String[] args) {
		
		
		double[][] myList = {{1.9, 2.9}, {3.4, 3.5}};
		
		System.out.println(Arrays.toString(myList));
		System.out.println(myList[1][0]);
		
		
		double [] myList2 ;
		myList2 = new double[2];
		myList2[0] =2.3;
		myList2[1] =3.3;
		
		System.out.println(myList2[0]);
		System.out.println(Arrays.toString(myList2));
		
		double [] myList3 = new double [4];
		
		myList3[0] = 1.3;
		myList3[1] = 2.3;
		myList3[2] = 3.3;
		myList3[3] = 4.4;
		
		System.out.println(Arrays.toString(myList3));
		
		 for (double a : myList3) {
			 System.out.print(a + " ");
		 }
		
		 
		int [] myList4 = new int [4];
		
		int [] myList5 = {1,2,3,4};
		 
		myList4 [0] = 1;
		myList4 [1] = 2;
		
		
		
		
	}

	
		
	}
