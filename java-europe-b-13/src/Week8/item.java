package Week8;

public class item {

	
	String name;
	double unitPrice;
	int quantity;
	
	
	
	
	public String toString() {
		return "item [name=" + name + ", price=" + unitPrice + ", quantity=" + quantity + "]";
	}
	
	public double calCost() {
		
		return unitPrice*quantity;
		
	
		
	}

	public item(String name, double unitPrice, int quantity) {
	
		this.name = name;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
	}
	
	
	
	
	
}
