package Week4;

public class Art {

	
	
	public static void draw() {
	System.out.println("Basic drawing ");
	
	}
	
	public static void draw(String color) {
	
	System.out.println("Basic drawing " + color);	
		
		
	}
	
	public static void draw(int size) {
		
		System.out.println("Basic drawing " + size);	
		
	}
	
	public static void draw(String color, int size) {
		
		System.out.println("Basic drawing " + color + " and size " +  size);
	
		
	}
	
	public static void main(String[] args) {
		
		draw();
		draw("Red");
		draw(34);
		draw("Red",34);
		
		

	}

}
