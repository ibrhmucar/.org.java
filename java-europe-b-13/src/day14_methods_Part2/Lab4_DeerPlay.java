package day14_methods_Part2;

public class Lab4_DeerPlay {

	/*
	The deers in VA spend most of the day playing. In particular, they play 
	if the temperature is between 60 and 90. Unless it is summer, 
	then the upper limit is 100 instead of 90.
	Write a method that accepts temperature and a boolean isSummer, 
	prints true if the deers play and false otherwise.
	
	
	deerPlay(70, false); - > true
	deerPlay(95, false); - > false
	deerPlay(95, true); - > true
	*/
	
	
	
	
	public static void main(String[] args) {
		
	deerPlay(70,false);	
	deerPlay(95,false);
	deerPlay(95,true);

	}

	public static void deerPlay(int i, boolean b) {

	if (b == true && (i>=60 && i<=100) ) {
		System.out.println("true");
	}else if (b == false && (i>=60 && i<=90)) {
		System.out.println("true");
		
	}else {
		System.out.println("false");
	}	
		
		
	}
		
		
		
}
	


			
			
		
		
		
		
		


