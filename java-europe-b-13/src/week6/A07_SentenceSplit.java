package week6;

import java.util.Arrays;

public class A07_SentenceSplit {

	public static void main(String[] args) {
		
	String amazonResult = "1-48 of over 6,000 result for java";
	
	String [] resultArray = amazonResult.split(" ");
	System.out.println(Arrays.toString(resultArray));
	System.out.println(resultArray.length);

	System.out.println("How many result are there is my search " + resultArray[3]);
	System.out.println("First Element:  " + resultArray[0]);	
	System.out.println("second element: " + resultArray[1]);
	System.out.println("Number of ' ' in my statement : " + (resultArray.length-1));
	
	
	
	
	
	
	
	
	}

}
