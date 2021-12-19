package day23_stringManipulatinLab_random;
import java.util.*;
public class Task84 {

	public static void main(String[] args) {
	
	Random rn = new Random ();
	
	
	
	for (int i=1 ; i<=10 ; i++) {
		
		if (rn.nextInt(2)==0) {
			System.out.println("Beste");
			}else {
			System.out.println("Bilge");	
			}
	
	}}}
