package Week8;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class R01_ArrayListPractice {

	public static void main(String[] args) {
		
	System.out.println(listGenerator());
	
	ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3));
	
	
		
	}
	public static ArrayList<Integer> listGenerator(){
		
		ArrayList<Integer> list = new ArrayList<>();
		
		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		
		
		while(flag) {
			
			System.out.println("Please enter a number");
			list.add(scan.nextInt());
			
			System.out.println("Do you want to continue");
			String response = scan.next();
			
				if (response.equalsIgnoreCase("no")) {
					flag = false;
					break;
				}
		}
			
		return list;	
			
			
	}
}
	

