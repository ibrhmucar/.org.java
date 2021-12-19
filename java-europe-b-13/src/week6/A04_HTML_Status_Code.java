package week6;
import java.util.Scanner;


public class A04_HTML_Status_Code {

	public static void main(String[] args) {
		
	Scanner scan = 	new Scanner(System.in);
	System.out.println("Enter your status code please");
	System.out.println(responConverter(scan.nextInt()));		
	
	
		

	}
	
		public static String responConverter(int request) {
			
			String response = null;
			
			int [] statusCode = {200, 201, 204, 400, 401, 403, 404, 500};
			String [] responseTypse = {"OK", "Created", "No Content" , "Bad Request" , "Unauthorized" ,"Forbidden", "Not Found" ,"Internal Server Error"};
			
			int j=0;
			
			for (int code : statusCode) {
				
				if (code != request) {
					j++;
				}else {
					break;
				}
			}
			
			
			
			
			
			
			return response = responseTypse[j] ;
		}
	

}
