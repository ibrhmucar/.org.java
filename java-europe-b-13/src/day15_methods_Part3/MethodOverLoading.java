package day15_methods_Part3;

public class MethodOverLoading {

	public static void main(String[] args) {
		

		System.out.println(sum(2,3));
		System.out.println(sum(10,20,30,40));
		int x = sum(10,20,30);
		System.out.println(x);
		

	}

	public  static int sum(int a, int b) {
		
		return a+b;
	
	}
	
	
	public  static int sum(int a, int b, int c) {
		
		return a+b+c;
		
	}

	public  static int sum(int a, int b, int c, int d) {
	
		return a+b+c+d;



	}

}
