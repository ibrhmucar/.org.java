package day13_methods_Part1;

public class creditCardMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double salary=50000;
		int creditRating=5;
		
		if (salary>=20000 && creditRating>=65000) {
			
			qualify();
			
		}else {
			
			noQualify();	
			
		}	
			
		}
		
		public static void noQualify() {
		System.out.println("i am sorry, you are not qualifed for the CC");
			
			
	}

		public static void qualify () {
		
		System.out.println("Congrat, you are qualifed for the CC");	
	
	
	
	
		
		
	}

	
	
	
	
}
