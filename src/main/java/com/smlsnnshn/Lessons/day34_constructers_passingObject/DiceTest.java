package com.smlsnnshn.Lessons.day34_constructers_passingObject;

public class DiceTest {

	public static void main(String[] args) {
		
		final int SIX_SIDES = 6;
		final int TWENTY_SIDES = 20;
		
		Dice sixDice = new Dice(SIX_SIDES);
		
		Dice twentyDice = new Dice(TWENTY_SIDES);
		
		rollDice(sixDice);
		
		rollDice(twentyDice);

	}
	
	public static void rollDice(Dice d) {
		
		System.out.println("rolling a " + d.getSides()+ " sided dice");
		
		System.out.println("The dice vlaue : " + d.getValue());
		
	}

}
 