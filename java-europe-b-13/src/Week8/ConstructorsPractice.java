package Week8;

public class ConstructorsPractice {

	
	//1
	public ConstructorsPractice() {
		
		this(5);//go to number 2 -----  (2)
		System.out.println("a");//print 3 -----(6)
			
	}
    //2
	public ConstructorsPractice(int num) {
		this("ahmet"); // go to number 3----- (3)
		
		System.out.println("b");//print 2--- (5)
		
	}
	//3
	public ConstructorsPractice(String str) {
		System.out.println("c");// print 1---- (4)
		
		
	}
	
	   public static void main(String[] args) {
		   
		   new ConstructorsPractice();// go to number 1-----  (1)
		   
	   }
	
	
}
