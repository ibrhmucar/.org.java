package MyWorksArray;

public class CountLetterInArray {

	public static void main(String[] args) {
		
		int [] number = {2,3,4};
		String number2 = "";

		for (int i=0 ; i< number.length ; i++){
			number2+= number[i]+", ";
		}

		System.out.println(number2.substring(0,number2.length()-2));
		
	}

}
