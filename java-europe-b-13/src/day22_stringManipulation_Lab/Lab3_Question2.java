package day22_stringManipulation_Lab;

public class Lab3_Question2 {

	public static void main(String[] args) {
		

	System.out.println(makeAbba("Hi","Bye"));	
	System.out.println(makeAbba("Yo","Alice"));
	System.out.println(makeAbba("What","Up"));
		
	}

	public static String makeAbba(String a, String b) {
		
		//a = "Hi";
		//b = "Bye";
		String c = "\""+a+b+b+a+"\"";
		
		
		
		return c;
		
	}

}
