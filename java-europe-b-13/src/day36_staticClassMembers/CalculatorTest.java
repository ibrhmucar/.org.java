package day36_staticClassMembers;

public class CalculatorTest {

	public static void main(String[] args) {
		
		
		double result = Calculator.plus(55,7);
        System.out.println(result);

        Calculator c = new Calculator();
        System.out.println(c.plus(55,7));
        
       System.out.println(c.multiply(2, 3)+c.m1());
       
       int i = Integer.parseInt("33");
       System.out.println(Character.isDigit('5'));
       System.out.println(i);
       
       
       c.x=5;
       System.out.println(c.multi());
   
    
       CalculatorTest c1 = new CalculatorTest();// eğer metod static değilse bu şekilde çağırabiliyoruz.
       c1.m2();
       m3(); // aynı class içerisinde olduğu için çağırabiliriz.
       
	}
	
	
	public void m2() {
		 
		System.out.println("Hello");
		
		
		
	}
	
	public static void m3() {
		
		System.out.println("Hello One");
	}
}
