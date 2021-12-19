package day12_controlFlowStatements_6;

public class labelStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=0;
		
		outer: 
			
			do {
				i=8;
				
				inner:
					
					while(true) {
						System.out.println(i--);
						
						if (i==4) {
							 break outer;
						
						}
						 
					}
			}while (true);
			
		
		
		
			}
		
		
	}

