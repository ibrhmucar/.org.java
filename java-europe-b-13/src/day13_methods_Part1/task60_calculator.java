package day13_methods_Part1;

public class task60_calculator {

	public static void main(String[] args) {
		
		
	calculator(6,3,"*");
	calculator(6,3,"+");
	calculator(6,3,"-");
	calculator(6,3,"/");
	
	}

	public static void calculator(int num1, int num2, String operator) {
		
		if (operator=="*") {
			System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
		}else if(operator=="+"){ 
			
			System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
			
		}else if (operator=="-") {
			System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
			
		}else if (operator=="/") {
			System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
		}
		
	}
	
	

	
	
	
}
