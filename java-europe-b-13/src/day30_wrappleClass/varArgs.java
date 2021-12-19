package day30_wrappleClass;

public class varArgs {

	public static void main(String[] args) {
		
	sum(2,4);	
	sum(2,3,5,6);
	sum(10,20,30);
	System.out.println(concat("Apple", "Orange" , "123" , "Result"));	

	}
	
	public static void sum(int... numbers) {
		
		int sum = 0;
		
		for (int a : numbers) {
			
			sum = sum + a;
		}
		
		System.out.println(sum);
		
		
	}
	public static String concat(String...strs ) {
		String newStr = "";
		for(String a : strs) {
			
			newStr= newStr + a.charAt(2);
		}
		
		return newStr;
	}
	
	

}
