package day36_staticClassMembers;

public class ABCTest {

	public static void main(String[] args) {
		
		ABC.m1(); // call method thru only static way
		
	//	ABC o1 = new ABC();
	//	o1.m1();
		
		
	//whenever all of your methods in your class are static, and you want to everyone to call them
	//static way Classname.methodname(), then you can simply make your constructor private.	
		
	ABC.m1();	
		

	}
	
	public  void print() {
		
		
		int a = 5; // local variables can not be static.
		
		
		
	}

}
