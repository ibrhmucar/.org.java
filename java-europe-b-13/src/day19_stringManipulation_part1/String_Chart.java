package day19_stringManipulation_part1;

public class String_Chart {
	
	public static void main(String[] args) {
		
		
    String name = "Mike Smith"	;
	
	System.out.println(name.length());
	System.out.println(name.charAt(0));
	System.out.println(name.charAt(1));
	System.out.println(name.charAt(2));	
	System.out.println(name.charAt(3));	
	System.out.println(name.charAt(4));	
	System.out.println(name.charAt(5));
	System.out.println(name.charAt(6));	
	System.out.println(name.charAt(7));
	System.out.println(name.charAt(8));
	System.out.println(name.charAt(9));
	//System.out.println(name.charAt(10));
	System.out.println("=============================================");
	System.out.println();


	String word2 = "Apple";
	
	if (word2.charAt(0)=='A') {
	
	System.out.println("true");
	}else {
		
	System.out.println("False");	
	}
	
	System.out.println("=============================================");
	System.out.println();	
	
	
	String word3 = "civic";
	
	if (word3.charAt(0)==(word3.charAt(4))) {
		
		System.out.println("true");
	}else {
		System.out.println("false");
	}
	
	System.out.println("=============================================");
	System.out.println();	
	
	char first = word3.charAt(0);
	char last = word3.charAt(4);
	
	if (first==last) {
		System.out.println("true");
	}else {
		
		System.out.print("false");
	}
 	
	String word4 = "Java Script";
	
	char lastChar = word4.charAt(word4.length()-1);
	
	System.out.println("last character of " + word4 + " is " + lastChar);
	
		
	}

}
