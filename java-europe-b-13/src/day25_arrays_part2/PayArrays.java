package day25_arrays_part2;
import java.util.*;
public class PayArrays {

	public static void main(String[] args) {
		
		final int EMPLOYEES = 5 ;
		double payRate;
		double grossPay;
		
	Scanner sc = new Scanner (System.in);
	
		int [] hours = new int [EMPLOYEES];
		
		System.out.println("Enter the hours worked by " + EMPLOYEES + "  employees who all earn the same hourly wage");
		
		for (int i=0 ; i<EMPLOYEES ; i++) {
			hours [i] = sc.nextInt();
		}
		
		System.out.println("Enter the hourly rate for each employee");
			payRate = sc.nextDouble();
			
		
		for(int i=0 ; i<EMPLOYEES ; i++) {
			grossPay = hours [i]*payRate;
			System.out.println("Employee # " + (i+1) + " : $ " + grossPay);
		}
		

	}

}
