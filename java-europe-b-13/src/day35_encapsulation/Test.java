package day35_encapsulation;

public class Test {

	public static void main(String[] args) {
		
		//First Ways
		
/*	Floor floor = new Floor(10.10,10.20);
	Carpet carpet = new Carpet (10);
	Calculator cal = new Calculator(floor, carpet);
	
	System.out.println(cal.totalCost());*/
	
	
		
		//Second Way
		
	Calculator cal = new Calculator (new Floor(10.10,10.20), new Carpet(10));
	
	System.out.println(cal.totalCost());
	
	
		
	}

}
