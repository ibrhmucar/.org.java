package Week3;
import java.util.Scanner;
public class MaxAndMinWithLoop {

	public static void main(String[] args) {
				
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter number");
		int first=scan.nextInt();
		
		
		int max=first;
		int min=first;
		
		for (int i=1 ; i<=4 ; i++) {
			System.out.println("Enter another number");
			int number = scan.nextInt();
			
			if (number>max) {
				max=number;
						
			}if (number<min) {
				min=number;
			
			}
			
			
		}
		
			System.out.println("Max number" + max);
			System.out.println("Min number" + min);
	
	
	}

}
