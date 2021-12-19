package day13_methods_Part1;

public class displayValue {

	public static void main(String[] args) {
		
		double x=75.45;
		displayValue(10.45);
		displayValue();
		displayValue(x);
		login("chrome");
		
	}

	  public  static void login(String browser) {
		
		  System.out.println(browser);
	  
	}

	public static void displayValue(double num) {
		
		System.out.println("The value is "+ num);
		

	}

		public static void displayValue() {
		
		System.out.println("The value is ");
		
}	
}
