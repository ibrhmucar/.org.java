package day31_arrayList;

import java.util.ArrayList;

public class cities {

	public static void main(String[] args) {
		
		ArrayList<String> cities = new ArrayList <>();
		
		cities.add("London");
		cities.add("DC");
		cities.add("Virginia");
		cities.add("Baku");
		cities.add("Berlin");
		cities.add("Baku");
		
		System.out.println("--------------------");
		
		System.out.println(cities.toString());
		
		for (String a : cities) {
			
			System.out.println(a + " ");
		}
		
		System.out.println("--------------------");
		
		for (int i=0 ; i<cities.size() ; i++ ) {
			
			System.out.println(cities.get(i));
		}
		
		System.out.println("--------------------");
		cities.remove("Baku");
		System.out.println(cities.toString());
		
		System.out.println("--------------------");
		cities.add(0,"Istanbul");
		cities.add(1,"Arlington");
		System.out.println(cities.toString());
		
		System.out.println("--------------------");
		System.out.println(cities.indexOf("Istanbul"));
		
		System.out.println("--------------------");
		
		cities.clear();
		System.out.println(cities.isEmpty());
		
	}

}
