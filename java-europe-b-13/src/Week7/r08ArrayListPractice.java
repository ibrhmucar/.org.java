package Week7;

import java.util.ArrayList;

public class r08ArrayListPractice {

	public static void main(String[] args) {
		
		ArrayList<Integer> nums = new ArrayList<>();
		
		nums.add(100);
		nums.add(200);
		nums.add(300);
		nums.add(400);
		System.out.println(nums);
		System.out.println(nums.size());
		System.out.println(nums.get(2));
		nums.add(2, 450);
		System.out.println(nums);
		nums.remove(nums.get(nums.size()-1));
		System.out.println(nums);
		nums.remove(Integer.valueOf(300));
		System.out.println(nums);
		
		System.out.println(nums.contains(250));

	}

}
