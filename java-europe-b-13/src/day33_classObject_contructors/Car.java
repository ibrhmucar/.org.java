package day33_classObject_contructors;

public class Car {
	
	
	String model ;
	String make ;
	int year ;
	double mile ;
	String color ;
	
	public Car() {
		
	model = "Honda";
	make  = "Civic";
	year  = 2020;
	mile  = 16000;
	color = "Red";
		
	}


	public Car(String model, String make, int year, double mile, String color) {
		
		this.model = model;
		this.make = make;
		this.year = year;
		this.mile = mile;
		this.color = color;
		
	}
	
	
	
	

}
