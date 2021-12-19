package day30_wrappleClass;

public class wrapperClass {

	public static void main(String[] args) {
		
		
		String numberAsString = "2018";
		
		System.out.println(numberAsString);
		
		int number = Integer.parseInt(numberAsString);
		number += 1;
		System.out.println(number);
		
		double numbers = Double.parseDouble(numberAsString);
		System.out.println(numbers);

		Byte bt = new Byte((byte)123);
		Byte bt2 = new Byte("123");
		
		System.out.println(bt+1);
		System.out.println(bt2+1);
		
		int n1 = 10;
		Integer n2 = new Integer(10);
		System.out.println(n1);
		System.out.println(n2);
		
		n2.compareUnsigned(n1, n2);
		
		double d1 = 44.5;
		Double d2 = new Double (44.5);
		Double d3 = new Double ("44.5");
		
		
		char ch1 ='a';
		Character ch2 = new Character ('a');
		System.out.println(ch1);
		System.out.println(ch2);
		
		Integer num1 = Integer.valueOf(1234);
		Integer max = Integer.MAX_VALUE;
		
		Boolean bool1 = Boolean.valueOf("True");
		Boolean bool2 = Boolean.FALSE;
		Boolean bool3 = Boolean.valueOf(false);
		
		
		System.out.println(num1);
		System.out.println(max);
		System.out.println(bool1);
		System.out.println(bool2);
		System.out.println(bool3);
		
		
			
		
		
		
		
		
		
}
}
