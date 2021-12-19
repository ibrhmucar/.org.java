package MyWorksArray;

public class methods2 {

	public static void main(String[] args) {
		
		int x = 1;
		int [] y = new int [10];
		
		m(x, y) ;

		System.out.println("x is " + x);
		System.out.println("y [0] is " + y [0]);
		
	}
	public static void m(int number, int[]numbers) {
	
	number = numbers [0];
	numbers [0] = 5555;
	
	
}
}