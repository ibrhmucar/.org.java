package MyWorksArray;

import java.util.Arrays;

public class CopyCertainValues {

	public static void main(String[] args) {
		
	String [] arr = {"aa", "be", "lol", "lel", "oreo"};
	
	int count = 0 ;
	for (int i=0 ; i<arr.length ; i++) {
		
		if(arr[i].contains("e")){
		count ++;	
		}else {
			continue;
		}
	}
	
	String [] fewValues = new String[count];
	
	int x =0;
	
	for(int i=0 ; i<arr.length ; i++) {
		
		if(arr[i].contains("e")){
		fewValues[x] =  arr [i];
		x++;
			
		}else {
		continue;	
		}
	}
	
	 System.out.println(Arrays.toString(fewValues));
	
	
	
	

	}

}
