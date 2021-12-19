package Week9;

public class StaticTest {

	public static void main(String[] args) {
	
		StaticMethod.displayMessage("Hello Everybody");
		StaticMethod.anotherStaticMethod();
		
		StaticMethod obj = new StaticMethod();
		obj.anotherStaticMethod();
		obj.displayMessage("Hell yea");
		
		

	}

}
