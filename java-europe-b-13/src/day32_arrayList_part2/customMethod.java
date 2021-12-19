package day32_arrayList_part2;

import java.util.ArrayList;

import java.util.Random;

public class customMethod {

	public static void main(String[] args) {
		
		ArrayList<Integer> numsList = new ArrayList<>();
		
		numsList.add(10);
		numsList.add(10);
		numsList.add(7);
		numsList.add(8);
		numsList.add(8);
		numsList.add(3);
		numsList.add(4);
		numsList.add(8);

		System.out.println(removeall.removeDuplicate(numsList));
		printList(numsList);
		
		ArrayList<Double> doubleList = new ArrayList<>();
		doubleList.add(10.33);
		doubleList.add(1.22);
		doubleList.add(7.34);
		doubleList.add(3.55);
		doubleList.add(4.76);
		
		System.out.println();
	
		double sum = sumList(doubleList);
		
		System.out.printf("%.2f", sum);
	//	System.out.println(Math.round(sum));
		
		System.out.println();
		
		ArrayList<Integer> list = getList(15);
		System.out.println(list.toString());
		
		System.out.println("----------------------");
		
		ArrayList<Integer> rlist = getRandom(20);
		System.out.println(rlist.toString());
		
		ArrayList<String> strnums = new ArrayList<>();
		strnums.add("123");
		strnums.add("33");
		strnums.add("12");
		
		ArrayList<Integer> converted = converToIntList(strnums);
		System.out.println(converted);
		
		
		
		
		
		
	}
	private static ArrayList<Integer> converToIntList(ArrayList<String> strnums) {
		
		ArrayList<Integer> list55 = new ArrayList<>();
		
		for(String str : strnums) {
		
		
		 list55.add(Integer.parseInt(str));
		
		}
		
		
		
		 return list55;
	
	
	}
	private static ArrayList<Integer> getRandom(int i) {
		ArrayList<Integer> list5 = new ArrayList<>();
		
		Random rn = new Random();
		
				
		for(int b=0 ; b<i; b++) {
		
			list5.add(rn.nextInt(i));
		}	 
  		   return list5;
	
	}
	public static  void printList (ArrayList<Integer> list){ 
		
		for(Integer n : list) {
			System.out.print(n + " ");
		}
	}
	
	public static double sumList(ArrayList<Double> num){
		double sums = 0.0;
		
		for(double a : num) {
			sums += a;
		}
		 return sums;
				
	}
	
	public static ArrayList<Integer> getList(int number) {
		ArrayList<Integer> list3 = new ArrayList<>();
		
		for (int i=0 ; i<=number ; i++) {
		 
			list3.add(i); 
		
		}
			return list3;
	}
	
}
