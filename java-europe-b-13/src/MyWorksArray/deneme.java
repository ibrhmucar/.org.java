package MyWorksArray;

import java.util.Arrays;

public class deneme {

	public static void main(String[] args) {
		
		String str =  "olive, hot pursuit, warning, python, angle, coffee, beech, boost, trainer";
		
		method(str);
	
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
			
	
		
		if(min<str2.length) {
		
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


