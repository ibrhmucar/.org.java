package day15_methods_Part3;

public class task67_LastDigit {

	public static void main(String[] args) {
		
		
	lastDigit(7,17);	
	lastDigit(6,17);
	lastDigit(3,113);
		
		
	}

	public static void lastDigit(int i, int j) {
		
		if (j%10==i) {
			System.out.println("true");
					
		}else {
			System.out.println("false");
		}
		
	
	}

}
