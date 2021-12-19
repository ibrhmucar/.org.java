package day20_stringManipulation_part2;

public class Task80_CheckedString {

	public static void main(String[] args) {
	
		
		
		checkedString("Your order confirmation number is XYZ", "confirmation");
		
		}
	private static void checkedString(String str1, String str2) {
	
				
		
		if (str1.contains(str2)) {
			
			System.out.println("1");
			System.out.println(str1.indexOf(str2));
		}else {
			System.out.println("not found");
		
	}

}
}