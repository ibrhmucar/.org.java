package Week7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ArrayBlockingQueue;

public class r09ArrayListPractice {

	public static void main(String[] args) {
		
		String [] arr = {"Java" , "C#", "C++", "Python"};
		
		ArrayList<String> list = new ArrayList<>();
		
		list.addAll(Arrays.asList(arr));
		System.out.println(list);
		
		ArrayList<String> listTwo = new ArrayList<>(Arrays.asList(arr));
		System.out.println(listTwo);
		
		ArrayList<String> listThree = new ArrayList<>(Arrays.asList(arr));
		System.out.println(listThree);
		
		list.add("apple");
		list.addAll(listThree);
		list.addAll(listTwo);
		System.out.println(list);
		
		list.removeAll(listThree);
		System.out.println(list);
		
		
		
	}

}
