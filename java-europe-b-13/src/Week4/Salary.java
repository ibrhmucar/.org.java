package Week4;

public class Salary {
	double rate;
	int weeklyHour;
	double taxRate;
	
	public void setInfo(double r, int h, double t) { // r, h, t are local variables
		rate=r;
		weeklyHour = h;
		taxRate = t;
	}
	
	public double salary() {
		return  rate*weeklyHour*52;
	}
	
	public double totalTax () {
		return salary()*taxRate;
	}
	
	public double salaryAfterTax() {
		return salary()-totalTax();
	}
	
	
	
}