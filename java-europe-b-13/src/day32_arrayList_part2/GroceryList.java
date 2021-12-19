package day32_arrayList_part2;
import java.util.ArrayList;

public class GroceryList {
	
	ArrayList<String> groceryList = new ArrayList<>();
	
	
	
	
	
	
	public void addGroceryListItem(String item) {
	
		 groceryList.add(item);
		
		
	}	
	
	
	public void printGroceryList(){
	
	       System.out.println("You have " + groceryList.size() + " item in your grocery list");
	       for (int i=0 ; i<groceryList.size() ; i++) {
	    	 System.out.println((i+1)+ ". " + groceryList.get(i));  
	    	   
	       }
		}

	public void modifyGroceryItem(int position, String newitem) {
		
		groceryList.set(position,newitem);
		System.out.println("Grocery item " + position+1 + " has been modified") ;
		
		
	}

	 public void removeGroceryItem(int position) {
		 groceryList.remove(position);
		 
	 
	}
	 
	 public String findItem(String searchItem) {
		 
		 int position = groceryList.indexOf(searchItem);
			if(position>=0) {
				return groceryList.get(position);
			}
			return null;
	 }



}

