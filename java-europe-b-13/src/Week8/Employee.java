package Week8;

public class Employee {

	String name, jobtitle;
	public int ID;
	public double salary;
	
	public static String companyName = "Microsoft";
	
	
	public Employee(String name, String jobtitle, int iD, double salary) {
		
		this.name = name;
		this.jobtitle = jobtitle;
		ID = iD;
		this.salary = salary;
	}

	public String toString() {
		return "Emplyoyee [name=" + name + ", jobtitle=" + jobtitle + ", ID=" + ID + ", salary=" + salary + "]";
		
		
	}
	
	
	
}
