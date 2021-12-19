package MyWorksArray;

public class PrintShortes {

	public static void main(String[] args) {
		String [] words = {"grape", "bread", "orange", "ok", "ultraviolet", "port"};
		
		int b = 0;
		int count = 0;		
		int min = words[0].length();
		for (int i=0 ; i<words.length ; i++) {
			count = 0;	
			for(int j=0 ; j<words[i].length() ; j++) {
			count++;	
			
			}
			if(min>count) {
			min=count;
			b = i;
				
			}
			
			
		}
	     
		    System.out.println(words[b]);
		    System.out.println(b);
		
		}

	}


