package day20_stringManipulation_part2;

public class String_ReplaceMethod2 {

	public static void main(String[] args) {
		
		
		String sentence = "Coding is fun, it is my hobby!!";
		String str = sentence.replace(" ","").replace(",","");
		System.out.println(str);
		
		
		
		//replace , with !!!
		
		String str2 = sentence.replace(","," !!!");
		System.out.println(str2);
		
		
		
		String mixed = "&^@#j$a-v|a@#$";
		mixed = mixed.replace("&^@#", "");
		System.out.println(mixed);
		mixed = mixed.replace("@#$", "");
		System.out.println(mixed);
		mixed = mixed.replace("$","").replace("-", "").replace("|","");
		System.out.println(mixed);
		
		
		
		String result = "About 8,930,000,000 result (0.68 seconds)";
		result = result.replace("About ", "").replace(" result (0.68 seconds)", "");
		System.out.println(result);
		
		
		
		
		
	}

}
