package day23_stringManipulatinLab_random;

public class Mentor_Question {

	public static void main(String[] args) {
	
		String a = "aabbsslssffffffjka";
        String b = "";
                
        for(int i=0 ; i<a.length() ; i++) {
            
            if (!(b.contains(""+a.charAt(i)))) {
                
            	b += a.charAt(i);
            	
            } 
        }
        System.out.println("The last version of the String is \"" + b + "\"" );

    }
}
		
		
		
	
	
	
	
	
	
	
	
	
	
