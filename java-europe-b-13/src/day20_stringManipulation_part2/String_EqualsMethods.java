package day20_stringManipulation_part2;

public class String_EqualsMethods {

	public static void main(String[] args) {
		
		String s1 = "Welcome to Java";
		String s2 = "Welcome to Java";
		String s3 = "Welcome to c++";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));  
		
		
		
		String s4 = "Welcome to Java";
		
		String s5 = new String("Welcome to java");  // not in same pool.
		
		System.out.println(s5);
		 
        // you can not check s4==s5, also we have to use  equals.
		
		
		
		boolean b1 = s1==s2 ;
		boolean b2 = s1==s3 ;
		
		
		System.out.println(b1 + " " + b2);
		String s8 = new String ("Welcome to java");
		
		boolean b3 = s1==s8 ;
		boolean b4 = s1.equalsIgnoreCase(s8);
		System.out.println(b3 + " " + b4);
		
		
		
		
		
		
		
		
		
	}

}
