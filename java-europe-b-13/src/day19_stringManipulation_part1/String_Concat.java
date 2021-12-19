package day19_stringManipulation_part1;

public class String_Concat {

	public static void main(String[] args) {
		
	/*	String s1 = "Hello ";
		String s2 = "World";
		String s3 = s1.concat(s2);
		System.out.println(s3);
		System.out.println(s1.concat(s2));*/
		
		
		String word = "Java";
		
		System.out.println(word.concat(" + selenium"));
		System.out.println(word.concat(" in eclipse"));
		
		
		System.out.println(word);
		
		
		word = word.concat("+eclipse");
		System.out.println(word);
		
		word =  word + true ;
		System.out.println(word);
		
		
		String word2 = "hi";
		word2 = word2.concat("-hey").concat("-how are you").concat("-good");
		System.out.println(word2);
		

	}

}
