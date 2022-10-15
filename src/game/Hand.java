package game;

import java.util.Stack;

public class Hand {
	
	public Stack<Card> cardsInHand = new Stack<>();
	
	public Hand(){
		Stack cardsInHand;
	}
	
	
	//returns card on top of the hand.
	public Card flipCard() {
		
		Card cardToReturn = cardsInHand.pop();
		
		return cardToReturn;
	}
	
	//draws the top card of the specified deck and adds to the hand
	public void drawToHand(Deck deck) {
		Card card = deck.draw();
		cardsInHand.push(card);
	}
	
	//returns true if the hand is empty
	public boolean isEmpty() {
		if(cardsInHand.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
}
