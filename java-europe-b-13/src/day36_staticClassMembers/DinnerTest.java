package day36_staticClassMembers;

public class DinnerTest {

	public static void main(String[] args) {
		
		
		
		Dinner mom = new Dinner();
		Dinner kid = new Dinner();
		Dinner dad = new Dinner();
		
		
		
		dad.takeASlice();
		kid.takeASlice();
		mom.takeASlice();
		
		System.out.println(dad.pizzaSlice);
		System.out.println(Dinner.pizzaSlice);
		
		kid.takeASlice(3);
		mom.takeASlice(2);
		
		System.out.println(Dinner.pizzaSlice);
		
				

	}

}
