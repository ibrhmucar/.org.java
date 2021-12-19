package MyWorks;

import java.util.ArrayList;
import java.util.Arrays;

public class someWorks {

	public static void main(String[] args) {
		
		
	    
	    Integer I = Integer.parseInt("10");
        System.out.println(I+10);
        
		
		Integer I2 = Integer.valueOf("123");
        System.out.println(I2);
        Integer I4 = Integer.valueOf("1111");
        System.out.println(I4);
		
        
        Integer a = new Integer (10);
        System.out.println(a);
        String c = a.toString();
        System.out.println(c+10);
        
        
        ArrayList<Integer> number = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        ArrayList<String> str = new ArrayList<>();
        
        for(Integer j : number) {
        	str.add(j.toString());
        }
        
        System.out.println(str.toString());
        
        
	}

}
