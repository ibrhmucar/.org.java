package day19_stringManipulation_part1;

public class Task_76_Print_Each_Chracter {

	public static void main(String[] args) {
	
		
		String str = "Cybertek School" ;
		
		int num = str.length();
		
		
		for (int i=0 ; i<num ; i++) {
			
			if (i<num-1) {
			System.out.print(str.charAt(i)+ ", ");
			
		}else if(i==num-1){
			System.out.println(str.charAt(i));
		}
		
		
		
		
		
		
		
		
		
		}		
		
			}

}
