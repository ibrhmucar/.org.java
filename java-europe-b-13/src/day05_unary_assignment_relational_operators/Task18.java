package day05_unary_assignment_relational_operators;

public class Task18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=2;
		int y=x++;
		
		
		
		System.out.println(x);
		System.out.println(y);
		
		int a= 1;
		
		a= -a-- + a++ / -a-- * --a; 
		
		// in memory --> 1 --> 0 ---> 1 ---> 0 --->-1
		
		// in result---> -1 + 0 / -1 * -1
		
		System.out.println(a);
		
		System.out.println(1+2/2*2);
		
		
		
	}

}
