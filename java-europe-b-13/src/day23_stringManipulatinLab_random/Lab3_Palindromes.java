package day23_stringManipulatinLab_random;

public class Lab3_Palindromes {

	public static void main(String[] args) {
		
		String str = "madam";
		
		String str1 = "";
		
		
		for (int i=str.length()-1 ; i>=0 ; i--) {
			
			str1 = str1 + str.charAt(i);
				
		}
		
			if (str.replace(" ","").equalsIgnoreCase(str1.replace(" ",""))) { // boşluk olması durumunda kaldırı ve eşit olup olmadığını kontrol eder.
				System.out.println("is palindromes"); 
			
			}else {
				System.out.println("is not palindromes");
				
			}

	}

	
	
	
	
}
