package day36_staticClassMembers;

public class StundetTest {

	public static void main(String[] args) {
		
		Student s1 = new Student ("Mike", 30,1000);
		Student s2 = new Student ("Ozzy", 20,1200);
		Student s3 = new Student ("Jamal",10,1500);
		
		s1.School="CybertekEU"; // belengs to class, so made change all class 
		
		
		System.out.println(s1.age);
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		
		
		
		
	}

}
