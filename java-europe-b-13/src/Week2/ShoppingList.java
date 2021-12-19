package Week2;
import java.util.Scanner;
public class ShoppingList {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter Item1");
		String item= scan.next();
		
		Scanner scan1 = new Scanner (System.in);
		System.out.println("Enter Item1 Price");
		Double price1 = scan1.nextDouble();
		
		
		Scanner scan2 = new Scanner (System.in);
		System.out.println("Enter Item2");
		String item2= scan2.next();
		
		Scanner scan3 = new Scanner (System.in);
		System.out.println("Enter Item2 Price");
		Double price2 = scan3.nextDouble();
		
		
		Scanner scan4 = new Scanner (System.in);
		System.out.println("Enter Item3");
		String item3= scan4.next();
		
		Scanner scan5 = new Scanner (System.in);
		System.out.println("Enter Item3 Price");
		Double price3 = scan5.nextDouble();
		
		
		
		System.out.println("Item1: is "+ item + " Price " + price1 +", " + " Item2 is: "+ item2 +", " + " Price  " + price2 +", "+ " Item3 is "+ item3 + " Price  " + price3  );
		
		System.out.println("");
		
		System.out.println("Total Price " + (price1 + price2 + price3));
		
	
			
		}
		
		}
		
		
	


