package day33_classObject_contructors;

public class rectangleTest {

	public static void main(String[] args) {
		
		
	rectangle r1 = new rectangle(2.2,3.1);
	
//	r1.length=5.4;
//	r1.width=3.2;
	
	r1.getArea();
	
	
	System.out.println(r1.length);
	System.out.println(r1.width);
	
	rectangle r2 = new rectangle();

//	r2.length=2.7;
//	r2.width=12.5;
	
	r2.getArea();
	
	
	System.out.println(r2.length);
	System.out.println(r2.width);
		

	
	
	
	
		
	}

}
