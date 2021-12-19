package Replit;

import java.util.ArrayList;
import java.util.Arrays;

public class removeAll {

	public static void main(String[] args) {
	
		ArrayList<String> wordList = new ArrayList<String>(Arrays.asList("hi","hey","hi","yo"));
		
		System.out.println(removeAll(wordList, "hi"));
		
	}
	
	public static ArrayList<String> removeAll(ArrayList<String> wordList, String targetWord){
		ArrayList<String> wordList2 = new ArrayList<>();
		
		for(String a : wordList) {
			if(!(a.equals(targetWord))) {
			
				wordList2.add(a);
			}
			
		}
	
		return wordList2;
		
		
		
		
	}

}
