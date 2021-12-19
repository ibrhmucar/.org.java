package Replit;
import java.util.Arrays;
import java.util.Scanner;
public class switch11 {

	
	

	  public static void main(String [] args) {
	    Scanner in = new Scanner(System.in);
	    System.out.println("Enter number");
	    int [] arr = {in.nextInt(),in.nextInt(),in.nextInt(),in.nextInt()};
	    System.out.println(Arrays.toString(do_switch(arr)));
	  }


	  public static int[] do_switch(int[] i) {
	   
	   for (int a=0 ; a<i.length/2 ; a++) {
					
					int temp = i [a];
					
					i [a] = i[i.length-1-a];
					i [i.length-1-a] = temp;
	}

	  return i;

		
	}
	}