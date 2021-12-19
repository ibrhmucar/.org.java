package day07_control_flow_statements;

public class ifElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score=88;
			
					
		if (score>70)  {
  		
		System.out.println("Excellent");
		System.out.println("You passed with grade A");
				
		}
		
		if (score<=69) {
			
			System.out.println("It's not good or bad");
			
		}
		
	    int sales,bonus;
	    double commisionRate,salary;
	    
	    sales=5000;
	    salary=10000;
	    
	    
	    if (sales>5000) {
	    	
	    	bonus=500;
	    	commisionRate=1.12;
	    	
	    	salary=salary*commisionRate+bonus;
	    	
	    }
		
	    System.out.println("Salary = " + salary);
	    
	    
		
		
		
		}

	}

