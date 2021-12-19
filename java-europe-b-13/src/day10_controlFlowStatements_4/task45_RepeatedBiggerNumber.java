package day10_controlFlowStatements_4;

public class task45_RepeatedBiggerNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
				
	for (int a=10,b=7,c=1 ; c<=4 ; a+=2, b+=3, c++) {
		
		if (a>b) {
			System.out.println("a bigger than b");
			System.out.println("a is :"+ a + " b is "+ b );
			
		}else if(a==b) {
			System.out.println("a equals to b");
			System.out.println("a is :"+ a + " b is "+ b );
			
			
		}else if (b>a) {
			System.out.println("b bigger than a");
			System.out.println("a is :"+ a + " b is "+ b );
			
		}
		
		
	}
		
		int num1=20;// Ozzy'nin örneği:
		int num2=30;
		
		for (int i=0 ; i<2 ; i++) {
			if (num1>num2) {
				System.out.println("num1 büyük num2");
		
			}else if (num1==num2) {
				System.out.println("num1 eşit num2");
				
			}else if (num2>num1) {
				System.out.println("num2 büyük num1");
			}
		}
		
	
	
	}
	
	

}
