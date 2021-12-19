package day29_arrays_part5;

public class Question20 {

	public static void main(String[] args) {
	
	int [] x = {1,2,2,1};	
	int [] y = {1,2,1,2};
	int [] a = {2,1,2};
	int [] b = {2,2,1,2};
	System.out.println(isTwo(x));
	System.out.println(isTwo(y));
	System.out.println(isTwo(a));
	System.out.println(isTwo(b));
		
	}

	public static boolean isTwo(int [] arr) {
	boolean flag = true;
	
	for (int i=0 ; i<arr.length-1 ; i++) {
		if(arr[i]==2 && arr[i+1]==2) {
			flag = true;
			break;
		}else {
			flag = false;
		
		}}
			return flag;
		}}