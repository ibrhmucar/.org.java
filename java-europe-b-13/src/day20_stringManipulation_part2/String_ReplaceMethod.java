package day20_stringManipulation_part2;

public class String_ReplaceMethod {

	public static void main(String[] args) {
	
		String str = "Ebay is a very good website";
		String a = str.replace("Ebay" , "Bestbuy");
		
		System.out.println(a);
		
		String str1 = "Moscow is a capital of Russiarr";
		String str2 = str1.replace("Moscow", "Bakü").replace("Russia", "Azerbaycan");
		System.out.println(str2);
		
		
		String email = "firsName_LastName@gmail.com";
		String company = "capitalone";
		
		String newEmail = email.replace("gmail", company );
		System.out.println(newEmail);
		
		
	
		
		

	}

}
