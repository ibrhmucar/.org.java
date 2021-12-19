package day27_arrays_part4;

import java.util.Arrays;

public class ArrayClass {

	public static void main(String[] args) {
	
	
	//toString()	
	int [] nums = {43,12,4,1,3,5};
	System.out.println(Arrays.toString(nums));
		
		
	//equals()
	
	int [] nums1 = {4,5,6,10,100};
	int [] nums2 = {4,5,6,10,100};
	
	System.out.println(Arrays.equals(nums1, nums2));
	
	//sort()
	
	int [] nums3 = {43,12,4,1,3,5};
	
	Arrays.sort(nums3);
	System.out.println(Arrays.toString(nums3));
	
	
	
	String[] languages = {"Zulu", "Spanish" , "Italian" , "English" , "Polish" , "Arabic"};
	Arrays.sort(languages);
	System.out.println(Arrays.toString(languages));
	
	
	//binarySearch()
	int [] numX = {4,6,7,10,55};
	System.out.println(Arrays.binarySearch(numX, 7)); // index number verir.
	System.out.println(Arrays.binarySearch(numX, 15));
	
	
	//copyOf()
	
	double [] d1 = {2.3,4.5,12.4};
	double [] d2 = d1;
	System.out.println(Arrays.toString(d2));
	
	d1[0] = 100.3;
	System.out.println(Arrays.toString(d2));
	System.out.println(Arrays.toString(d1));
	
	double [] d3 = Arrays.copyOf(d2,5);
	System.out.println(Arrays.toString(d3));
	
	
	
	
	}

}
