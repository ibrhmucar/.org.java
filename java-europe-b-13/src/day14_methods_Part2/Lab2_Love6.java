package day14_methods_Part2;

public class Lab2_Love6 {

	public static void main(String[] args) {
		
		love6(6,4);
		love6(4,5);
		love6(1,5);
		love6(12,6);
		
	}

	public static void love6(int num1, int num2) {
		
		int sum= num1+num2;	
		
		if (num1==6 || sum ==6 ) {
			
			System.out.println("true");
		}else if (num2==6) {
			
			System.out.println("true");
			
		}else {
			System.out.println("false");
			
			
			
		}
		
		
		
		
		
	}

}
