package day36_staticClassMembers;

public class Calculator {
	
	int x;

	public static double plus(double num1, double num2){

        return num1+num2;

    }

    public static double mine(double num1, double num2){

        return num1-num2;
    }

    public static double multiply(double num1, double num2) {
        return num1*num2;

    }
    
    public static int m1() {
    	
    	return 4;
    }
    
    public  double multi() {
    	
    	return x+ m1();    	
    }
}