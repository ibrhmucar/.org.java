package MyWorks;

import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter Number");
		int num= scan.nextInt();

		int i=1;
		        

	    	 
	    	 while (i<=num) {
                 
                 if (i%2==1 && i<num-1) {
                                     
                     System.out.print(i + ", ");
                     
                 }else if(i%2==0 && i==num) {
                     
                     System.out.print(i-1);
                     
                 }else if (i==num){    
                	 
                	 System.out.print(i);
                 }
             
             i++;

	    	 }
	     }
}