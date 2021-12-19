package week6;

import java.util.Arrays;
import java.util.Scanner;

public class Second {

	public static void main(String[] args) {
		
		Scanner scan = 	new Scanner(System.in);
		System.out.println("Enter your status code please");
		System.out.println(responseConverter(scan.nextInt()));		

		
		
	}

	public static String responseConverter(int request) {
		
		int [] statusCode = {200, 201, 204, 400, 401, 403, 404, 500};
		String [] responseTypse = {"OK", "Created", "No Content" , "Bad Request" , "Unauthorized" ,"Forbidden", "Not Found" ,"Internal Server Error"};
		
		int num = Arrays.binarySearch(statusCode, request);
		
		return responseTypse[num];
		
		//if(num>0 && num<statusCode.length) {
		
		}
		
		
		
	}
	
	
	
//}
