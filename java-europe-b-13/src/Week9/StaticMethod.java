package Week9;

public class StaticMethod {
	

	int num=10;
	
	static int count = 5;
	
	public static void displayMessage(String message) {
		
		System.out.println("message : " + message);
		System.out.println("Count :" + count);
	//	System.out.println("Num : " + num); it's gives error. because num is not static
		
		
	}

	public static void anotherStaticMethod() {
		System.out.println("I created this method to call another static method");
		displayMessage("EU7 is hanging on, did not give up yet");
		
	}
	
	public void instanceMethod() {
		System.out.println("instancemethod");
		System.out.println("num : " + num);
		System.out.println("count :" + count);
		
		
	}
	
	
}
