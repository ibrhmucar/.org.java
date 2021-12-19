package MyWorks;
import java.util.Scanner;
public class palindromNumbers {

	public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	System.out.println("Please Enter Number");
	int num = scan.nextInt();
	isPalindrome(num);

	
	
	
	
	
	}

	private static void isPalindrome(int num) {
		
		int temp, reversNumber=0 , res;
		temp=num;
		
		while (temp!=0) {
		res=temp%10;
		reversNumber=reversNumber*10+res;
		temp/=10;
		}
		
	
		if (num==reversNumber) {
		System.out.println("True");
		}else {
		System.out.println("False");	
		}
}
}