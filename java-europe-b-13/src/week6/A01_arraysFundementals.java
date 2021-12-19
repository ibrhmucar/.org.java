package week6;

public class A01_arraysFundementals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int [] statusCode = {200,201,204,400,401,403,404,500};
	
	System.out.println(statusCode.length);
	
	
	String [] responseTypse = {"OK", "Created", "No Content" , "Bad Request" , "Unauthorized" ,"Forbidden", "Not Found" ,"Internal Server Error"};
	
	for (int  i=0 ; i<statusCode.length ; i++ ) {
		System.out.println(statusCode[i] + " code is : " + responseTypse[i]);
	}
	
	
	for (int  a :  statusCode) {
		
		System.out.print(a+", ");
		
	}
	
	    System.out.println();
	    
	    
	for (String response : responseTypse) {
		System.out.print(response+", ");
	}
	int j=0; 
	for (String reponse2 : responseTypse) {
		System.out.println(statusCode[j]+ " Statuscode " + reponse2);
		j++;
	}
	
	
	
	
	}

}
