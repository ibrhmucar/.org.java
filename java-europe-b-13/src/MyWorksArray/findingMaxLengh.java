package MyWorksArray;

public class findingMaxLengh {

	public static void main(String[] args) {
		
	String [] words = {"aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"};
	int b = 0;
	int count = 0;		
	int max = 0;
	for (int i=0 ; i<words.length ; i++) {
		count = 0;	
		for(int j=0 ; j<words[i].length() ; j++) {
		count++;	
		
		}
		if(max<count) {
		max=count;
		b = i;
			
		}
		
		
	}
     
	    System.out.println(words[b]);
	
	}
	
	

}
