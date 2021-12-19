package assignment6;

public class Question6 {

	public static void main(String[] args) {
		 
		int b=4;
	
	        for(int i=1;i<6;i++) {
	        
	        int a=i;
	        for(int j=0;j<i;j++) {
	        	        	
	        	if (i==1) {
	            System.out.print(i +" ");
	            }else {
                System.out.print(a +" ");
	            a = a + b;
	            b--;
             }
	        	
            }
	            b = 4;
	            System.out.println();
	         }
	    }
	}

