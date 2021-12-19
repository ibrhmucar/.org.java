package day22_stringManipulation_Lab;

public class Lab3_Question9 {

	public static void main(String[] args) {
		
		System.out.println(right2("Hello"));
		System.out.println(right2("java"));
		System.out.println(right2("Hi"));
		
		
	}

	public static String right2(String str) {
		String str1 = "";
		
		if (str.length()>2) {
			str1= str.substring(str.length()-2).concat(str.substring(0,str.length()-2)); 
			
		}else {
			
			str1 = str;
		}
		
		return str1;
		
	}

}
