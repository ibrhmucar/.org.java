package Week7;

import java.util.Arrays;

public class r01charArray {

	public static void main(String[] args) {
		
		char[] letters = {'l','i','s','t','e','n'};
		
		
		for (char each : letters) {
			System.out.print(each+ " ");
		}
		
		System.out.println();
		
		
		String word = new String (letters);
		System.out.println(word);
		
		String word2 = "silent";
		char [] letter2 = word2.toCharArray();
		System.out.println(Arrays.toString(letter2));
		
		
		for(char a :  word2.toCharArray()) {
			System.out.print(a+" ");
			System.out.println();
		}
		
		

	}

}
