package day26_arrays_part3;
import java.util.*;
public class ArrayMethod2 {

	public static void main(String[] args) {
		
	
	System.out.println(FindeCar(3, "honda"));
	
	}
	
	
	public static String[] carSize(int numbers) {
		
		Scanner scan = new Scanner (System.in);
		String [] carArray = new String [numbers] ;
		
		for (int i=0 ; i<carArray.length ; i++) {
			System.out.println("Enter your car #  " + (i+1));
			carArray[i] =scan.next();
			
			
			
		}
		
		return carArray;
		
		
	}
	
	public static boolean FindeCar(int value, String cars) {
		
		for(String car : carSize(value)) {
		
			if(car.equalsIgnoreCase(cars)) {
				
				return true;
			
			}
			
			}
			return false;
	}
	
	}


