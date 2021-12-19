package Week5;

public class Dummay {

public static void main(String[] args) {
	
	

		String str = "jhakdlkajşklnakjskdşakjsdşlak";
		String result = "";
		
 		for (int i = 0; i < str.length();i++ ) {

 			char each = str.charAt(i);

 			if (!result.contains(""+each)) {
 				result+=each;//+" : "+frequency(str,each)+" | ";
 			}
 		}
 		System.out.println(result);//.substring(0,result.length()-3));
	}


public static int frequency(String string, char c) {  // our base methods for coming tasks
	
	int count = 0;  
	
	for (int i =0; i<string.length(); i++) {
			
			if(string.charAt(i) == c) {
				count++;
			}
		}
	
	return count;
   
}
}