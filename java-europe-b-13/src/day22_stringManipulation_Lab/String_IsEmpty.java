package day22_stringManipulation_Lab;

public class String_IsEmpty {

	public static void main(String[] args) {
		
		String userName = "";
		String passWord = "";
		
		if(userName.isEmpty()) {
			System.out.println("UserName field can not be empty");
		}else {
			System.out.println("UserName is not empty");
		}
		
		if(userName.isEmpty() || passWord.isEmpty()) {
			System.out.println("Username or password can not be empty");
		}else 
			System.out.println("Username or password is not empty");
		
		String a = "Java is a fun";
		
		System.out.println(a.substring(4,5).isBlank());
		
		
	}

}
