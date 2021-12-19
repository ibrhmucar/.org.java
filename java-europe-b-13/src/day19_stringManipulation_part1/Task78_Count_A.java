package day19_stringManipulation_part1;

public class Task78_Count_A {

	public static void main(String[] args) {
		
		String str = "abcabqcabc";
		int count = 0;
		
		for (int i=0 ;  i<str.length() ; i++) {
		
			if (str.charAt(i)=='a') {
				
				count++;
				
				
			}else {
				
				continue;
				
			}
			

	}
		
		System.out.println(count);

}
}