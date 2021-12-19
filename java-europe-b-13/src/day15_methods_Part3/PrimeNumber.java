package day15_methods_Part3;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(isPrime(11));
					
				
		}
		
		public static boolean isPrime(int number) {
			
			boolean flag=true;
			
				if (number==0 || number==1) {
				
					flag=false;
				
					}else {
				
					for (int i=2 ; i<number ; i++) {
					
					if (number%i==0) {
						
					flag=false;
						
						
					}
				}
				
			}
		
			return flag;
	}
		

}
