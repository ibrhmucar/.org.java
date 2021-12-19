package MyWorksMethods;
import java.util.Scanner;
public class Grades {

	public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	System.out.println("Please Enter Number");
	int number = scan.nextInt();	
	
	
	grades(number);
	
	}

	public static void grades(int number) {
	
		if (number>=91 && number<=100) {
			System.out.println("AA");
		}else if(number>=81 && number<=90) {
			System.out.println("AB");
		}else if(number>=71 && number<=80) {
			System.out.println("BB");
		}else if(number>=61 && number<=70) {
			System.out.println("BC");
		}else if(number>=51 && number<=60) {
			System.out.println("CD");
		}else if(number>=41 && number<=50) {
			System.out.println("DD");
		}else {
			System.out.println("fail");
		}
	    }
	
}
