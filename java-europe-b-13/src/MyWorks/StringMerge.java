package MyWorks;
import java.util.*;
public class StringMerge {
	
	public static void main(String[] args) {
	
	System.out.println(mergeStrings("java", "kavala"));	
		
		
	}
	public static String mergeStrings(String one, String two) {
	 
		String tree ="";
	    String last =""; 
	   if (one.length()>two.length()){
	     


	     for (int i=0 ; i<two.length() ; i++){
	       
	       tree += one.charAt(i)+""+two.charAt(i);
	     
	     }
	     
	      last = tree +""+one.substring(two.length(),one.length());

	      return last;

	     }else if (two.length() > one.length()) {

	       for (int i=0 ; i<one.length() ; i++){
	        
	       tree += one.charAt(i)+""+two.charAt(i);

	     }

	     last = tree +""+two.substring(one.length(),two.length());

	      return last;
	   }
	
	   
	


	       return last;
	  

	    
	  }}
