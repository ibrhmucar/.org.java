package day22_stringManipulation_Lab;

public class Lab3_Question8 {

	public static void main(String[] args) {
	
	
		System.out.println(left2("Hello"));
		System.out.println(left2("java"));
		System.out.println(left2("Hi"));
	
	
	}

	public static String left2(String str) {
		String str1= "";
		
		if (str.length()>2) {
		
		str1=str.substring(2).concat(str.substring(0,2));
		}else {
			
		str1=str;	
		}
		
		return str1;
		
		
		
		
	}}
