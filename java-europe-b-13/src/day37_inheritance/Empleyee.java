package day37_inheritance;

public class Empleyee  extends Person{

	String jobTitle;
	
	public void  work() {
		System.out.println(name  + " is working as " + jobTitle );
	}


	public String toString() {
		return "Empleyee [jobTitle=" + jobTitle + ", name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
	
	
	
	
}
