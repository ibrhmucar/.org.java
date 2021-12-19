package Week7;

import java.util.Arrays;

public class r02_charArray2 {

	public static void main(String[] args) {
		
		int [] alphabet = new int [26];
		
	//	alphabet[0] = alphabet[0]+1;
	//	alphabet[0] = alphabet[0]+1;
		
		
		
		String word = "listen";
		for (char each : word.toCharArray()) {
			alphabet[each-97] = alphabet[each-97]+1;
		}
		
		System.out.println(Arrays.toString(alphabet));
	
		String word2 = "fisten";
		for(char each : word2.toCharArray()) {
			alphabet[each-97] = alphabet[each-97]-1;
		}
		
		System.out.println(Arrays.toString(alphabet));
		
		
		int [] check = new int [26];
		System.out.println("Are my words anagram: " + Arrays.equals(alphabet, check));
		
		
	}

}
