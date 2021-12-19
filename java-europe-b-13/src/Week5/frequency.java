package Week5;

public class frequency {

	public static void main(String[] args) {
	
		//System.out.println(frequency("abgdhjajnay",'a'));	
		
	
	}
	
	public static int frequency(String str, char each) {
		int count = 0;
		
		for (int i=0 ; i<str.length() ; i++) {
			
			if(str.charAt(i)== each) {
				count ++;
			}
			
		}
		
		return count;
		
	}
	

}
