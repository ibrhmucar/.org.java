package day15_methods_Part3;

public class Task67Ozzy {

	public static void main(String[] args) {
		
		
		if(lastDigit(5,113)) {
 			System.out.println("They have the same last digit");
 		}else {
 			System.out.println("They do not have the same last digit");
 		}



 	}

 	public static boolean lastDigit(int num1, int num2) {

 			if((num1%10)==(num2%10)) {
 				return true;
 			}else {
 				return false;
 			}

 	}




 }