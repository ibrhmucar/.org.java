package day29_arrays_part5;

import java.util.Arrays;

public class reverse {

	public static void main(String[] args) {
		
	String a = "Java is fun";
	
	String [] b = a.split(" ");
	
	String reversed ="";
	
	for (int i=b.length-1 ; i>=0; i--) {
		
		reversed += b[i]+" ";
	}

    
	
    
    
    
    

    
    //Do not change below statement:
    System.out.println(reversed);
		
		
	}

}
