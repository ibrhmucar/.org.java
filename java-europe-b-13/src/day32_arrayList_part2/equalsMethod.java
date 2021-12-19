package day32_arrayList_part2;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class equalsMethod {

	public static void main(String[] args) {
		ArrayList<String> friends1 = new ArrayList<>();
		ArrayList<String> friends2 = new ArrayList<>();

		friends1.add("Mike");
		friends1.add("Smith");
		friends1.add("John");
		friends1.add("Tommy");
		
		friends2.add("Mike");
		friends2.add("Smith");
		friends2.add("John");
		friends2.add("Tommy");
		
		System.out.println(friends1);
		System.out.println(friends2);
		
		if (friends1.equals(friends2)) {
			System.out.println("Same Friends");
		}else {
			System.out.println("Not Some Friends");
		}
		
		System.out.println(friends1==friends2); // checking object so returns false, because of different reference.
		
	}

}
