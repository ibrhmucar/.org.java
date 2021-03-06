package Week8;

public class Microsoft {

	public static void main(String[] args) {
		
		
		
		int [] nums = {1,2,3};
		
		
		Employee [] testers = {
				new Employee("Eyup", "SDET", 10, 100_000),
				new Employee("Vasilika", "ScrumMaster", 5, 120_000),
				new Employee("Selena", "QA Eng", 7, 85_000),
				new Employee("Merve", "Senior_SDET", 8, 150_000)
		};
		
		double minSalary = Double.MAX_VALUE;
		double maxSalary = Double.MIN_VALUE;
		
		String personWhoMakesMax="";
		String personWhoMakesMin="";
		
		
		for(Employee each : testers) {
			if(each.salary>maxSalary) {
				maxSalary=each.salary;
				personWhoMakesMax=each.name;
				System.out.println(each.companyName);
			}
			if(each.salary<minSalary) {
				minSalary=each.salary;
				personWhoMakesMin=each.name;
			}
			
		}
		
		System.out.println(personWhoMakesMax+ " " + maxSalary);
		System.out.println(personWhoMakesMin+ " " + minSalary);
		
		System.out.println(testers.toString());
		
	}

}
