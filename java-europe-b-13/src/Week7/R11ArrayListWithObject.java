package Week7;

import java.util.ArrayList;

public class R11ArrayListWithObject {

	public static void main(String[] args) {
		
	Products productOne = new Products();
	productOne.setInfo("SonyVio", 950.0);
	
	Products productTwo = new Products();
	productTwo.setInfo("iphone12", 1350.0);
		
	Products productThree = new Products();
	productThree.setInfo("monitor", 350.0);
	
	
	ArrayList<Products> list = new ArrayList<>();
	
	list.add(productThree);
	list.add(productOne);
	list.add(productTwo);
	
	System.out.println(list.toString());
	
	for(Products each : list) {
		System.out.println(each.toString());
	}
	
	
	
	
	
	
	}

}
