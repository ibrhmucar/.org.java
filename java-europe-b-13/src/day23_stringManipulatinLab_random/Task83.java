package day23_stringManipulatinLab_random;
import java.util.*;
public class Task83 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner (System.in);
	Random  rn = new Random();
	String userAnswer = "";
	
	
	do {
	
	int num1 = rn.nextInt(6)+1;
	int num2 = rn.nextInt(6)+1;
	
	System.out.println("rolling dice...");
	System.out.println("Their values are:" + num1 + " " + num2);
	System.out.println("Roll them again (y=yes) ? ");
	userAnswer = sc.next();
		
		
		

	} while (userAnswer.equalsIgnoreCase("y"));
	
	System.out.println("bye bye....");
	

}
}