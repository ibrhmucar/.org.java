package day35_encapsulation;

public class Calculator {
	
		
	
	
	Floor floor;
	Carpet carpet;
	
	
	
	
	
	
	public Calculator(Floor floor, Carpet carpet) {
		
		this.floor = floor;
		this.carpet = carpet;
		
		
	}

	public double totalCost() {
		
	return carpet.getCost()*floor.getArea();
		
		
	}
	
	

}
