package day36_staticClassMembers;

import static java.lang.Math.*; // import all static properties belongs to Math class



public class StaticImport {

	public static void main(String[] args) {
		
		System.out.println(Math.sqrt(16));
		
		
		System.out.println(sqrt(16)); // directly call method without calling the class name
		

		int a = 50;
		
		a= --a + a++ + a-- + a++;
		
		System.out.println(a);
		
		 
	}

}
