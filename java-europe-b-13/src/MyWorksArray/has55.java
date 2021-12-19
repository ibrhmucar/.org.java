package MyWorksArray;

public class has55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int[] nums1 = {1, 5, 5, 1, 1};
	int[] nums2 = {1, 8, 5, 5, 0};
	int[] nums3 = {1, 5, 4, 1, 5};
	int[] nums4 = {1, 4, 4, 1, 99};
	
	System.out.println(five(nums1));
	System.out.println(five(nums2));
	System.out.println(five(nums3));
	System.out.println(five(nums4));
	
	
	}
	
	public static boolean five(int[] arr) {
	boolean flag = true;
	for(int i=0 ; i<arr.length-1 ; i++) {
		if(arr[i]==5 && arr[i+1]==5) {
			flag= true;
			break;
		}else if (arr[i]!=5){ 
			flag= false;
			
	}
			
	
	}	
	          return flag;
}
}
	
	
	
	
	
