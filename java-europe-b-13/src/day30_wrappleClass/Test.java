package day30_wrappleClass;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		
		String str1 = "&^%^1&8O^^..ne. .52||{{T.*@,(wo#$ %^*f!@%^<<i86876ve&%^$ ^%$S$..,,!i!%*&#x&*@!$";
		
		
		
	}	
  
	    public static String filterInt(String a) {
				
	    	  String b= "" ;
			  	
				    	for (int i=0 ; i<a.length() ; i++) {
						if (Character.isDigit(a.charAt(i)))  {
							
							b = b + a.charAt(i);
						}
					}
		
		
				    	String[] arr = b.split(" ");
						
						String str2= "";
						for(String value : arr) { // 
							
							str2 = str2 + getDigit(value) + " ";
							
						}
						
						return str2;


	}

	    public static String getDigit(String st) { //ONE
			
			switch(st.toUpperCase()) {
			
			case "ZERO":
				return "0";
			case "ONE":
				return "1";
			case "TWO":
				return "2";
			case "THREE":
				return "3";
			case "FOUR":
				return "4";
			case "FIVE":
				return "5";
			case "SIX":
				return "6";
			case "SEVEN":
				return "7";
			case "EIGHT":
				return "8";
			case "NINE":
				return "9";
			default:
				return "";
				
			}				
}
}