package day15_methods_Part3;

public class task69_Prime {

	public static void main(String[] args) {

	
	
	isPrime(5);
	isPrime(6);
	isPrime(11);
    System.out.println(isPrime(6));
	
	}

	public static boolean isPrime(int i) {
		
		
		
		if (i%2==1 && i%3==1) {
			return true;
		}else {
			return false;
		}
		
		
	}

	
	
	
	
}
