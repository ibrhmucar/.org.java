package day36_staticClassMembers;

public class Student {
	
	
	String  name;
	int age;  // belongs to object
	int idNumber;
	static String School = "Cybertek"; // belongs to class
	
	
	public Student(String name, int age, int idNumber) {
		
		this.name = name;
		this.age = age;
		this.idNumber = idNumber;
		
	}


	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", idNumber=" + idNumber + ", School=" + School + "]";
	}
	
	

}
