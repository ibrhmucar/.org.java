package day22_stringManipulation_Lab;

public class Lab3_Question3 {

	public static void main(String[] args) {

	System.out.println(extraEnd("Hello"));
	System.out.println(extraEnd("ab"));
	System.out.println(extraEnd("Hi"));	
	
		
		
		
}

	public static String extraEnd(String str) {
		
	/*	if (str.length()<2) {
		System.out.println("Invalid entery");	*/
	//	}
		
		String b= "";
		
		b = str.substring(str.length()-2);
		
		return b.concat(b).concat(b);
		
		
	}	
}
