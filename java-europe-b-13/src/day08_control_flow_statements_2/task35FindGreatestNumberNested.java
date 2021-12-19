package day08_control_flow_statements_2;

public class task35FindGreatestNumberNested {

	public static void main(String[] args) {
		
	int n1=100;
	int n2=1000;
	int n3=100;

	
	if (n1>n2 && n1>n3) {
		System.out.println("n1 is a biggest number");
	
	}else if (n1==n2) {
		  if (n1>n3) {
		 System.out.println("n1 equals to n2 and bigger than n3");
		 
		  }else {
			  System.out.println("n1 equals to n2 but n3 is biggest number ");
		  }
		
	}else if (n1==n3){
		  if  (n1>n2){
			 System.out.println("n1 equals to n3 and bigger than n2");
			 
		  }else {
			  System.out.println("n1 equals to n3 but n2 is biggest number");
			  
		  } if (n2>n1 && n2>n3) {
			    System.out.println("n2 is a biggest number");
			    
		  }else if (n2==n1) {
			    if (n2>n3) {
			    System.out.println("n2 equals to n1 and biggest than n3");
			    
			}    
	        } else {
	        	System.out.println("n2 equals to n1 but n3 is biggest number");
	        }	
	        } else if (n3>n1 && n3>n2) {
	        	 System.out.println("n3 is a biggest number");
	        } 
	        	 if (n3==n1) {
	        	 if (n3>n2) {
	        		 System.out.println("n3 = n1 but biggest than n2");
	        		 
	        	 }else {
	        		 
	        		 System.out.println("n3 = n1 but n2 biggest number ");
	        		 
	        	 }
	        	 
	        	 }
}
}
