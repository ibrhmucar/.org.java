package MyWorks;
import java.util.Scanner;
public class ReplitTasks {

	public static void main(String[] args) {
		

		Scanner in = new Scanner(System.in); 
		  LameCalculator lc = new LameCalculator();
		  System.out.println("Enter Number");
		  int a = in.nextInt();
		  System.out.println("Enter Number");
		  int b = in.nextInt();
		  System.out.println(lc.plus(a, b)); 
		  System.out.println(lc.minus(a, b));
		  System.out.println(lc.multiply(a, b));
		  System.out.println(lc.divide(a, b));

		 
		    
}
}