package MyWorks;
import java.util.Scanner;
public class MyOwnWorks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int seniorCitizens, nonSeniorCitizens, age, a;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens");
		seniorCitizens = scan.nextInt();
		nonSeniorCitizens = scan.nextInt();

		System.out.println("What is new citizen's age");
		age = scan.nextInt();

		if (age>=65) {
		a=++seniorCitizens;
		System.out.println("Senior Citizen");	
		
		}
		
		
		
	}

}
