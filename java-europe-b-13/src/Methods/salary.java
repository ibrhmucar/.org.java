package Methods;

public class salary {

	public static void main(String[] args) {
		
	salaryClass ahmet = new salaryClass();
	
	
	
	ahmet.hour=45;
	ahmet.hourlyPrice=55;
	ahmet.taxRate=0.25;
	
	
	
	System.out.println(ahmet.salary());
	System.out.println(ahmet.salaryAfterTax());
	System.out.println(ahmet.taxRate());
	
	
		
	}
	
	
	
	
	
	
	
	
	
	
}
