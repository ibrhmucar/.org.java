package Week4;

public class Art2 {

	

		public static void draw() {
			System.out.println("Basic drawing");
		}
		
		public static void draw(String color) {
			System.out.println("Drawing with "+color);
		}
		
		public static void draw(int size) {
			draw("red");
			System.out.println("Drawing with size "+size);
		}
		
		public static String draw(String color, int size) {
			String result = "Drawing with "+color+" and size "+size;
			return result;
		}
		
		
		
		public static void main(String[] args) {
			
			draw();
			draw("red");
			draw(5);
			
			System.out.println(draw("yellow",8));
		}
		
	}	


