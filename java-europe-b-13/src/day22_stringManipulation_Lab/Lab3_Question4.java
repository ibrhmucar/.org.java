package day22_stringManipulation_Lab;

public class Lab3_Question4 {
	
	public static void main(String[] args) {
		
	System.out.println(firstTwo ("Hello"));	
	System.out.println(firstTwo ("abcdefg"));	
	System.out.println(firstTwo ("ab"));	
	System.out.println(firstTwo ("a"));	
	System.out.println(firstTwo (""));	
	System.out.println(firstTwo ("Hello"));	
		
		
		
	}

	public static String firstTwo(String str) {
		String a="";
		
		if (str.length()<2) {
			a = str.substring(0);
		}else if(str.isEmpty()) {
			a = "";
		}else {
			a= str.substring(0,2);
		}
		 
		 return a;
		
		
		
		
		
		
	}

}
