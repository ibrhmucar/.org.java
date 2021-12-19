package Week7;

public class r04_WrapplerClass {

	public static void main(String[] args) {
		
		int i1 = 100;
		Integer i2 = Integer.valueOf(100);
		Integer i3 = new Integer(100);
		Integer i5 = new Integer("100");//object
		Integer i4 = Integer.valueOf("100");//object
		
		System.out.println(i1+" "+i2+" "+i3+" "+i4+" "+i5);
		
		String str = "123";
		int num = Integer.parseInt(str);
		System.out.println(num);
		
		Integer num2 = Integer.valueOf(str);
		
		System.out.println(num2.equals(123));
		
		

	}

}
