package Replit;

import java.util.ArrayList;
import java.util.Arrays;

public class IntgerToStringToInteger {

	public static void main(String[] args) {
		   
		String[] r1 = {"3","2"};
	    int []   r2 = {1,2,3};
		
	    ArrayList sayilar = new ArrayList();
        sayilar.add(r1[0]);
        System.out.println(sayilar.toString());
	    
	    ArrayList<String> last = new ArrayList<>();
	    ArrayList<Integer> last2 = new ArrayList<>();
	    
	    for(String a : r1) {
	    	
	    	last.add(a);
	    }
		
		System.out.println(last.toString());
		
		
		for (String b : r1) {
			
			last.add(String.valueOf(b));
		}
		
		
	
		
		
	}

}
