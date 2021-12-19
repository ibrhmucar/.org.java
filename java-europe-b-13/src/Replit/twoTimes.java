package Replit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
public class twoTimes {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,5,3,7));
			
		System.out.println(twoTimes(list));
		System.out.println(2%2);

	}
	
	public static ArrayList<Integer> twoTimes(ArrayList<Integer> r){

		ArrayList<Integer> last = new ArrayList<>(8);
		ArrayList<Integer> last1= r;

		for(int i=0 ; i<r.size() ; i++){
		  last.add(r.get(i));
		  last.add(r.get(i));

		}
		return last;
	}
}
