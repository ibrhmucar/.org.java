package day24_arrays_part1;

import java.util.Scanner;

public class Task86MonthName {

public static void main(String[] args) {	
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter your month index number:");
	int index = scan.nextInt();
	

	
		String [] month = new String[13];
		
		
		month[1]= "Jen";
		month[2]= "Feb";
		month[3]= "March";
		month[4]= "April";
		month[5]= "May";
		month[6]= "Jun";
		month[7]= "July";
		month[8]= "Agust";
		month[9]= "September";
		month[10]= "October";
		month[11]= "November";
		month[12]= "December";
		
		System.out.println("The month is " + month[index]);

	}

}
