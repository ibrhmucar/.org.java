package MyWorks;
import java.util.Scanner;
public class ReplitWork {

	public static void main(String[] args) {
		  Scanner inp = new Scanner(System.in);
		     System.out.println("enter number");
		     int num = inp.nextInt();
		     
		     
		     next3(num);
		    
		  }
		   
		  public static void next3(int num){
		      int b = num + 3;
		      int c=b-1;
		      System.out.println("next 3 are:"); 
		   
		      while (num < b) { 
		      
		      if (num<c){ 
		      System.out.print(num+1 + "a ");  
		      }else if(num==c){
		       System.out.println(num+1); 
		      }
		    num++;


		    }




		  }



		 
		 
		

	}


