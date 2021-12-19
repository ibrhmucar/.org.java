package MyWorks;


import Week2.scannerClass2;
public class Dublicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
		
		
	
	
	String str = "jhakdlkajşklnakjskdşakjsdşlak";
	
	String result = "";
	
	for (int i=0 ; i<str.length() ; i++) {
		
		char each = str.charAt(i);
		
		if(!result.contains(""+each)) {
			
			result+=each;
		}
		
		
	}
	
	  System.out.println(result);
		
		
		
		
		
	}

}
