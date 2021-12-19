package week10;

public class SupportPersonel extends Employee {

	public SupportPersonel(String name, String jobTitle, int age, double salary, char gender) {
		super(name, jobTitle, age, salary, gender);
		
	}
	
	
	public void work() {
		System.out.println(getName() + " is suporting ");
	}

}
