package day31_arrayList;

import java.util.ArrayList;

public class ArrayListExam {

	public static void main(String[] args) {
		

	ArrayList<String> languages = new ArrayList<>();
	
	languages.add("Java");
	languages.add("English");
	languages.add("Arabic");
	languages.add("Turkish");
	
	System.out.println(languages.size());
	System.out.println(languages.toString());
	
	languages.add("Russia");
	System.out.println(languages.toString());
	languages.set(2, "Norvech");
	System.out.println(languages.toString());
	languages.remove(0);
	System.out.println(languages.toString());
	System.out.println(languages.size());
	System.out.println(languages.get(1));
	
		
	}

}
