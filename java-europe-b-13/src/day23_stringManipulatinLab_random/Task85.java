package day23_stringManipulatinLab_random;
import java.util.*;
public class Task85 {

	public static void main(String[] args) {
		
	Random rn = new Random();
	int i = 1;
	int count1= 0;
	int count2= 0;
	int count3= 0;
	
	while (i<=10) {
	i++;
	int comp = rn.nextInt(6)+1;
	int human = rn.nextInt(6)+1;
		
		if(comp>human) {
			count1++;
			System.out.println("Computer wins !!!, Computer Number: " + comp + " Human number: " + human);
		}else if(comp==human) {
			count2++; 
			System.out.println("Equalse !!!,  Computer Number: " + comp + " Human number: " + human);
		}else if(human>comp) {
		    count3++;
		    System.out.println("Human wins !!!, Computer Number: " + comp + " Human number: " + human);
		}
	}
	
		if (count1>count3) {
			System.out.println("Finally Computers Wins " + count1 + " Times" + " Humans wins " + count3 + " Equals " + count2);
		}else if(count3>count1) {
			System.out.println("Finally Humans Wins " + count3 + " Times " + " Computer Wins " + count1 + "  Equals " + count2);
		}else if (count1==count3) {
			System.out.println("No bady wins " + count2 + " times equals");
		}
		
		
}
}