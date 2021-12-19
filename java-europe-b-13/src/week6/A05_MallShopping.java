package week6;

import java.util.Arrays;

public class A05_MallShopping {

	public static void main(String[] args) {
		
		
		String [] items = {"Shoes", "Jacket", "Gloves", "Airpods" , "iPad" , "iPhone 12 case"};
		double [] price = {99.99, 150.0, 9.99, 179.99, 249.9, 39.99};
		int [] itemIDs  = {12345, 12346, 12347, 12348, 12349, 12350};
		
		
		System.out.println(Arrays.binarySearch(items, "Gloves")); // Gloves'ın index numarasını bulma
		
		int count = 0;
		for (String a : items) {
			if (a.equals("Gloves")) {
			
				System.out.println("index of the item : " + count);	
				
			}
		   count++;
		}
		
		
		
		boolean flag = false;
		for (String b : items) {
			
			if (b.equals("iPad")) {
			flag = true;	
			break;
	
			}
		
		}
		
		System.out.println(flag);
		System.out.println(Arrays.toString(items).contains("iPad"));
		
		
		for (int i=0 ; i<items.length ; i++) {
			
			
			System.out.println(items[i]+" "+ price[i]+" " + itemIDs[i]+ ", ");
			
		
		
		}
		
			for (int i=0 ; i<items.length ; i++) {
			
			if (items[i].equals("Jacket")) {
			System.out.println(items[i]+" "+ price[i]+" " + itemIDs[i]+ ", ");
		
			}
		
		
	
			}
}
}