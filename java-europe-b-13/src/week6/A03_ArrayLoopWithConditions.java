package week6;

import javax.naming.ldap.SortControl;

public class A03_ArrayLoopWithConditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double [] prices = {22.9, 12.4, 43.12, 65.0, 150.9, 100.87, 90.5, 124.9, 234.56};
		
		System.out.println("Over 100");
		for (double price : prices) { // prices 100'ün üzerindeyse yazdır komutu.
			if (price>100) {
			System.out.println(price);
		}
		}
		
		
		System.out.println("Between 40 and 100");
		
		for (double price1 : prices) { 
		 if ((price1>40) && (price1<100)) {
		 System.out.println(price1);
	}	
	}
		System.out.println("Number over 60");
		int count = 0;	
		for (double over60 : prices) {
			if (over60>60) {
		    count++;
		}
		}
		System.out.println(count);
		
		
}
}