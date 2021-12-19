package Week7;

public class Products {

	String name;
	double price;
	
	public void setInfo(String n, double d) {
		
		name = n;
		price = d;
		
	}

	@Override
	public String toString() {
		return "Products [name=" + name + ", price=" + price + "]";
	}
	
	
	
	
	
}
