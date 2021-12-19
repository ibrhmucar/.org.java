package day10_controlFlowStatements_4;

public class ternaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String result;
		int score=88;
		
		
		result = score>60 ? "pass" : "fail";
		
		System.out.println(result);
		
		
		int x = 5;
		System.out.println(x>2 ? x<4 ? 10 : 8 : 7);
		
		/*if (x>2) {
			
			if (x<4) {
				System.out.println("10");
				
			}else {
				System.out.println("8");
			}
			}else {
				System.out.println("7");*/
		
			}
		
	
		
		/*if the first condition is true (x>4) java 
		 * checks the second condition (x<7) and if 
		 * both conditions are true 
		 * then java will give us the first value as the result (10) 
		 * but if the second condition is false 
		 * it will give us the second value as the result(8), 
		 * on the other hand if the first condition is false 
		 * then java will give us the last value as the result(7).
		 */

	
	
}

