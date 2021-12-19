package day27_arrays_part4;

public class Task95_2 {

	public static void main(String[] args) {
		
		int result = 0;
		int result2 = 0;
		int [][] scores = {
				
				{68,75,54,80},
				{100,64,20,50},
				{10,35,40,90}
				};

		for (int i=0 ; i<scores[0].length ; i++) {
			
			result = result + scores[0][i];
			
		}
		
			System.out.println("Stundent-1 avg scores is : " +  result/scores[0].length);	
		
		
		for (int i=0 ; i<scores.length ; i++) {
			
			result2= result2 + scores[i][0];
			
		}
			System.out.println("Total math scores : " + result2);
			System.out.println("Total math scores avg : "  + result2/scores.length);
		
		
		
	}

}
