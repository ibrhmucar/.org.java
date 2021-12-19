package day07_control_flow_statements;

public class TaskExtra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a;
		boolean b;
		b=false;
		a=40;
		
		if (a>=20) {
			System.out.println("xxxx");
			b=true; //b'nin durumu true olarak değiştiriliyor.
		}
	
		if (b) {
			System.out.println("Good");
			a=10;
			System.out.println(a);
			System.out.println(b);
			
		}
	
		if (b==false) {
			System.out.println("yyyy");
			
		}
	
	
	}
	
	
	
	
	
	

}
