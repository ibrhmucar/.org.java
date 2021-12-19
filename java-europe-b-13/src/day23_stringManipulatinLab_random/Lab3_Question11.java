package day23_stringManipulatinLab_random;

public class Lab3_Question11 {

	public static void main(String[] args) {
		
		
		System.out.println(countHi("abc hi ho"));
		System.out.println(countHi("abc hi hi"));
		System.out.println(countHi("hihi"));
		System.out.println(countHi("hi abcde hi deghieualkjdhi"));
	}

	public static int countHi(String str) {
		
		int count = 0;
		
		for (int i=0 ; i<str.length() ; i++) {
		
		if (str.charAt(i)== 'h' && str.charAt(i+1)=='i') {
			
			count ++;
		
		}else {
			
			continue;
		}
		
			
		}
		return count;}}		
	
		
	


