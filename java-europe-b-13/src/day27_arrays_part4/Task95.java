package day27_arrays_part4;

public class Task95 {

	public static void main(String[] args) {
		
    double result = 0;
    
	double [][] student1 = { {68,75,54,80} };
	double [][] student2 = { {100,64,20,50} } ;
	double [][] student3 = { {10,35,40,90} };
	
	System.out.println("Klasik Yöntem ile çözümü");
	
	double avg = ((student1[0][0]+student1[0][1]+student1[0][2]+student1[0][3])/4);
		
	System.out.println(avg);
	
	System.out.println("For Loop ile çözümü");
	
	for (int i=0 ; i<student1[0].length ; i++) {
		
		result= result+ student1[0][i];
		
		
		
	}
	  System.out.println("result is " + (result/student1[0].length));
	  
	  System.out.println("Total Math Score ");
	  
	  
	  double matAvg = (student1[0][0] + student2[0][0] + student3[0][0])/3;
	  
	  System.out.println(matAvg);
	  
	  
	  
	  
	  
	  
	  
	  
	  
	
	}
	
			
	
	

}
