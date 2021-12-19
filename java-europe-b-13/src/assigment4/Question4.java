package assigment4;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner (System.in);
		 
		 System.out.println("Enter cents:");
		 int a=scan.nextInt();
         
		 int b,c,d,e,f;
		  
		  if (a>=25 && a<=100) {
			  
		  f= 100-a;  
		  e= (f/25);
		  b= (f%25)/10;
		  c= ((f%25)%10)/5;
		  d= ((f%25)%10)%5;

		System.out.println("Your change is " + e +" quarters, "+ b + " dimes, "+ c + " nickels, and "+ d + " pennies");
		  
		  }else{
		   
		 System.out.println("Invalid cents amount");	
		
		 }	

	}

}
