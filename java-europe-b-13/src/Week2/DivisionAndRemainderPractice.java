package Week2;

import java.util.Scanner; 

public class DivisionAndRemainderPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// converted to xx hours xx min xx sec
		
		// 1 min is 60 sec, 1 hour is 3600 sec
		
		int inputSeconds = 3910;
		int minutes, hours;
		int seconds = inputSeconds%60;
		
		minutes = inputSeconds/60%60;
		hours =inputSeconds/3600;
		
		
		System.out.println(hours);
		System.out.println(minutes);
		System.out.println(seconds);
		
	}

}
