package day24_arrays_part1;
import java.util.Scanner;

public class Task87DayofWeek {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter number of day");
		int index = scan.nextInt();
		
		
		String [] days = new String[8];
		
		days[1] = "monday";
		days[2] = "tuesday";
		days[3] = "wednesday";	
		days[4] = "thursday";
		days[5] = "friday";
		days[6] = "saturday";
		days[7] = "sunday";
		
		
		System.out.println("The day of you enter is " + days [index]);
	
	
	
	
	}
	
	
	
	
	

}
