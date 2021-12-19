package day20_stringManipulation_part2;
import java.util.Scanner;
public class Task82_Login_Functionality_Logic {

	public static void main(String[] args) {
		
	
		
		
	Scanner scan = new Scanner (System.in);
	System.out.print("Enter Username:");
	String username = scan.nextLine();
	System.out.print("Enter Password:");
	String password = scan.nextLine();
	
	String userNameinSystem= "Mike";
	String passwordinSystem= "123";
	
	
	
	if (username.equals("") && password.equals("")) {
		System.out.println("Username and Password Fields cannot be empty!");
	}else if (username.equals("") && !password.equals("") ) {
		System.out.println("UserName connot be empty!");
	}else if (!username.equals("") && password.equals("") )  {
		System.out.println("Password cannot be empty!");
	}else if (!username.equals(userNameinSystem)|| (!password.equals(passwordinSystem))){
		System.out.println("Username or password is not valid!");
	}else if (username.equals(userNameinSystem)|| (password.equals(passwordinSystem))){
		System.out.println("User logged succesfully :)");
	}	
	}}		
		
