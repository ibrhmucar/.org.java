package day15_methods_Part3;

public class task68_Retirement {

	public static void main(String[] args) {
		
		
		yearsUntilRetirement("Mike",1985);

	}

	public static int calculateAge(int yearBirth) {
		
		int age = 2021 - yearBirth;
	
		return age;
		
		
	}
	
	
	public static void yearsUntilRetirement(String name, int year) {
		
		int retirmentAge = 65- calculateAge(year);
		
		System.out.println(name +" retires in " + retirmentAge + " years ");
		
		
	}
	
}
