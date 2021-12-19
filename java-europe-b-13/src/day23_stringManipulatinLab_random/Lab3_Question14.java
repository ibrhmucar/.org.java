package day23_stringManipulatinLab_random;

public class Lab3_Question14 {

	public static void main(String[] args) {
	
	System.out.println(endsLy("oddly"));
	System.out.println(endsLy("y"));
	System.out.println(endsLy("dlyaly"));
	
	
	}

/*	public static boolean endsLy(String str) {
		
		if (str.endsWith("ly")) {
			return true;
		}else {
			return false;
		}
		
	}*/

	public static boolean endsLy(String str) {
		
		if (str.length()<2) {
			return false;
		}
		
		if (str.substring(str.length()-2).equals("ly")) {
			return true;
			
		}else {
			return false;
		}
		
	}
	
	
	
	
}
