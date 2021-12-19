package day22_stringManipulation_Lab;

public class Lab3_Question10 {

	public static void main(String[] args) {
		
		System.out.println(frontAgain("edited"));
		System.out.println(frontAgain("edit"));
		System.out.println(frontAgain("ed"));
		System.out.println(frontAgain("abcdeggab"));
	}

	public static boolean frontAgain(String str) {
		
		String a= "";
		String b= "";
		a = str.substring(0,2);
		b = str.substring(str.length()-2);
		
		if (a.equals(b)){
		       return true;
		}else {
			
				return false;
		}
		
		
	}

}
