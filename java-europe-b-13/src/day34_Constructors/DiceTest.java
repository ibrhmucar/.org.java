package day34_Constructors;

public class DiceTest {

	public static void main(String[] args) {
	
	final int  SIX_SIDES = 6;
	Dice sixDice = new Dice(SIX_SIDES); //object
	rollDice(sixDice);
	
	
	
	}

	public static void rollDice(Dice six) { //Dice a is a parameter
		
	
		
	System.out.println("Rolling a  " + six.getSides()+ " sided dice");
	System.out.println("The dice value: " + six.getValue());
	
	
	
	
	}
	
	
	
	
}
