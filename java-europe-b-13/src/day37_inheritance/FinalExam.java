package day37_inheritance;

public class FinalExam extends GredeActicity{


	
	private int numQuestions;
	private double pointsEach;
	private int numMissed;
	
	
	public FinalExam(int numQuestions, int numMissed) {
		
		double numericScore;
		this.numQuestions= numQuestions;
		this.numMissed=numMissed;
		
		
		pointsEach=100/numQuestions;
		numericScore = 100 -(numMissed*pointsEach);
		
		
		setScore(numericScore);	
		
	}
	
	
	
	
}
