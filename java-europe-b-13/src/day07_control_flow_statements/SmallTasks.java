package day07_control_flow_statements;

public class SmallTasks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("*******1****************");
		
		
		int x;
		int y;
				
		y=20;
		x=4;
		
		if (y>=20) {
			x=5;
			
		}

		System.out.println(x);
		
		
		
		System.out.println("***********2**********");
		
		
		int hours=41;
		int salary=5000;
		double payrate=1.5;
		double res;
		res=salary;
		
		if (hours>40) {
			 res=salary*payrate;
			
			
		}
		
		System.out.println("Last Salary is = " + res);
		
		System.out.println("***********3**********");
		
		
		int fees=10;
		boolean statement=true;
		
		
		if (statement=true) {
			
			fees=50;
		}
		
		System.out.println("Last Fees is =" + fees);
		
		System.out.println("**********4************");
		
		
		int a,b,c;
		
		a=1;
		b=50;
		c=101;
		
		
		
		if (b==50 && c>=100) {
			
			
			a=20;
		}
		
		System.out.println(a);
		
		
		System.out.println("**********5************");
		
		int temp;
		
		temp=75;
		
		if (temp>=70 && temp<=80) {
			
		System.out.println("Ideal Temp");
		
		}
		
		if (temp<=69 || temp>=81) {
			
		System.out.println("Not Ideal Temp");
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
