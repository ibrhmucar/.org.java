package day18_readingUserInput;
import java.util.Scanner;
public class UserInput3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter first number");
		
		int num1 = sc.nextInt();
		
		System.out.println("Enter second number");
		int num2 = sc.nextInt();
		
		sc.nextLine(); // if we don't write this statement, java doesn't read the line 18-19.
		
		System.out.println("Enter a string");
		String str = sc.nextLine();
		
		
		System.out.println("Output:" + num1 + " : " + num2 + " : " + str);
		
		
		
	}

}
