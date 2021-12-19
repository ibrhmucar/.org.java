package week10;

public class AmazonInc {

	public static void main(String[] args) {
		
		
Tester tester = new Tester("Polad", "SDET", 3500000, 18,'M');
		
		tester.setJobTitle("Quality Engineer");
		tester.setAge(25);
		tester.findBugs();
		
		Developer developer = new Developer("Ibrahim", "Front End Developer", 350000, 27 , 'M');
		
		developer.fixBugs();
		developer.setSalary(1500000);
		System.out.println(developer.getSalary());
		

	}

}
