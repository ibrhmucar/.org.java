package day30_wrappleClass;

import java.util.Arrays;

public class Task97 {

	public static void main(String[] args) {
		
		String str = "(((W&e**_lco73me %t%o co!@$,,<r>e <J>>>$@av```~a777.||}{";	
		
		System.out.println(filterString(str));
		System.out.println(filterInt(str));
		
		int a = 0 ;
		String b = "123";
		a = Integer.parseInt(b);
		System.out.println(a);
		
		
	}
	public static String filterString(String s) {
		
		String str1 = "";
		
		
		for (int i=0 ; i<s.length() ; i++) {
			if (Character.isAlphabetic(s.charAt(i)) || s.charAt(i) == ' ')  {
				
				str1 = str1 + s.charAt(i);
			}
			
		}
		
		return str1;
		
		
		
	} public static String filterInt(String a) {
		String b= "" ;
		
		
			
			for (int i=0 ; i<a.length() ; i++) {
				if (Character.isDigit(a.charAt(i)))  {
					
					b = b + a.charAt(i);
				}
			}
			
			
			
			return b;
			
	}
	
	public static String upperCase(String d) {
		String c= "" ;
		
		
			
			for (int i=0 ; i<d.length() ; i++) {
				if (Character.isUpperCase(d.charAt(i)))  {
					
					c = c + d.charAt(i);
				}
			}
			
			
			
			return c;
			
	
	}
	
	public static String lowerCase(String daa) {
		String cc= "" ;
		
		
			
			for (int i=0 ; i<daa.length() ; i++) {
				if (Character.isLowerCase(daa.charAt(i)))  {
					
					cc = cc + daa.charAt(i);
				}
			}
			
			
			
			return cc;
	
	}	
	public static String specialCharacters(String db) {
		String cb= "" ;
		
		
			
			for (int i=0 ; i<db.length() ; i++) {
				
				if ((!Character.isDigit(db.charAt(i))) && (!Character.isAlphabetic(i)) && (!Character.isLowerCase(db.charAt(i))) && (!Character.isUpperCase(db.charAt(i)))) {
					
					cb = cb + db.charAt(i);
				}
			}
			
			
			
			return cb;
	
	}	
	
	

}
