package Week4;

public class ScrumTeam2 {

	public static void main(String[] args) {
		
	ScrumTeam company1 = new ScrumTeam();
	
	company1.companyName="Apple";
	company1.developers=1000;
	company1.tester=100;
	company1.developersSalary=200_000;
	company1.testerSalary=120_000;
	company1.companyRevenue=10_000_000_000d;
	
	
	System.out.println("Compnay Name : " + company1.companyName + ", Cost Of The Team : " +
			+ company1.costOfTheTeam()+ ", ");
	System.out.println(company1.returnOfInvestment());
		
		

	}

}
