package Week2;

import java.util.Scanner;

public class scannerClass2 {

	public static void main(String[] args) {
		
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter a number ");
    int a = input.nextInt();
    
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter a name ");  
    String b = scan.nextLine();
    String c = scan.nextLine();
      
    if (a>=90 && a<=100) {
    	System.out.println("Dear " + b +  " Your grade is A ");
    
    }else if(a>=80 && a<=89) {
    	System.out.println("Dear " + b +  " Your grade is  B ");
    
    }else if (a>=70 && a<=79) {
    	System.out.println("Dear " + b +  " Your grade is  C ");
    	
    }else if (a>=30 && a<=69) {
    	System.out.println("Dear " + b +  " Your grade is  D ");
    	
    }else if (a>=0 && a<=29)  {
    	System.out.println("Dear " + b +  " Your grade is  F ");
    	
    }else {
    	System.out.println("Dear " + b +  " Invalid Entry");
    	
    
    	
    }
    
    
    
	}

}
