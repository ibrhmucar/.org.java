package Methods;

public class ReplacementMethod {

	public static void main(String[] args) {
	
		//System.out.println(replace("first bla bla" , "bla"));
		System.out.println(replace("one two three" , "two"));	
		//System.out.println(replace("he said bla bla bla" , "bla"));
		
	/*	String str = "he said bla bla bla";
	
		System.out.println(str.replace(" ", ""));	
		System.out.println(str.replace("bla",""));*/
	
	}

	private static String replace(String text, String badWord) {
		
		String str = badWord.replace(" ", "");
		
		String last = text.replace(str, "");
		
		int a = last.length();
		//return last.trim();
		
		for (int i=0 ; i<a-2 ; i++ ) {
			
			if (last.substring(i, i+2).equals("  ")) {
				
				last = last.replace("  "," ");
			
			}else {
				
				 last = last;  
			}
			
			
		}
		         
		
		       return last;
		
		
		
		
	}

}
