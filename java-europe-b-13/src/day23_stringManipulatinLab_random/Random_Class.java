package day23_stringManipulatinLab_random;
import java.util.Random;
public class Random_Class {

	public static void main(String[] args) {
	
	Random rn = new Random();
	
	int random = rn.nextInt(200) -150;
	
	System.out.println(random); 
	System.out.println(rn.nextDouble());
	System.out.println(rn.nextBoolean());
	System.out.println(rn.nextFloat());
		
		
		
		
	}

}
