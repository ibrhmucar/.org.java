package day08_control_flow_statements_2;

public class Task32_LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int a,b,c;
	a=10;
	b=55;
	c=57;
	
	if ((a>b) && (a>c)) {
		
		System.out.println(a + " is the biggest number");
		
	
	} else if ((b>a) && (b>c)) {
		
		System.out.println(b + " is the biggest number");
		
	}else if ((c>a) && (c>b)) {
		
		System.out.println(c + " is the biggest number");
		
				
	}else {
		
		System.out.println("the numbers are equal");
	}
	
	
	
	
	
	}
	
}
