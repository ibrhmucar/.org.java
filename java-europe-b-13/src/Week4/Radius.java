package Week4;

public class Radius {

	public static void main(String[] args) {
		
		
	Circle Circle1 = new Circle() ;
	
	
	Circle1.radius = 3.0 ;
	
	System.out.println(Circle1.area());	
	System.out.println(Circle1.perimeter());
	
	
	Circle Circle2 = new Circle() ;
	
	Circle2.radius = 10.0;
	System.out.println(Circle2.area());
	System.out.println(Circle2.perimeter());
	
	System.out.println(Circle1.toString());
	
	

	}

}
