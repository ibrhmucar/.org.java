package Methods;

public class salaryClass {

	int hour;
	double  hourlyPrice;
	double salary;
	double taxRate;
	double tax;
	double afterTaxSalary;
	double result=salary-tax;
	
	public double salary() {
		
		salary=hour*hourlyPrice;
		
		return salary;
		
		//System.out.println(salary);
	}
	
	public double taxRate() {
		
		tax=taxRate*salary;
		return tax;
				
				
	    //result=salary-tax;
	   // System.out.println("total tax " +  tax);
	}
	
	public double salaryAfterTax() {
		
		 result=salary()-taxRate();
		
		 return result;
		 
		 
		 
		 //System.out.println(result);
	}
	
	
	
	
	
	
	
}
