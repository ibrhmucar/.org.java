package day04_arithmatic_operators;

public class wages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double regularWage; //The calculated regular wage
		double basePay=25.75;	//The base pay
		double regularHours=40; //The hours worked less overtime
		
		double overTimeWages; //Overtime wages
		double overTimePay=37.5; //Overtime Pay Rate
		double overTimeHours=15;
		double totalWage; // Total Wage
		
		regularWage=basePay*regularHours;
		overTimeWages=overTimePay*overTimeHours;
		totalWage=regularWage+overTimeWages;
		
		System.out.println("Wages for this week are $ " + totalWage);
		
		
	}

}
