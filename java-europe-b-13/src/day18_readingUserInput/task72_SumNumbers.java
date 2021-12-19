package day18_readingUserInput;
import java.util.Scanner;
public class task72_SumNumbers {

	public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	System.out.println("Enter Number 1: ");
	int num1=scan.nextInt();
	System.out.println("Enter Number 2: ");
	int num2=scan.nextInt();
	System.out.println("Enter Number 3: ");
	int num3=scan.nextInt();
	
	
	int sum=num1+num2+num3;
	System.out.println("Total Number is : " + sum);

	}

}
