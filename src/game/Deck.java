package game;

import java.util.Collections;
import java.util.Stack;

public class Deck {

	Stack<Card> stackOfCards = new Stack<>();

	public Deck() {
		Stack stackOfCards;

		fillDeck();
		System.out.println("Deck filled");
	}

	public void fillDeck() {

		int cardValue = 2;
		int suitCount = 0;
		String newCardName = "";
		// suitCount 0: Diamonds 1: Hearts 2: Spades 3: Clubs
		// Card creation, suitCount dictates type of suit, cardValue references current
		// card being created

		while (cardValue < 15) {

			switch (cardValue) {
			case 11:
				newCardName += "Jack of ";
				break;
			case 12:
				newCardName += "Queen of ";
				break;
			case 13:
				newCardName += "King of ";
				break;
			case 14:
				newCardName += "Ace of ";
				break;
			default:
				newCardName += cardValue + " of ";
				break;
			}

			switch (suitCount) {
			case 0:
				newCardName += "Diamonds";
				break;
			case 1:
				newCardName += "Hearts";
				break;
			case 2:
				newCardName += "Spades";
				break;
			case 3:
				newCardName += "Clubs";
				break;
			}

			Card card = new Card(cardValue, newCardName);
			this.stackOfCards.add(card);

			// System.out.println(newCardName + " " + cardValue);

			newCardName = "";

			if (suitCount >= 3) {
				suitCount = 0;
				cardValue++;
			} else {

				suitCount++;

			}
		}
	} // end of fillDeck();
	
	
	//returns card name at index
	public String getCardName(int index) {
		return this.stackOfCards.get(index).getName();
	}
	
	
	//returns card object at index
	public Card getCard(int index) {
		return this.stackOfCards.get(index);
	}
	
	
	//randomizes posion of all cards on the stack
	public void shuffleDeck() {
		Collections.shuffle(stackOfCards);
		System.out.println("Deck Shuffled");
	}
	
	
	//draws the top card off the deck
	public Card draw() {
		Card returnCard;
		returnCard = stackOfCards.pop();
		return returnCard;

	}
	
	
	//returns true if deck stack is empty
	public boolean isEmpty() {
		if (stackOfCards.isEmpty()) {
			return false;
		} else {
			return true;
		}
	}
}
