package MyWorks;
import java.util.Scanner;
public class Cube {

	public static void main(String[] args) {
	 
	cube();	
}

	public static void cube() {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter number");
		int n= scan.nextInt();
		int sum=1;
		int c=3;
		
		for (int i=c ; i>=1 ; i--) {
		
		
		sum=sum*n;
			
			
		}
		System.out.print(sum);
		
	}
}