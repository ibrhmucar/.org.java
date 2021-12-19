package day21_stringMaipulation_part3;

public class String_SubstringMethod {

	public static void main(String[] args) {
		
		String s1 = "JavaScript";
		
		System.out.println(s1.substring(2));
		System.out.println(s1.substring(s1.length()-4));
		System.out.println(s1.substring(3));
		System.out.println(s1.substring(5,5));
		
		
		String chars = "{{}}";
		String word = "AUTOMATION";
		
		String a = chars.substring(0,2).concat(word).concat(chars.substring(2,4));
		System.out.println(a);
		
		System.out.println(word.toLowerCase());
		System.out.println(s1.toUpperCase());

		String b = s1.substring(0,5).toUpperCase();
		System.out.println(b+ s1.substring(5));
	   
		
		String str = "        Programming is fun";
		System.out.println(str.trim());
		
		String str2= " 342 ";
		System.out.println(str2.trim());
		System.out.println("|"+str2.trim()+"|");
		
		
		
		
		
		
	}

}
