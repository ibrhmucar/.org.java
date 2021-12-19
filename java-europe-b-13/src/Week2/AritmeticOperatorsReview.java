package Week2;

public class AritmeticOperatorsReview {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub


		/*
		 * Division
		 * in math 10/3 = 3.3333
		 * in Java 10/3 = 3 the reason int/int=int
		 * in Java 10/3.0 = 3.3333 the reason int/double = double
		 * in Java 10.0/3= 3.3333 double/int = double
		 */
		System.out.println("10/3 "+ (10/3));
		System.out.println("10.0/3 "+ (10.0/3));
		int num1 = 10;
		double num2 = 3.0; // when you divde int/double the result variable 
		// type should be double 
		int result = (int) (num1/num2); // explicit casting, we do it not the compiler
		// if compiler do casting: implicit casting
		System.out.println("10/3.0 "+ (10/3.0));
		System.out.println("result is " + result );
		
		
		int hourlyRate = 60;
		double taxRate = 0.3;
		int weeklyHour = 40;
		int salary = (48*weeklyHour)*hourlyRate;
		
		double totalTax = salary*taxRate;
		
		double lastSalary=salary-totalTax;
		
		
		System.out.println(totalTax);
		System.out.println(lastSalary);
		System.out.println(salary);
		
		double montlySalary = lastSalary/12;
		
		System.out.println(montlySalary);
		




		
		
	}

}
