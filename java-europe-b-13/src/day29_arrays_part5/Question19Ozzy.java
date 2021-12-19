package day29_arrays_part5;

public class Question19Ozzy {

public static void main(String[] args) {	
	
int [] x = {1,2,2};
int [] y = {1,2,2,6,99,99,7};
int [] a = {1,1,6,7,2};
int [] b = {1,1,6,2};
int [] c = {1,2,2,6,99,99,7,3,4};

System.out.println(sum(x));
System.out.println(sum(y));
System.out.println(sum(a));
System.out.println(sum(b));
System.out.println(sum(c));

}


public static int sum(int[] arr){
	
int sum = 0;
boolean flag = false;

for (int i=0 ; i<arr.length ; i++) {
	
	if (flag) {
		
		if (arr[i] ==7) {
			
		flag = false;
	}
		
	}else if(arr[i] == 6) {
		
		flag = true;
		
	}else {
		
		sum = sum + arr[i];
	}
}

	return sum ;
	
	
	
}
}