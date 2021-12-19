package day20_stringManipulation_part2;

public class String_IndexOf {

	public static void main(String[] args) {
		
		String word1 = "github";
		
		System.out.println(word1.indexOf("g"));
		System.out.println(word1.indexOf("th"));
		System.out.println(word1.indexOf("hub"));
		System.out.println("===========================================");	
		System.out.println("java");
		System.out.println("===========================================");
		
		String url = "www.okta.com";
		int i = url.indexOf(".");
		System.out.println("pos of ." + i);
		System.out.println(url.charAt(i+1));
		
		System.out.println("===========================================");		
		
		String title = "Java - Google Search";
		
		System.out.println(title.indexOf("-"));
		System.out.println(title.indexOf(" "));
		System.out.println(title.charAt((5)-1));
		System.out.println(title.charAt((5)+1));
		System.out.println("===========================================");
		
		
		for (int a=0 ;  a<title.length()-8 ; a++) {
			
			if (title.charAt(a)== ' ' ) {
				
				System.out.println("Space :" + a);
			
			}else {
				
				continue;
			
			}}
		
		System.out.println("===========================================");
		
		String country = "United States of America";
		int states = country.indexOf("State");
		System.out.println("Position of state is :" + states);
		
		System.out.println("===========================================");
		
		String word2 = "java, c++ ,python, tomcat, eclipse";
		
		if (word2.contains("c++")) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
		
		if (word2.indexOf("c++")>-1) {
		
			System.out.println("c++");
		}else {
			System.out.println("no c++");
		} 
		
		
		
		
	}

}
