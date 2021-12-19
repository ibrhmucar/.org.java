package day19_stringManipulation_part1;
import java.util.Scanner;
public class Task_75_Total_Number_of_Chracters {

	public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
		
	System.out.println("Enter your first name:");
	String first = scan.next();
	
	System.out.println("Enter your last name: ");
	String last = scan.next();
	


	System.out.println("number of character in your name and surname : " +  (first.length()+last.length()) );
		
		
		
		
		
	}

}
