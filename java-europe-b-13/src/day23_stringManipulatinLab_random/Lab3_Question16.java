package day23_stringManipulatinLab_random;

public class Lab3_Question16 {

	public static void main(String[] args) {
		
	System.out.println(atFirst("hello"));
	System.out.println(atFirst("h"));
	System.out.println(atFirst("hi"));
		
		

	}

	private static String atFirst(String str) {
		
		if (str.length()>=2) {
			
			str = str.substring(0,2);
			return str;
		}else if(str.length()<2) {
			str = str.substring(0).concat("@");
			return str;
		}
		
			return str;
		
	}}
