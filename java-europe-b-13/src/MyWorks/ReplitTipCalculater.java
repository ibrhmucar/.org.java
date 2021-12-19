package MyWorks;
import java.util.Scanner;
public class ReplitTipCalculater {

	public static void main(String[] args) {

		  Scanner s = new Scanner(System.in);

		  System.out.println("Split:");
		  String split=s.next();
		  System.out.println("Number of people:");
		  int people=s.nextInt();
		  System.out.println("Check amount:");
		  double amount=s.nextDouble();
		  System.out.println("Servis Quality");
		  String Quality=s.next();
		  double totalPay=0;
		  double totalTip=0;
		  double totalPerPerson=0;
		  double tipPerPerson=0;

		 // System.out.println(split);
				  
		  for	(int j=1 ; j<=1 ; j++){
				System.out.print("Number of people entered: ");
				for (int i=1 ; i<=people ; i++) {
				System.out.print("&");
				
				}
				System.out.println();
		  }
if (split.equals("Yes")) {
		   if (Quality.equals("Fair")){
		      totalPay=amount+(amount*0.05);
		      totalTip=amount*(0.05);
		      totalPerPerson=totalPay/people;
		      tipPerPerson=totalTip/people;
		      System.out.println("Total to pay: " + totalPay);
		      System.out.println("Total tip: "+ totalTip);
		      System.out.println("Total per person: "+ totalPerPerson);
		      System.out.println("Tip per person: " + tipPerPerson);
		      
		  }else if(Quality.equals("Good")){
		      totalPay=amount+(amount*0.1);
		      totalTip=amount*(0.1);
		      totalPerPerson=totalPay/people;
		      tipPerPerson=totalTip/people;
		      System.out.println("Total to pay: " + totalPay);
		      System.out.println("Total tip: "+ totalTip);
		      System.out.println("Total per person: "+ totalPerPerson);
		      System.out.println("Tip per person: " + tipPerPerson);
		    
		  }else if(Quality.equals("Great")){
		      totalPay=amount+(amount*0.2);
		      totalTip=amount*(0.2);
		      totalPerPerson=totalPay/people;
		      tipPerPerson=totalTip/people;
		      
		      System.out.println("Total to pay: " + totalPay);
		      System.out.println("Total tip: "+ totalTip);
		      System.out.println("Total per person: "+ totalPerPerson);
		      System.out.println("Tip per person: " + tipPerPerson);
		      
		      
		  }else if (Quality.equals("Excellent")){
		      totalPay=amount+(amount*0.25);
		      totalTip=amount*(0.25);
		      totalPerPerson=totalPay/people;
		      tipPerPerson=totalTip/people;
		      System.out.println("Total to pay: " + totalPay);
		      System.out.println("Total tip: "+ totalTip);
		      System.out.println("Total per person: "+ totalPerPerson);
		      System.out.println("Tip per person: " + tipPerPerson);
		      
		  }    	

	}else if(split.equals("No")) {
		
			System.out.println("Bye bye");
	}

}
}