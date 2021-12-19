package MyWorksArray;
import java.util.ArrayList;
import java.util.Scanner;
public class combineAL {

	public static void main(String[] args) {
		
		
	ArrayList<Integer> a = new ArrayList<>();
	ArrayList<Integer> b = new ArrayList<>();
	
	a.add(3);       
	a.add(3);
	a.add(1);
	a.add(2);
	
	b.add(3);
	b.add(4);
	b.add(5);
	b.add(6);
	
	
	System.out.println(combineAL(a, b));
	
			
	}

	public static ArrayList<String> combineAL(ArrayList<Integer> wordlist1, ArrayList<Integer> wordlist2){
		
		
		
		wordlist1.addAll(wordlist2);
		
		ArrayList<Integer> newWord= new ArrayList<>();
		ArrayList<String> last = new ArrayList<>();
		
		newWord.addAll(wordlist1);
		
		for (int i=0 ; i<newWord.size() ; i++) {
			
			last.add(String.valueOf(newWord.get(i)));
		}
		
		
			
		return last;
		
		
		
		
		
		
	
	
	
	
	}
	
	
	
	
	
}
