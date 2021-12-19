package MyWorks;

public class Eclips_Merge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	String str = "12345";
	String str1= "abcde";
	String tree ="";
	
	for (int i=0 ; i<str1.length() ; i++) {
		
		
		tree += str.charAt(i)+""+str1.charAt(i);
		
		
	}
		String last = tree + ""+ str.substring(str1.length(),str.length());
		System.out.print(last);
		
		
		
	}

}
