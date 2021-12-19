package MyWorks;
import java.lang.Math;
public class Scanner {

public static void main(String[] args) {
		
		int b=1;
	for (int i=1 ; i<=10 ; i++){
			
	       if (i<=3){
	       System.out.println("tree size; " + i + " cm");
	      }else if(i>=4 && i<=10){
	          
	         System.out.println("tree size: " + (i + b)+ " cm");
	         b++;
	      } 	
	
	}	
	
}
}