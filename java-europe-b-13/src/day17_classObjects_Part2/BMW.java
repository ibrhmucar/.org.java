package day17_classObjects_Part2;

public class BMW {

	String make="BMW";
	String model;
	double price;
	
	public void showPrice() {
		
	switch (model) {
		
		case "3.30i" :
			price=40250;
		break;	
		
		case "7.40i" :
			price=85000;
		break;	
		
		case "M3" :
			price=65000;
		break;	
		
		default:
			System.out.println(model +" is not avaible");
			price=0;
	
	}	
		
		System.out.println("Price: " + price);
	
	
	
	}	
}
