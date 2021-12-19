package assignment6;

public class Quesiton3 {

	public static void main(String[] args) {
		
	
	for (int i=1 ; i<7 ; i++) {
		for ( int j=1 ; j<i ; j++) {
		System.out.print(" ");
		}
		for (int j=i ; j<=7 ; j++) {
		System.out.print(j+ " ");
		}
		System.out.println();
				
	}
	for (int a=1 ; a<=7 ; a++) {
		for (int b=a ; b<7 ; b++) {
		System.out.print(" ");	
 		}
		for (int b=1 ; b<=a ; b++) {
		int sum=7-a;
		System.out.print((sum+b)+ " ");	
								
	}
		System.out.println();
		
	}	
}
}