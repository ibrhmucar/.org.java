package day29_arrays_part5;

public class arr {

	public static void main(String[] args) {
	boolean flag = false;
	int [] arr = {1,2,3,4,5,6,7};	
		
     for (int i=0 ; i<arr.length ; i++) {
			
			if(arr[i]==7) {
				
				flag = true;
			    
			}else {
		
				flag = false;
		    	
		}

	}
           System.out.println(flag);
     
	}}
