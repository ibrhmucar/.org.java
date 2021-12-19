package day14_methods_Part2;

public class Lab5_CaughtSpeeding_2 {

	public static void main(String[] args) {
		
	caughtSpeeding(60,false);
	caughtSpeeding(65,false);
	caughtSpeeding(65,true);
		

	}

	public static void caughtSpeeding(int i, boolean b) {
		
		if       (b == false &&  i<=60){
			System.out.println("0");
		}else if (b == false && (i>60 && i<=80)){
			System.out.println("1");
		}else if (b == false && i>80) {
			System.out.println("2");
			
		}else if (b == true &&  i<=65){
				System.out.println("0");
		}else if (b == true && (i>65 && i<=85)){
				System.out.println("1");
		}else if (b == true && i>85) {
				System.out.println("2");
					
		}
	}
		
		
		
		
		
	}

	
	
	

