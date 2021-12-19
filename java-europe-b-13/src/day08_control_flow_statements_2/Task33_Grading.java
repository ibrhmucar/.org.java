package day08_control_flow_statements_2;

public class Task33_Grading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=100;
		
		if (a<60) {
			
		System.out.println("fail");
		
		
		}else if ((a>=60) && (a<90)) {
			
		System.out.println("pass");
		
		}else if (a>=90) {
			
		System.out.println("Passed with Distinction");
		
					
		}else {
			
		System.out.println("invalid");
		
		}
	}

}
