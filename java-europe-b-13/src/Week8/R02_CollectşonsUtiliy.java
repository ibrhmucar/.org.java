package Week8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class R02_CollectşonsUtiliy {

	public static void main(String[] args) {
		
		ArrayList<Character> list = new ArrayList<>();
		
		list.addAll(Arrays.asList('j','a','v','a','i','s','f','u','n'));
		System.out.println(list.size());
		Collections.reverse(list);
		System.out.println(list);	
		System.out.println(Collections.frequency(list,'a'));
		
		ArrayList<Integer> nums = new ArrayList<>();
		
		nums.addAll(Arrays.asList(10,35,100,-23,1000,564));
		System.out.println("Max number: " + Collections.max(nums));
		System.out.println("Min number: " + Collections.min(nums));
		
		
		System.out.println("Max char: " + Collections.max(list));
		System.out.println("Min char: " + Collections.min(list));
		
		String [] a = {"a","b","c"};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		int [] b = new int [nums.size()];
		for (int i=0 ; i<nums.size() ; i++) {
			b[i]= nums.get(i);
		}
		
		Arrays.sort(b);
		System.out.println(Arrays.toString(b));
		System.out.println(b[2]);
		
	}

}
