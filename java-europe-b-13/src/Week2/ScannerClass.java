package Week2;



public class ScannerClass {

	
	public static void main(String[] args) {
		
    int a=20;
    a=a++;
    
    System.out.println(a++);
    System.out.println(a);
    
    int b=5;
    b+=10;
    
    System.out.println(b);
    
    
   
    int hourlyRate = 50;
    int weeklyHours = 40;
    int montlyTax= 200;
    
    
    int salary=hourlyRate*weeklyHours;
    salary*=4;
    
    System.out.println(salary-=montlyTax);
    
		
		
		
		
	}

}
