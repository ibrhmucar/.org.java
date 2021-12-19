package MyWorks;
import java.util.Scanner;
public class ReplitTaskZombie {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    System.out.println("Please Enter Number");
		int inhabitants = scan.nextInt();
	    int count=0;
	    //int a=0;
	    
	    if (inhabitants==0) {
	    	System.out.println("---- EXTINCT ----");
	    
	    
	    }else {
	    
	    do {
	  	
	    	
	    System.out.println("Day "+ count + "["+inhabitants+"]");	
	    	
	    inhabitants/=2;	
	    	
	    count++;
	    
	    	
	    }while (inhabitants>=1);
	     
		
	    System.out.println("---- EXTINCT ----");
	}

	}
}
