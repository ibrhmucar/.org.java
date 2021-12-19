package day05_unary_assignment_relational_operators;

public class unaryOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1=25;
		int n2=30;
		
		System.out.println(n1++);
		System.out.println(++n1);
		System.out.println(n2--);
		System.out.println(--n2);
		
		
		int i1= +10;
		int i2= -100;
		int i3= -(i1+i2);
		
		System.out.println("i1 = " + i1);
		System.out.println("i2 = " + i2);
		System.out.println("i3 = " + i3);
		
		
		boolean flag = true;
		System.out.println(!flag);
		System.out.println(!!flag);
		
		
		int i= 10;
		int j= 5;
		
		i++;
		j--;
		
		System.out.println(--j);
		System.out.println(j);
		
		
		
		System.out.println("i = " + i);
		System.out.println("j = " + j);
		
		int res = i++ + --j;
		
		System.out.println("i = " + i);
		System.out.println("j = " + j);
		System.out.println("res = " + res);
		
		
		
	}

}
