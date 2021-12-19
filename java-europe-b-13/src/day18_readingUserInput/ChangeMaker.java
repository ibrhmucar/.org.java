package day18_readingUserInput;
import java.util.Scanner;
public class ChangeMaker {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter number please between 1-99: ");
	int num = sc.nextInt();
	//boolean flag=true;	
	int i=1;
	
	while (true) {
	
	if (num>1 && num<99) {
		changeMaker(num);
		break;
	
	}else if (num>=100 && i<3) {   
		System.out.println("Please try again !");
	    System.out.println("Enter again number :");
	    num = sc.nextInt();
	    
	    i++;
	    
	}else{    
		System.out.println("You entered 3 times invalid number, Bye bye!");
		break;
		}
	  
	}
	}	
	public static void changeMaker(int num) {
		int quarters,dimes, nickles, pennies;
		quarters=num/25;
		dimes=(num%25)/10;
		nickles=((num%25)/10)/5;
		pennies=((num%25)%10);
		System.out.println(num + "cents equals to : " + quarters + " quarters " + dimes + " dimes " + nickles + " nickles " + pennies  + " pennies ");	
	}
	}
	
	
		/* quarters= sayı/25;
		 * kalanquarters= sayı%25;
		 * dimes=kalanquarters/10;
		 * kalandimes=kalanquarters%10;
		 * nickles=kalandimes/5;
		 * kalannickless=nickles%5;
		 * pennies=kalannickles;
		 */

