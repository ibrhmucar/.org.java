package day16_classObejcts;

public class DogObjects {

	public static void main(String[] args) {
		
		
		Dog dog1 = new Dog(); //breed, age, color, name; 
		
		Dog dog2 = new Dog(); //breed, age, color, name; 
		
		Dog dog3 = new Dog(); //breed, age, color, name; 
		
		
		dog1.name="Rover";
		dog1.age=10;
		dog1.breed="Maltese";
		dog1.color="Red";
		
		System.out.println(dog1.age);
		System.out.println(dog1.color);
		System.out.println(dog1.breed);
		
		
		dog1.barking();
		dog1.hungry();
		dog1.sleeping();
		
	}

}