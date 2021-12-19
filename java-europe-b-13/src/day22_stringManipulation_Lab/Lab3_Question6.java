package day22_stringManipulation_Lab;

public class Lab3_Question6 {

	public static void main(String[] args) {
		
	System.out.println(withoutEnd("Hello"));	
	System.out.println(withoutEnd("java"));	
	System.out.println(withoutEnd("coding"));
	System.out.println(withoutEnd("Ho"));
	

	}

	public static String withoutEnd(String str) {
		
		String str1 = "";
		
		if (str.length()>3) {
			str1 = str.substring(1,str.length()-1);
			return str1;
		}else {
			return "invalid type";
			
			
		}
			
		
		
		
		
		
		
	}

}
