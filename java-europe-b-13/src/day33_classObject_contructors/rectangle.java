package day33_classObject_contructors;

public class rectangle {

	double length;
	double width;
	
	
	public void getArea() {
	
	System.out.println(length*width);

	}
	
	public double minValues() {
		
	double res = length-width;
	
	return res;
		
		
		
	}

	public rectangle(double a, double b) {
		
		length=a;
		 width=b;
		
		
	}
	
	public rectangle() {
		
		length = 10.1;
		width = 12.1;
		
	}
	
	public rectangle (int a, float b) {
		
		
		
	}
	
	
}
