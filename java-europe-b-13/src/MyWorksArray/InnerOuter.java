package MyWorksArray;

import java.util.Arrays;

public class InnerOuter {

	public static void main(String[] args) {
		
	int [] outer = {1,2,4,6};
	int [] inner = {1,2};
	
    int count = 0;
	
    for (int i=0 ; i<outer.length ; i++) {
		for(int j=0; j<inner.length ; j++) {
			if(outer[i]==inner[j]) {
			count ++;
		}else {
			continue;
		}
		}}
			if(count==2) {
			System.out.println("true");	
		   }else {
			System.out.println("false");  
		   }
}
}