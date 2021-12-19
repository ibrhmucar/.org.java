package Week8;

public class Credentials {
	
	
	private String userName="Spartam300";
	private String passWord="hectorTheTroyan";
	
	
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	
	public void setPassWord(String passWord) {
		
			
		boolean passwordSize;
		boolean uppercase = false;
		boolean lowercase = false;
		boolean specials = false;
		
		passwordSize= (passWord.length()>8)? true : false;
		
		for(char eacghletter: passWord.toCharArray()) {
		   if(Character.isUpperCase(eacghletter)) {
			   uppercase = true;
		   }if(Character.isLowerCase(eacghletter)) {
			   lowercase = true;
		   }if(!Character.isLetterOrDigit(eacghletter)) {
			   specials = true;
	      }
		}
		
		if(passwordSize==true&&uppercase==true&&lowercase==true&&specials==true) {
			    this.passWord=passWord;
		}else {
				this.passWord=null;
		}
	}
	
}

