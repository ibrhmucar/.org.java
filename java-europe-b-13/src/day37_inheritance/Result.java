package day37_inheritance;
import java.util.*;
public class Result {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int question;
		int missed;
		
		System.out.println("How many question are on the final exam?");
		question = scan.nextInt();
		System.out.println("How many question did the student missed?");
		missed= scan.nextInt();
		
		//GredeActicity grad = new GredeActicity();
		FinalExam fin = new FinalExam(question,missed);
		
		
		System.out.println("The final grade Acticity is " + fin.getGrade());
		
		
		
		
	}

}
