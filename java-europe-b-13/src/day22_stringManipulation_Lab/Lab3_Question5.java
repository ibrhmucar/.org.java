package day22_stringManipulation_Lab;

public class Lab3_Question5 {

	public static void main(String[] args) {
		
		System.out.println(firstHalf("WooHoo"));
		System.out.println(firstHalf("HelloThere"));
		System.out.println(firstHalf("abcdef"));
		
		

	}

	public static String firstHalf(String str) {
		
	
	String str1 = str.substring(0, str.length()/2);
	
	return str1;
		
		
		
		
		
	}

}
