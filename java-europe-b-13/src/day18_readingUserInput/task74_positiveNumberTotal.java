package day18_readingUserInput;
import java.util.Scanner;
public class task74_positiveNumberTotal {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	int a,sum;
	sum=0;	
		do {
			System.out.print("Enter Number : ");
			a=scan.nextInt();
			
			
			if (a<0) {
				System.out.println("Invalid Number Bye Bye");
				break;
			
			}else {
				
				sum=sum+a;
			}
		} while (true); 
		  
		System.out.println("Total Number is " + sum);
		

	}

}
