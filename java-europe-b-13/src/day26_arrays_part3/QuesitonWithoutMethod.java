package day26_arrays_part3;
import java.util.Scanner;
public class QuesitonWithoutMethod {


	
public static void main(String[] args) {
		
	Scanner sc = new Scanner (System.in);	
	String [] cars = new String [10];
	System.out.println("Enter want to search car: ");
	String search = sc.next();
	boolean flag = true;
	
	for (int i=0 ; i<cars.length ; i++) {
	System.out.println("Enter your car # " + (i+1));
	cars[i] = sc.next();
	}
	for (String value : cars) {
		if (value.equalsIgnoreCase(search)) {
		    flag = true;
		    break;
		}else {
		    flag = false ;
		}
	}
		if (flag==true) {
			System.out.println("True");
		}else {
			System.out.println("False");
	    }
}}

