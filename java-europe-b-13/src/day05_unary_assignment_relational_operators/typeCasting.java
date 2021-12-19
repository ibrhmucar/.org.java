package day05_unary_assignment_relational_operators;

public class typeCasting {
	
 public static void main(String[] args) {
	 
	 byte b;
	 int i=88;
	 double d=323.142;
	 float f=72.38f;
	 char c='A';
	 
	 
	 c=(char)i;
	 
	 System.out.println("i = " + i + " c = " + c);
	 
	 i= (int)d;
	 
	 System.out.println("d= " + d + " i = "+ i);
	 
	 i=(int)f;
	 System.out.println("f= " + f + " i = "+ i);
	 
	 b=(byte)d;
	 	 
	 System.out.println("d= " + d + " b = "+ b);
	 
	 
	 
	 short firstNumber = 10;
	 short secondNumber = 20;
	 short thirdNumber;
	 
	 
	 thirdNumber = (short) (firstNumber + secondNumber);
	 
	 
	 System.out.println(thirdNumber);
	 
	 
	 
	 
 }
}