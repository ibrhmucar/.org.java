package day15_methods_Part3;

public class task70_HighScore {

	public static void main(String[] args) {
		
		int position = calculateHighScorePostion(50);
		displayHighscorePositon("Mike", calculateHighScorePostion(1500));	
		displayHighscorePositon("Mike", calculateHighScorePostion(900));
		displayHighscorePositon("Mike", calculateHighScorePostion(450));
		displayHighscorePositon("Mike", position);
		
	}
	
	public static void displayHighscorePositon(String name, int position) {
		
		System.out.println(name + " and his position is " + position);
		
		
	}
	
	public static int calculateHighScorePostion(int playerScore) {
		
		if (playerScore>=1000) {
			 return 1;
			}else if (playerScore>=500 && playerScore<1000) {
			 return 2;	
			}else if (playerScore>=100 && playerScore<500) {
			 return 3;	
			}else {
			 return 4;	
			}
		
		
		
	}
	
	
	

}
