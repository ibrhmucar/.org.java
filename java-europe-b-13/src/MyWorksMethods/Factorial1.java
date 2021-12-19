package MyWorksMethods;



public class Factorial1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	factorial(4);	
	
	
	}

	private static int factorial(int i) {
		
	
		int a=1;
		int sum=0;
	
		while (i>=1) {
		
			a=a*i;
			sum=sum+a;
			
		i--;	
			
		}
		
		System.out.println(a);
		
		
		
		return a;
		
		
		
	}
}
