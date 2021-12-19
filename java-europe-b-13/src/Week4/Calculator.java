package Week4;

public class Calculator {

	public static void main(String[] args) {
		
	System.out.println(add(6,3));	
	System.out.println(substract(6,3));		
	System.out.println(multipy(6,3));		
	System.out.println(divide(6,3));	
	System.out.println("------------------------");
	double a=5.5 , b=3.3 , result1=add(a,b);
	System.out.println(result1);
	System.out.println(add(a,b));
	System.out.println(substract(a,b));
	System.out.println(multipy(a,b));
	System.out.println(divide(a,b));
	
	
	
		
	}
	
	public static double add(double num1, double num2) {
	double result = num1+num2;
	return result;
	
	

}
	public static double substract(double num1, double num2) {
		double result = num1-num2;
		return result;
	
	
	
}
	public static double multipy(double num1, double num2) {
		double result = num1*num2;
		return result;
		
		
		
	}
	
	public static double divide(double num1, double num2) {
		double result = num1/num2;
		return result;
	
}
}	
		
		
		
		