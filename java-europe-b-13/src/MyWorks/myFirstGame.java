package MyWorks;

import java.util.Scanner;
import java.util.Random;
public class myFirstGame {

public static void main(String[] args) {
	
	
	Scanner scan = new Scanner (System.in);
	Random rn = new Random();
	int a=0;
	int b=rn.nextInt(20);
	int c;
	
	do {
		System.out.println("Please Enter Number 1-20");
		a=scan.nextInt();
		
		   if(a>0 && a<=20) {
		
		          if (a>b) {
			         c=a-b;
			
			        if (c>=0 && c<5) {
				    System.out.println("Too close, try again : ");
				
			        }else if (c>=5 && c<15) {
			        System.out.println("Not Bad, try again : ");
				
			        }else if (c>=15 && c<=20) {
			        System.out.println("Too far, try again : ");
			        }
		
		           }else if (b>a) {
		        	        c=b-a;
		           if (c>=0 && c<5) {
				   System.out.println("Too close, try again : ");
				
		           }else if (c>=5 && c<15) {
				   System.out.println("Not Bad, try again : ");
				
		           }else if (c>=15 && c<=20) {
				   System.out.println("Too far, try again : ");
				   }	
		          
		           }else if (a==b) {
		           System.out.println("You know the number, bye bye !");
			       break;
		           }
		}else {
			System.out.println("Your Number That You Enterd Is Not Valid");
			break;
			}
		
	}while (a!=b);	
		
}
}
