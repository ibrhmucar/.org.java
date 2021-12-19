package MyWorks;
import java.util.Scanner;
public class test {

	 public static void main(String[] args) {
	     Scanner inp = new Scanner(System.in);
	     System.out.print("enter number");
	     int num = inp.nextInt();

	     next3(num);

	  }
	  public static void next3(int num){
	    
		int num2,num3,num4;
	    num2=num+1;
	    num3=num2+1;
	    num4=num3+1;

	    System.out.println(num2 + " " + num3 + " " + num4);
	  }
	}
