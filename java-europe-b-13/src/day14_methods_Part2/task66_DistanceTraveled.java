package day14_methods_Part2;

public class task66_DistanceTraveled {

	public static void main(String[] args) {
		
	double distance2 = distance (40,5);
	
	System.out.println(distance2);
		
	if (distance2 >500) {
	   System.out.println("You spent to much gas");
	}else {
	   System.out.println("you spent ok gas");
	}
		
		
	}
	
	public static double distance(double speed, int time) {
	
		double res = speed * time ;
	
		return res ;
		
		
	}
		
		
}
