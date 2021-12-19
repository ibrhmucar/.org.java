package day15_methods_Part3;

public class assignment3_Fibonacci {

	public static void main(String[] args) {
		
	
	int totalSeries=10;
	
	int num1=0;
	int num2=1;
	
	
	for (int i=1 ; i<=totalSeries ; i++) {
		
		int sum=num1+num2;
			num2=num1;
			num1=sum;
		
		System.out.print(num1 + "  ");
		
		
	}
		
		
		
		

	}

}
