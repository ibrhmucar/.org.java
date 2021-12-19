package week6;

public class A06FindMAx {

	public static void main(String[] args) {
		
		String [] items = {"Shoes", "Jacket", "Gloves", "Airpods" , "iPad" , "iPhone 12 case"};
		double [] price = {99.99, 150.0, 9.99, 179.99, 249.9, 39.99};
		int [] itemIDs  = {12345, 12346, 12347, 12348, 12349, 12350};	
		
		int index=0;
		double max = Integer.MIN_VALUE; 
		  for(int i=0; i<price.length; i++){
		      if(max<price[i]){
		         max = price[i];
		         index = i;
		         }        
		}
		System.out.println(max+" " + items[index]+ " " + itemIDs [index]);
		
		
		double maxPrice = price[0];
		int indexOfMaxPrice = 0;
		
		for (int i=0 ; i<price.length ; i++) {
			if(price[i] > maxPrice) {
				maxPrice = price[i];
				indexOfMaxPrice = i;
				
			}
		}
			System.out.println(items[indexOfMaxPrice] + " - " + price[indexOfMaxPrice] + " Euros - # " + itemIDs[indexOfMaxPrice]);
}
}