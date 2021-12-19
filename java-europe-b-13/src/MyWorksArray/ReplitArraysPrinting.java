package MyWorksArray;
import java.util.Scanner;
public class ReplitArraysPrinting {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String[] arr = new String[5];
		for (int i=0;i<5;i++)
		{
			System.out.println("Enter word");
			arr[i] = input.nextLine();
		}
		//leave above alone!  write your code below. 
		//Create another loop for your solution!
		
    for (int i=0 ; i<arr.length ; i++) {
    	arr [i] = arr[i].substring(0, 3);
    	System.out.println(arr[i]);
    }
        //System.out.println(arr[i]);
        
	}
    	
}
