package day14_methods_Part2;

public class Lab6_CigarParty_2 {

	public static void main(String[] args) {

		
		cigarParty(30, false);
		cigarParty(50, false);
		cigarParty(70, true);
		
	}

	public static void cigarParty(int i, boolean isWekeend) {
		
	if (isWekeend) {
		  if (i>=40) {
			System.out.println("true");
		  }else {
			  System.out.println("false");
		}
	 }else {
		 if (i>=40 && i<=60) {
		 System.out.println("true");
	 }else {
		 System.out.println("false");
	 }
		
		
	}

}
}