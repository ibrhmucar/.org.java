package Week8;

import java.util.ArrayList;
import java.util.Collections;

import javax.lang.model.element.QualifiedNameable;

public class AmazonTest {

	public static void main(String[] args) {
		
		ArrayList<item> items = new ArrayList<>();
		
		
		items.add(new item("Sony Vaio i7", 950.0 ,10 ));
		items.add(new item("Lenove", 800.0, 20));
		items.add(new item("LG Ultrawide Monitor", 450.0, 13));
		items.add(new item("Hp Laptop", 750.0, 24));

		
		double valueOfInventetory = 0;
		
		int largestQuantity=0;
		
		String nameOfLargest= "";
		
		System.out.println(items.get(1).toString());
		System.out.println(items.get(1).calCost());
		
		ArrayList<Integer> quantities = new ArrayList<>();
		for(item each : items) {
			valueOfInventetory += each.calCost();
			if(each.quantity>largestQuantity) {
				largestQuantity=each.quantity;
				nameOfLargest=each.name;
			}
			
			quantities.add(each.quantity);
		}
		
		
		System.out.println(Collections.max(quantities));
		System.out.println(largestQuantity+" " + nameOfLargest);
		
		
		
		
	}

}
