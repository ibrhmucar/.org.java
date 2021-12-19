package day38_inheritance_part2;

public class StaticTest {

	public static void main(String[] args) {
		
		StaticSub sub = new StaticSub();
		
		sub.m2();
		sub.m1();
		
		sub.num=5;
		sub.print();
		
		StaticSuper.num=10;
		StaticSuper.m1();
		sub.print();
		StaticSub.m1();

	}

}
