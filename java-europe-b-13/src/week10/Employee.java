package week10;

public class Employee {
	
	private String name, jobTitle;
	private int age;
	private double salary;
	private char gender;
	
	public Employee(String name, String jobTitle, int age, double salary, char gender) {
		this.name = name;
		this.jobTitle = jobTitle;
		setAge(age);
		setSalary(salary);
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public int getAge() {
		return age;
		
	}		
	
	public void setAge(int age) {
		if(age<=0) {
			System.err.println("Age can not be negative number");
			return;
		}
		if(age<=18) {
			System.err.println("Employee must be over 18 years old");
			return;
			}
			this.age = age;
	}
	
	
	public void setSalary(double salary) {
		if(salary<0) {
		return;
		}
		
		this.salary = salary;
		
	}
	

	public double getSalary() {
		return salary;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public void work() {
		System.out.println(" is working");
	}
	

}
