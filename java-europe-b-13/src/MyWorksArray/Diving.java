package MyWorksArray;
import java.util.Scanner;
public class Diving {

	public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
		
	float [] score = new float [7];
	
	for(int i=0 ; i<score.length ; i++){
	 System.out.println("Enter score for judge " + (i+1) + ":");
	 score [i] = scan.nextFloat();
	}
	
	float max = score [0];
	float min = score [0];
	float a = 0;
	float total = 0;
	for (int i=0 ; i<score.length ; i++) {
		if(max<score[i]) {
			max=score[i];
		}else if (score[i]<min) {
			min= score[i];
		}
	}
	
	for (float sum : score) {
		
		a +=sum;
	}
	
	total = a-(min+max);
	System.out.println("Enter difficulty");
	float c = scan.nextFloat();
	total = total*c;
	total = (float) (total*0.6);
	System.out.printf("Total: %.2f", total);
		

	}

}
