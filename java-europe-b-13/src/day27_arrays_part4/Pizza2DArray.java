package day27_arrays_part4;

import java.util.Arrays;

public class Pizza2DArray {

	public static void main(String[] args) {
		
		
		String [] [] pizzas = { 
				
				{"pinneapple", "pepperoni"},
				{"anchovies", "mushroom", "olives"},
				{"4 cheese"},
				{"chicken","tomatoes","onioons"},
				{"green peppers", "zuccini", "brocoli", "spinach" , "shrimp"}
						
		};
		
		      System.out.println(Arrays.toString(pizzas[0])); //print etmek istediğimiz satırı seçebildiğimiz komut.
		      
		      
		      for (int i=0 ; i<pizzas[0].length ; i++) {
		    	  System.out.println(pizzas[0][i]);
		      }
		      
		      System.out.println("===============================");
		      for (int i=0 ; i<pizzas.length ; i++) {
		    	  System.out.println(Arrays.toString(pizzas[i]));
		     
		      
	         
		          for (String[] pizza : pizzas) {
		    	  //System.out.println(pizza[0]);
		    	  System.out.print(pizza.length + " - ");
		    	  System.out.println(Arrays.toString(pizza));
		      }
		
		       for (String value : pizzas [3]) {
		    	   System.out.println(value);
		       }
		
		
		
		
		
		
		
		
		     for (int k=0 ; i<pizzas.length ; i++) {
			 for (int j=0 ; j<pizzas[k].length ; j++) {
				 
				  System.out.print(pizzas[k][j]+ " ");
			 }
			 	  System.out.println();
		 } 
		}}}
