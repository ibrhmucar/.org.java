package Week4;

public class Circle {

	
	
	
	double radius;
	double Pi=3.14;


	public double area () {
	return radius*radius*Pi;
	
	}

	public double perimeter() {
		return 2*radius*Pi;
		
}	
	
	
	public String toString() {
		
		String result="Result is " + area();
		return result;
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
