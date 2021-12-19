package day07_control_flow_statements;

public class Task28_RevenueCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int price,quantity;
		
		price=100;
		quantity=2000;
		
		double revenue;
		double discount=0.1;
		
		double discountPrice;
		
			
		revenue=price*quantity;
		discountPrice=revenue*discount;
		
		if (revenue>5000) {
			
			revenue=revenue-(discountPrice);
			
			System.out.println("Discount prices is =" + revenue);
			System.out.println("Discount $  is  = " + discountPrice );
		}
		
		if (revenue<4999) {
		System.out.println("there is no discount");
		
		
		
	}
}
}