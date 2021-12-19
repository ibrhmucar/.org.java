package day07_control_flow_statements;

public class Task27_GreetingHours {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=9;
		String b;
		b="pm";
		
		if (a<12 && b=="am") {
			System.out.println("Good Morning");
					
		}
		
		if (a>=12 || a<3 && b!="am") {
			
			System.out.println("Good Afternoon");
		}
		
		if (a>=3 && b!="am") {
			
			System.out.println("Good Evening");
		}
}
}
