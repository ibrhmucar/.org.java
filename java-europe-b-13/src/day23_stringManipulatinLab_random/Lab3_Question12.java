package day23_stringManipulatinLab_random;

public class Lab3_Question12 {

	public static void main(String[] args) {
		
		
	System.out.println(catDog("catdog"));	
	System.out.println(catDog("catcat"));	
	System.out.println(catDog("catdogabcdog"));	
	System.out.println(catDog("catcatdogdog"));
	System.out.println(catDog("catdogcatdogcado"));
		
		
	}
	

	public static boolean catDog(String str) {
	boolean flag = true;
	int counter = 0;
	int counter1 = 0;
	
	for (int i=0 ; i<str.length()-2 ; i++) {	
	
	if(str.substring(i, i+3).equals("cat")) {
		counter++;
	}
	if (str.substring(i, i+3).equals("dog")) {
		counter1++;
	}
	}
	
	if (counter==counter1) {
		
		return flag;
		
	}else {
		
		flag = false;
		return flag;

	}}}
	
	

