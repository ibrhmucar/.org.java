package Replit;

import java.util.ArrayList;
import java.util.Arrays;

public class removeEveryOthers {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>(Arrays.asList("hi","yo","sup","yolo","book"));
		
		
		System.out.println(removeEveryOther(list));
			
		
		
		
		
	}	
	public static ArrayList<String> removeEveryOther(ArrayList<String> words){
		
		ArrayList<String> list1 = new ArrayList<>();
		 
		 
			 for(int i=0; i<words.size() ; i++) {
				 if(i%2==1) {
					 list1.add(words.get(i));
				 }else if(i%2==0) {
					 continue;
				 }
			 }
		 

		 return list1;
}

}
