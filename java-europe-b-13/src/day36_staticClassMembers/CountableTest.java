package day36_staticClassMembers;

public class CountableTest {

	public static void main(String[] args) {
		
		int objectCount;
		
		Countable obj1 = new Countable(); // while belongs to object it returns 1
		Countable obj2 = new Countable(); // while belongs to class it return the number of created object
		Countable obj3 = new Countable();
		Countable obj4 = new Countable();
		Countable obj5 = new Countable();
		
		objectCount = obj1.getInstanceCount();
	//	objectCount = obj2.getInstanceCount();
	
		
		System.out.println(objectCount);
		System.out.println(Countable.instanceCount);
		System.out.println(obj1.getInstanceCount());
	}

}
