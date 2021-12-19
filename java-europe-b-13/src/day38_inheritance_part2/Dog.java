package day38_inheritance_part2;

public class Dog extends Animal{

	
	private int eyes;
	private int legs;
	private int tail;
	private int teeeth;
	private String coat;
	
	
	public Dog(String name, int brain, int body, int size, int weight, int eyes, int legs, int tail, int teeeth,
			String coat) {
		super(name, brain, body, size, weight);
		this.eyes = eyes;
		this.legs = legs;
		this.tail = tail;
		this.teeeth = teeeth;
		this.coat = coat;
	}
	
	public void chew() {
		System.out.println("Dog.chew() is called");
		
	}
	
	public void eat() {
		System.out.println("Dog.eat() called");
		chew();
		super.eat();
			
	}
	
	public void walk() {
		System.out.println("Dog.walk() called");
		
	}
	
	public void run() {
		System.out.println("Dog.run () called");
	}
	
	public void move(int speed) {
		System.out.println("Dog.move() called");
		moveleg(speed);
		super.move(speed);
	}
	
	public void  moveleg(int speed) {
		System.out.println("Dog.moveLegs() called");
	}
	
}
