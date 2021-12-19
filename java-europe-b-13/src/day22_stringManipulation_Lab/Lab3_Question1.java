package day22_stringManipulation_Lab;

public class Lab3_Question1 {

	public static void main(String[] args) {
		
	System.out.println(helloName("Bob"));	
	System.out.println(helloName("Alice"));	
	System.out.println(helloName("X"));
	
	}

	public static String helloName(String string) {
		
		String hello = "Hello ";
		String a = hello.concat("").concat(string).concat("!");
		
		
		
		return a;
		
		
		
	}

}
