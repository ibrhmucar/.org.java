package week10;

public class Tester extends Employee{

	public Tester(String name, String jobTitle, int age, double salary, char gender) {
	super(name, jobTitle, age, salary, gender);
		
	}

	@Override
	public void work() {
		
		super.work();
	}
	
	
		
		public void findBugs() {
			System.out.println(getName()+" found a bug");
	}
	
	
	
	

}
