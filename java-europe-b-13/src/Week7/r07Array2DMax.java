package Week7;

public class r07Array2DMax {

	public static void main(String[] args) {
		
		int [][] arr2D = {
						 {-100,-200,300},
						 {-40,500},
						 {-100,250,-800}
						 };
		
		int max = arr2D[0][0]; 
		int min = arr2D[0][0];
		
		for (int i=0; i<arr2D.length ; i++) {
			for(int j=0 ; j<arr2D[i].length; j++) {
				if(arr2D[i][j]>max) {
					max = arr2D[i][j];
				}else if(arr2D[i][j]<min) {
					min = arr2D[i][j];
				}
			}
		}
		
		     System.out.println(max + "  " + min );
		
		
		
		
	}

}
