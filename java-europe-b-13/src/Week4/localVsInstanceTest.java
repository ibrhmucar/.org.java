package Week4;

public class localVsInstanceTest {

	
	
	public static void main(String[] args) {
	
	
	localVsInstance obj = new localVsInstance();

	System.out.println(" -----local variable-------");
	obj.showDifference();
	
	System.out.println("------instance variable-------");
	obj.a=10;
	System.out.println(obj.a);
	
	
	
	
	
	}	
}
