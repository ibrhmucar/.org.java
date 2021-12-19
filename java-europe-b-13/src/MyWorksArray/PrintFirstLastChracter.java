package MyWorksArray;

import java.util.Arrays;

public class PrintFirstLastChracter {
	
	public static void main(String[] args) {
		
	String[]  words = {"hello", "why", "bye", "apple", "note"};
	
	String[] newWords = new String[words.length];
	
	
	int a = 0;
	for (int i=0 ; i<words.length ; i++) {
		
		newWords[i] = words[a].charAt(0)+""+words[a].charAt(words[a].length()-1);
		a++;	
		
	}
	
	System.out.println(Arrays.toString(newWords));
	
	}
		
		
		
		
		
	}


