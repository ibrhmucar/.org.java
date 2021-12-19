package MyWorks;
import java.util.Scanner;
public class MetorQuestionOddNumbers {
	
	
	public static void main(String[] args) {
		
	
	Scanner scan = new Scanner (System.in);
	System.out.println("Enter a postive number");
	int number = scan.nextInt();
	int i=1;
	
	
    
    while (i<=number) {
        
        if (i%2==0 || i<number) {
                            
            System.out.print(i + ", ");
            
        }else {
            
            System.out.print(i);

        }
    
    i+=2;
	
	
	}
		
	
	}
}
