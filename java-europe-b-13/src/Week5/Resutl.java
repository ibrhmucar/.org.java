package Week5;

public class Resutl {

	public static void main(String[] args) {
		
		//frequency abc = new frequency();
	
		
		String str = "aabbcdeaagg";
		String result = "";
		
 		for (int i = 0; i < str.length();i++ ) {

 			char each = str.charAt(i);

 			if (!result.contains(""+each)) {
 				result+=each+" : "+ frequency.frequency(str,each)+" | ";
 			}
 		}
 		System.out.println(result.substring(0,result.length()-3));
	}
	
}
