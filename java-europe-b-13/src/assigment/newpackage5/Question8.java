package assigment.newpackage5;

import  java.util.Scanner;


public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner (System.in);
		System.out.println("Enter number");
		int b=scan.nextInt();
		
		int num=0; int sum=0;
	
		while (num <= b) {
			
			
			 sum+=num;
			
			 num++;
				
		}
	
		System.out.println(sum);
		
		
		
	}

}
