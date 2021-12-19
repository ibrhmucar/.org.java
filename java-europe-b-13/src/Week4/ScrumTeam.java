package Week4;

public class ScrumTeam {

	String companyName;
	int developers;
	int tester;
	double developersSalary;
	double testerSalary;
	double companyRevenue;
	
	
	public double costOfTheTeam() {
	
		return developers*developersSalary+tester*testerSalary;
		
		
	}
	
	public double returnOfInvestment() {
		
		return companyRevenue/costOfTheTeam();
		
	}
	
	
	
	
}
