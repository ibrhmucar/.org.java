package Week7;

import java.util.Arrays;

public class ar03_isAnagram {

	public static void main(String[] args) {
	
	isAnagram("listen" , "silent");	
	System.out.println(isAnagram("listen", "silent"));
	System.out.println(isAnagram("ibrahim", "miharbi"));	
	System.out.println(isAnagram("ibraim", "miharbi"));	
	}
	
	
	public static boolean isAnagram(String wordOne, String wordTwo ) {
		
	boolean flag = false;
	if(wordOne.length()!=wordTwo.length()){
		return flag;
	}
	
	
	wordOne = wordOne.toLowerCase().replaceAll(" ", "");
	wordTwo = wordTwo.toLowerCase().replaceAll("" , "");
	
	char [] charArr1 = wordOne.toCharArray();
	char [] charArr2 = wordOne.toCharArray();
	
	Arrays.sort(charArr1);
	Arrays.sort(charArr2);
	
//	System.out.println(Arrays.toString(charArr1));
//	System.out.println(Arrays.toString(charArr2));
	
	if(Arrays.equals(charArr1, charArr2)) {
	 		flag = true;
	

	}

	     return flag;
}
}