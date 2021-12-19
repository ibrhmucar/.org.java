package week10;

public class Developer extends Employee {

	public Developer(String name, String jobTitle, int age, double salary, char gender) {
		super(name, jobTitle, age, salary, gender);
		
	}
	
	public void work() {
		System.out.println(getName()+ " is coding");
	}
	
	public void fixBugs() {
		System.out.println(getName()+ " is crying about bug");
		
	}

}
