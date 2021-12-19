package MyWorks;
import java.util.Scanner;
public class PrintF {

	public static void main(String[] args) {
		Scanner  scan = new Scanner(System.in);
		int i=0;
	    String item;
	    int count;
		count=1;
		
		do {	
		
	   
	    
		System.out.printf("Enter Item%d and its price:\n", count);
		
		item=scan.next();
		
		i++;
		count++;
	    
	    }while(i<=3);
	
	}

}
