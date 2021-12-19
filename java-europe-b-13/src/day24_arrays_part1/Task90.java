package day24_arrays_part1;
import java.util.*;
public class Task90 {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner (System.in);
	System.out.println("Enter your car name: ");
	String carName = scan.next();
	boolean flag= false;
	String [] carList = {"Honda" , "Toyota" , "Ferrari", "Porsche"  , "Mercedes" , "BMW" };
	
	
	for (int i=0 ; i<carList.length ; i++) {
	
	
		if(carList[i].equals(carName)) {
			
			flag = true;
			break;
		}	
	
	}
	
	   if (flag) {
		   
		   System.out.println("Found it");
	   }else {
		   
		   System.out.println("Not found it");
	   }
	}
}
