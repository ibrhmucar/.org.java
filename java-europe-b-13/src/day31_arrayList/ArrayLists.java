package day31_arrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayLists {

	public static void main(String[] args) {
		
		
		
		ArrayList<String> arr = new ArrayList<String> ();
		
		arr.add(0, "apple");	
		
		System.out.println(arr.indexOf("apple"));
		
		arr.add(1, "orange");
		
		System.out.println(arr.indexOf("orange"));
		
		arr.remove(0);
		arr.remove(0);
		
		System.out.println(arr);

		String list = "ahmet mehmet saffet";
		
		String [] listnew = new String[3];
		
		listnew = list.split(" ");
		
		System.out.println(Arrays.toString(listnew));
		
		
		arr.add("apple");
		arr.add("orange");
		arr.add("puzzle");
		
		System.out.println(arr);
		
		
		ArrayList<Integer> nums = new ArrayList<>();
		ArrayList<String>  names = new ArrayList<>();
		
		
		names.add("Mike");
		names.add("Smith");
		names.add("John");
		names.add("Emmy");
		names.add("Evan");
		names.add("Marry");
		
		nums.add(99);
		nums.add(656);
		nums.add(100);
		nums.add(new Integer("100"));
		
		System.out.println(nums);
		System.out.println(names);
		
		System.out.println(names.get(0));
		
		System.out.println("aa"+nums.get(3));
		
		System.out.println(names.size());
		System.out.println(nums.size());
		
		System.out.println(names.indexOf("Emmy"));
		System.out.println(names.toString());
		System.out.println(nums.toString());
		
		
		
	}

}
