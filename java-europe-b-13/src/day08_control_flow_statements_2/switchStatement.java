package day08_control_flow_statements_2;

public class switchStatement {

	
	public static void main(String[] args) {
		
		String weather="snow";
		
		switch (weather) {
		
		case "sunny":
			System.out.println("Go to Park");
			System.out.println("Code Java");
			break;
		case "hot":
			System.out.println("Go to swimming");
			System.out.println("Code Java");
			break;
		case "windy":
			System.out.println("Fly a kite");
			System.out.println("Code Java");
			break;	
		case "snow":
			System.out.println("Go to snowborading");
			System.out.println("Code Java");
			break;	
		default:
			System.out.println("Code Java in any other weather");
		
		}
		
		
		
	}
}
