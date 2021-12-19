package day20_stringManipulation_part2;

public class String_IndexOf2 {

	public static void main(String[] args) {
		
		 
	String list = "html-selenium-angular-jenkins-grid";
	
	int firsDash = list.indexOf("-");
	System.out.println(firsDash);
		
	int secondDash = list.indexOf("-", 5);
	System.out.println(secondDash);
	
	int thirdDash = list.indexOf("-", secondDash+1);
	System.out.println(thirdDash);
	
	//int fourthDash = list.indexOf("-",thirdDash+1);
	//System.out.println(fourthDash);
	
	int lastDash = list.lastIndexOf("-");
	System.out.println(lastDash);
	
	int x = list.lastIndexOf("-" , 28);
	//System.out.println(x);
	System.out.println(x);
	System.out.println(list.charAt(21));
	
	}

}
