package day13_methods_Part1;

public class task61_AgeCalculator {

	public static void main(String[] args) {
		
		calculateAge(2021,1984);
		

	}

	public static void calculateAge(int curruntYear, int birthYear) {
		
		int age=curruntYear-birthYear;
		
		System.out.println("age is " + age);
		
		
	}

}
