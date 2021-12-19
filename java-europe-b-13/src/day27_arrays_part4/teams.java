package day27_arrays_part4;

public class teams {

	public static void main(String[] args) {
		
		String [][] teams = new String [2][4];
		
		teams [0][0] = "Mike";
		teams [0][1] = "Tonny";
		teams [0][2] = "Smith";
		teams [0][3] = "Evan";
		
		teams [1][0] = "David";
		teams [1][1] = "Emmy";
		teams [1][2] = "John";
		teams [1][3] = "Ryan";
		
		System.out.println("First player of first team");
		System.out.println(teams[0][0]);
		System.out.println(teams[0].length);
		
		
		String [] [] teams1 = { {"Mike", "Tommy", "Smith" , "Evan"},{"David", "Emmy" , "John" , "Ryan"}};
		
		System.out.println("First player of first team");
		System.out.println(teams1[0][0]);
		System.out.println(teams1[0].length);
		System.out.println(teams1[1].length);
		
		
		int [][] numbers = { {1,2,3}, {4,5,6}, {7,8,9} } ;
		
		System.out.println(numbers[1][2]);
		
		System.out.println("First player of first team");
		System.out.println(numbers[0][0]);
		System.out.println(numbers[0].length);
		
		
		
		
		
	}

}
