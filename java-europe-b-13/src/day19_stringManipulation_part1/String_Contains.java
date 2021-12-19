package day19_stringManipulation_part1;

public class String_Contains {

	public static void main(String[] args) {
		
		
	/*	String str = "Hello Mike, welcome to Cybertek World.";
		boolean bool = str.contains("Cybertek");
		System.out.println(bool);
		System.out.println(str.contains("Mike"));*/
		
		
		String email = "test@gmail.com";
		
		if (email.contains("@")) {
		System.out.println("true");
		}else {
		System.out.println("false");	
		}
	
	
		String list = "potoes, tomatoes, eggs, milk, bread, cereal, meat, apples";
		if (list.contains("apples")) {
		System.out.println("list include Apple");
		}else {
		System.out.println("list does not include Apple");	
		}
	
		
		
		boolean hasEggs = list.contains("eggs");
		System.out.println("contain eggs : "  + hasEggs);
	
		
		email = "name@yahoo.com";
		
		if (email.contains("@yahoo")) {
			System.out.println("Yahoo account");
			
		}else {
			System.out.println("does not yahoo account");
		}
		
		
		
		String etsyTitle = "Car | Etsy";
		
		if(etsyTitle.contains("|")) {
			System.out.println("Pipe is the as expected");
			
		}else {
			
			System.out.println("Pipes is not detected");
		}
		
		
		
	
	}
	
	
	
	
	
	
	

}
