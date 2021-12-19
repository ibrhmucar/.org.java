package day22_stringManipulation_Lab;

public class Lab3_Qustion7 {

	public static void main(String[] args) {
		
		System.out.println(comboString("Hello", "Hi"));
		System.out.println(comboString("Hi", "Hello"));
		System.out.println(comboString("aaa", "b"));
		
		

	}

	public static String comboString(String a, String b) {
		String c= "";
		if (a.length()>b.length()) {
			c=b+a+b;
		}else if (b.length()>a.length()) {
			c=a+b+a;
		}
		    return c;
	}

}
