package Replit;

public class timeConversion {

	public static void main(String[] args) {
		

		
	//timeConversion("12:00:00PM");	
	
	String s = "03:45:00PM";
	
	
	int hour = Integer.parseInt(s.substring(0,s.indexOf(":")));
    hour +=12;
    String newTime = hour + s.substring(s.indexOf(":")).replace("PM","");
    System.out.println(newTime);
	System.out.println(hour);
	System.out.println(s.substring(s.indexOf(":")));
	
		
	
		
	}
	public static void timeConversion(String s) {
	    /*
			 * Write your code here.
			 */
			 
	    if(s.equals("12:00:00AM")){
	      System.out.println("00:00:00");
	    }else if(s.equals("12:00:00PM")){
	      System.out.println("12:00:00");
	    }else if(s.endsWith("AM")){

	      int hour = Integer.parseInt(s.substring(0,s.indexOf(":")));
	      s=s.replace("AM", "");
	      if(hour==12){
	        s= "00" + s.substring(2);
	      }
	      System.out.println(s);


	    } else if(s.endsWith("PM")){

	      int hour = Integer.parseInt(s.substring(0,s.indexOf(":")));
	        hour +=12;
	      String newTime = hour + s.substring(s.indexOf(":")).replace("PM","");
	      System.out.println(newTime);

	    }


	    
	    




	  }
	}