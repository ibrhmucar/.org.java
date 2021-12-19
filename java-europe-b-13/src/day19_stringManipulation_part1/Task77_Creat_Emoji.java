package day19_stringManipulation_part1;
import java.util.Scanner;
public class Task77_Creat_Emoji {

	public static void main(String[] args) {
		
		
	/*	String smile = ":)";
		String sad = ":(" ;
		String upset = ":/";
		String playful = ":p";
		
		String wink = ";)";
		String surprised = ";O" ;*/
		
	Scanner sc = new Scanner (System.in);
	System.out.println("please enter your emoji:");
	String emoji = sc.next();
	
	if (emoji.length()==2) {	
		
			if (emoji.charAt(0)==':') {
			
			switch (emoji.charAt(1)) {
			
			case ')':
				System.out.println("smile");
				break;
			case '(':
				System.out.println("sad");
				break;
			case '/' :
				System.out.println("upset");
				break;
			case 'p' :
				System.out.println("playful");
				break;
					
			default :
				System.out.println("invalid emeoji");
			}
		}else if (emoji.charAt(0)==';') {
			
			switch (emoji.charAt(1)) {
			case ')':
			System.out.println("wink");
			break;
			case 'o': case 'O':
			System.out.println("surprised");
			break;
			default :
			System.out.println("invalid emeoji");
			
			}
		}
	}else {
		System.out.println("invalid");
	}
	}
}
