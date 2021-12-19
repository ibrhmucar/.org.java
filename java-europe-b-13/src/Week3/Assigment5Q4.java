package Week3;

import java.util.Scanner;
public class Assigment5Q4 {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	int product;
	product=0;
	
	outer: while (product<100) {
		
	System.out.println("Enter Number");
	
	int number=scan.nextInt();
	
	inner: while (number*10>100) {
	System.out.println("invalid number");
	
	continue outer;
	
		
	}
	
	product+=number*10;
	System.out.println("Product value is " + product);
	
	}
	
	System.out.println("the end");

	}

}
