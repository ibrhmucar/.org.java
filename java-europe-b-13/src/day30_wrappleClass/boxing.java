package day30_wrappleClass;

public class boxing {

	public static void main(String[] args) {
		
		//Autoboxing
		Integer num1 = 1234;
		int n = 5;
		Integer num2 = n;
		
		//Unboxing
		Double d1 = new Double (34.2);
		double d2 = d1;
		
		long l1 = new Long (6000000L);//unboxing
		Long l2 = new Long (34345164);//no boxing
		long l3 = l2; //unboxing
		
		int x = 345;
		double y = x; 
		System.out.println(y); // casting
		
		
		Integer num3 = Integer.valueOf(345);
	//	Double d3 = num3; // casting not possible with wrapper classes
		//System.out.println(num3+1);

	}

}
