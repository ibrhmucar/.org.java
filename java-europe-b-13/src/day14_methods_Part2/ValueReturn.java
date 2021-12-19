package day14_methods_Part2;

public class ValueReturn {

	public static void main(String[] args) {

	sum(2,3);
	
	System.out.println(sum(2,3));
		
	int v1= sum(3,3);
	
	System.out.println(v1*5);
	
		
		
		
	}

	public static int sum(int num1, int num2) {
		
		int result=num1+num2;
		
		return result;
		
		
		
		
	}
	
	
	
	
	

}
