package day37_inheritance;

public class Person {

	String name;
	int age;
	char gender;
	
	public void eat(String food) {
		
		System.out.println(name + " is eating " + food);
		
	}
	
	public void walk () {
		System.out.println(name + " is walking ");
	}
	
	
	public void sleep (int hours) {
		
		System.out.println(name + " is sleeping for " + hours + " hours");
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
