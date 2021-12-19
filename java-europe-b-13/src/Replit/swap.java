package Replit;

import java.util.ArrayList;
import java.util.Arrays;

public class swap {

	

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("one");
		list.add("two");
		list.add("three");
		
		System.out.println(swap(list, 0, 2));
				
	}

	private static ArrayList<String> swap(ArrayList<java.lang.String> list, int i, int j) {
		String a = "";
			   a =list.get(i);
		String b = "";
		       b =  list.get(j);
			
		list.set(j, a);
		list.set(i, b);
		return list;	
	}

}
