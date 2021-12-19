package Week7;

public class WrapperClassCharacters {

	public static void main(String[] args) {
		
		
		
char ch = 'a';
boolean isDigit = Character.isDigit(ch);
boolean isLetter= Character.isLetter(ch);
boolean isLowerCase = Character.isLowerCase(ch);
boolean isUpperCase = Character.isUpperCase(ch);
boolean isSpecial = ! Character.isLetterOrDigit(ch);

 // System.out.println(isDigit);
 // System.out.println(isLetter);
 // System.out.println(isLowerCase);
 // System.out.println(isUpperCase);
 // System.out.println(isSpecial);

	System.out.println(sumOfDigits("a1b2c3"));

	}
	
	public static int  sumOfDigits(String str) {  
		int sumOfDigits = 0 ;
		
		for (char each : str.toCharArray()) {
			if(Character.isDigit(each)) {
				sumOfDigits+=Integer.parseInt(Character.toString(each));
			}
		}
		
		
		
		
		
		return sumOfDigits;
	
	
	}
	
}	