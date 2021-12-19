package week6;

import java.util.Arrays;

import day28_arrays_part5.Question9;

public class A09_AddElementToArray {

	public static void main(String[] args) {
		
		String [] students = {"Erdem" , "Yasin" , "Recep" , "Hande" , "Selena" };
		
		
		students = addElement(students, "Ibrahim");
		students = addElement(students, "Samra");
		
		System.out.println(Arrays.toString(students));
		
	}

	
		public static String [] addElement(String[] arr, String element) {
			
			String [] newArray = new String[arr.length+1]; // yeni array oluşturuyoruz ve diğer array'in length'inden eklemek istediğimiz sayıyı yazıyoruz.
			
			int i=0;
			for (String each : arr) {
				newArray[i] = each;
				i++;
			}
			    
			   newArray[i] = element;
			   
			   return newArray;
			
		}
 	
	
}
