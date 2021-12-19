package day21_stringMaipulation_part3;

import java.util.Scanner;

public class Test {

	
		public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int number, max;
		System.out.print("Enter Number 1 : ");
		
		number = input.nextInt();
		max = number;

		do {
		System.out.print("Enter Number 2 : ");	
		number = input.nextInt();

		if (number > max)
        max = number;
		
       }while (number != 0);
		
		
System.out.println("max is " + max);
System.out.println("number " + number);

}
}
	

