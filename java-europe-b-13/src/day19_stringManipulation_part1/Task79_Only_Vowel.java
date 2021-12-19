package day19_stringManipulation_part1;

public class Task79_Only_Vowel {

	public static void main(String[] args) {
		
	String str = "CybertekSchool"; //(a,e,o,i,u)
	
	
	for (int i=0 ; i<str.length(); i++) {
		
		if (str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='o' || str.charAt(i)=='i' ||str.charAt(i)=='u') {
			
			System.out.print(str.charAt(i));
			
		   if (i!=str.length()-2) {
			   
			System.out.print(", "); 
			
		   }
		}

	}
		
	}

}
