package MyWorksArray;

import java.util.Arrays;

public class PrintShortes2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str =  "olive, hot pursuit, warning, python, angle, coffee, beech, boost, trainer";
		String str6=  "volt, olive, fish, hot pursuit, warning, python, java, coffee, part";
		String str7=  "olive, fish, pursuit, warning, old, python, java, coffee, cat, ray";
		method(str);
		method(str6);
		method(str7);
		
	}		
		public static void method(String str1) {
		
		String[] str2 = str1.split(", ");
		
		int count = 0;		
		int min = str2[0].length();
		
		
		for (int i=0 ; i<str2.length ; i++) {
			count = 0;	
			for(int j=0 ; j<str2[i].length() ; j++) {
			count++;	
			
			}
			if(min>count) {
			min=count;
			}
		}	
			
	
		
		if(min<5) {
		
		 String[] last = new String[min];
		 int a=0;
	     for(int i=0 ; i<str2.length ; i++) {
	    	 if(str2[i].length()==min) {
	    	 	last[a]=str2[i];
	    	 	a++;
	    	 }else {
	    		 continue;
	    	 }
	     }
	    
	     Arrays.sort(last);
		 System.out.println(Arrays.toString(last));   
	    	
	}else if(min==5) {
		
			
			 String[] last = new String[min-1];
			 int a=0;
		     for(int i=0 ; i<str2.length ; i++) {
		    	 if(str2[i].length()==min) {
		    	 	last[a]=str2[i];
		    	 	a++;
		    	 }else {
		    		 continue;
		    	 }
		     }
		    
		     Arrays.sort(last);
			 System.out.println(Arrays.toString(last));  
	}
	}
}
