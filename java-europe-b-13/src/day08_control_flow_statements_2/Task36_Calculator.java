package day08_control_flow_statements_2;

public class Task36_Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int num1=9;
	int num2=5;
	String operator="/";
	int result=0;
	
	switch (operator)  {
	case "+":
		result=num1+num2;
		break;
	case "-":
		result=num1-num2;
		break;
	case "/":
		result=num1/num2;
		break;
	case "*":
		result=num1*num2;
		break;
	default:
		System.out.println("invalid item ");
		
	}
	
	System.out.println("result is " + result);
 	
	
	
	}
		
	
	
	}
	
	
	
	


