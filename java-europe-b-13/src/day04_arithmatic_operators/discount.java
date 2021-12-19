package day04_arithmatic_operators;

public class discount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// This program cal the sale price of an 
		// item that is regulary priced at $59, with a 20% discount on it
		
		
		int regularPrice=59;
		double discount;
		double salesPrice;
		
		discount=regularPrice*0.2;
		salesPrice=regularPrice-discount;
		
		System.out.println("sales price is " + salesPrice + " $ " );
		System.out.println("discount amount is " + discount + " $ ");
		System.out.println("Regular price is " + regularPrice + " $ ");
		
		
		
		
		
		
		
		
		
	}

}
