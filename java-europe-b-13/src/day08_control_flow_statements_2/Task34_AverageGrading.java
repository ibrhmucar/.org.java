package day08_control_flow_statements_2;

public class Task34_AverageGrading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=100;
		int b=90;
		int c=90;
		double d;
		
		d=(a+b+c)/3;
		
		if 		 ((d>=90) && (d<=100)) {
			
			System.out.println("Grade is " + " A ");
			
		}else if ((d>=80) && (d<=89)) {
			System.out.println("Grade is " + " B ");
							
		}else if ((d>=70) && (d<=79)) {
			System.out.println("Grade is " + " C ");
			
		}else if ((d>=60) && (d<=69)) {
			System.out.println("Grade is " + " D ");
			
		}else if ((d>=0) && (d<=59)) {
			System.out.println("Grade is " + " E ");
			
		}else {
			System.out.println("Invalid Data Try Again");
			
			
		}
	}

}
