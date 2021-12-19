package Week7;

import java.util.ArrayList;
import java.util.Arrays;

public class R10_ArrayListMethods {

	public static void main(String[] args) {
		
		ArrayList<String> codes = new ArrayList<>(Arrays.asList("OK","Created","Forbidden","OK","Unautohorized","Created"));
		
		System.out.println(removeDuplicate(codes));
		
		
		
	}

	public static  ArrayList<String> removeDuplicate (ArrayList<String> list){ // String için method
		
		ArrayList<String> nonDuplicat = new ArrayList<>();
		
		for(String each : list) {
			if(!nonDuplicat.contains(each)) {
				nonDuplicat.add(each);
			}
		}
	
		return nonDuplicat;
	}
	
}
