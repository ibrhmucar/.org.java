package Replit;

public class isPos {

	public static void main(String[] args) {
		

	int [] arr = {0,3,1};	
		
	int a = 0;
	
	for(int i=0 ; i<arr.length ; i++) {
		a = arr[i];
		isPos(a);
	}
		
		
		
	}

	public static void isPos(int num) {
		
		if(num>0) {
			System.out.println("positive");
		}else if(num<0) {
			System.out.println("negative");
		}else if(num==0) {
			System.out.println("zero");
		}
		
		
		
		
		
		
		
	}
	
	
	
	
	
}
