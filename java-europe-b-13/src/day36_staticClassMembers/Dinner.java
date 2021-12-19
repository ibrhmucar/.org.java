package day36_staticClassMembers;

public class Dinner {
	
	static int pizzaSlice = 8; // belongs to object without static.
	
	
	
	public void takeASlice() {
		pizzaSlice--;
		
	}
	
	public void takeASlice(int count) {
		pizzaSlice-=count;
		
	}
	
	
	

}
