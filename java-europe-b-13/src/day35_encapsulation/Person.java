package day35_encapsulation;

public class Person {
	
	private String name;
	private int age;
	private char gender;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public void setAge(int age) {
		
		if(age<0) {
		System.out.println("Not valid age");
		}else {
		this.age= age;
		}
	}
	
	public int getAge() {
		return age;
	
	}
	
	

}
