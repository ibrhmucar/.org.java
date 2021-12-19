package MyWorks;
import java.util.Scanner;
public class forLoop4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	/* for (int x=7 ; x>0 ; x--) {
		 for (int y=1 ; y<=x ; y++) {
			System.out.print("*"); 
		 } 
			 System.out.println(); 
			 } 
	 
		
	for (int a=0 ; a<7 ; a++) {
		 for (int b=0 ; b<=a ; b++) {
			 System.out.print("*");
			 
		 }
			 System.out.println();
		 }*/
	/*for	(int j=1 ; j<=1 ; j++){
			System.out.print("Number of people entered: ");
			for (int i=1 ; i<=4 ; i++) {
			
				System.out.print("&");
	}
		
	}	*/
		
		  Scanner scan = new Scanner(System.in);
		  
		   String human = "&";
		   String splitt= scan.nextLine();
		  
		   System.out.println();
		   
		   
		   int number = scan.nextInt();
		   double hesap = scan.nextDouble();
		   String quality= scan.next();
		   scan.close();
		   
		   
		   double oran=0;
		  switch(quality){
		    case "Excellent":
		      oran=0.25;
		      break;
		    case "Great":
		      oran=0.20;
		      break;
		    case "Good":
		      oran=0.15;
		      break;
		    case "Fair":
		      oran=0.10;
		      break;
		    case "Poor":
		      oran=0.05;
		      break;
		  }
		   
		  
		  double kisi_basi = hesap/number ; 
		  double tip= hesap*oran;
		  double hesap_tipli= hesap + tip;
		  double kisi_basi_tipli = hesap_tipli/number;
		  double kisi_basi_tip = tip/number; 
		  
		  if(splitt.equals("Yes")) {
			   System.out.println("Split:");
		       System.out.println("Number of people:");
		       System.out.println("Check amount:");
		       System.out.println("Service Quality:");
			  
			   System.out.println("Number of people entered: "+human.repeat(number));
			   System.out.printf("Total to pay: %.1f\n",hesap_tipli);
			   System.out.printf("Total tip: %.1f\n", kisi_basi);
			   System.out.printf("Total per person: %.2f\n",kisi_basi_tipli);
			   System.out.printf("Tip per person: %.2f",kisi_basi_tip);
		   }
		  else if(splitt.equals("No")){
			  System.out.println("Number of people entered: "+human.repeat(number));   
			  System.out.printf("Total to pay: %.1f\n",hesap_tipli);
			  
		   }
		  else {
			  System.out.println("Düzgün Gir!!!");
		  }
		   
		  
		
		
		
	}
}
	 
