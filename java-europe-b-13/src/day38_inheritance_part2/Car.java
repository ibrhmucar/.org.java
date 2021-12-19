package day38_inheritance_part2;

public class Car extends Vehicle {
	
	
	int maxSpeed = 180;
	
	public void display() {
		System.out.println("Maxim speed: " + maxSpeed);
		System.out.println("Maxim speed: " + super.maxSpeed);
		
	}

}
