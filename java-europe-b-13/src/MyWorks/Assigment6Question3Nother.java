package MyWorks;

public class Assigment6Question3Nother {

	public static void main(String[] args) {
		
		for (int i=1 ; i<=7 ; i++) {
			for (int j=2 ;  j<=i ; j++) {
				System.out.print(" ");
			}
				for (int k=i ; k<=7 ; k++) {
				System.out.print(k + " ");
				
			}
				System.out.println();
			
		}
		
		
		for(int i=1 ; i<=7 ; i++) {
			for (int j=1 ; j<=7-i ; j++) {
				
				System.out.print(" ");
			}
		for (int k=1 ; k<=i ; k++) {
			 int sum=7-i;
			 		
			System.out.print(sum+k+ " ");
		}
		
		
				System.out.println();
		}
		
		
		
		
		
	}

}
