package day14_methods_Part2;

public class Lab1_StringTimes {

public static void main(String[] args) {
		
	/*Write a method that accepts a string and a non-negative number, 
	 * and prints a larger string that is number copies of the original String
    stringTimes("Hi", 2); = > HiHi
    stringTimes("Hi", 3); = > HiHiHi
    stringTimes("Hi", 1); = > Hi
    */
	

	
		
		stringTimes("Hi", 3);
		
	}
	
	public static void stringTimes(String string,int number) {
		
		String str = "";
		
		for(int i=0;i<number;i++) {
			
			str = str + string;   
			
		}
		System.out.println(str);
	}}