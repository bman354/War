package game;

public class Player {
	Hand hand = new Hand();
	int score;

	public Player() {
		this.hand = hand;
		this.score = 0;
	}

	// flips card from the top of the players hand
	public Card flip() {
		return hand.flipCard();
	}

	public void increaseScore() {
		score++;
	}

	public int getScore() {
		return score;
	}

	// Player draws a card from the specified deck and adds it to the top of their
	// hand
	public void draw(Deck deck) {
		hand.drawToHand(deck);
	}
}
