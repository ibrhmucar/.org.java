package day23_stringManipulatinLab_random;

public class Lab3_Question13 {

	public static void main(String[] args) {
		
		System.out.println(doublechar("The"));
		System.out.println(doublechar("ibrahim"));
		

	}

	public static String doublechar(String str) {
		
		String newString = " ";
		
		for (int i=0 ; i<str.length() ; i++) {
			
	
	newString = newString + str.substring(i, i+1).concat(str.substring(i, i+1));	
		
		}
		
		return newString;
		
		
		
		
	}

}
