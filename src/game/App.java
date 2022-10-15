package game;

public class App {

	public static void main(String[] args) {
		
		System.out.println("Starting Game");
		playGame();
		
	}//end of main method

public static void playGame() {
		
	
		//create and shuffle deck
		Deck deck = new Deck();
		deck.shuffleDeck();
		
		//instantiate players
		Player player1 = new Player();
		Player player2 = new Player();
		
		//While the deck is not empty, draw cards to the players hand
		while(!deck.stackOfCards.isEmpty()) {
			player1.draw(deck);
			player2.draw(deck);
		}
		
		
		/*
		 * Play game
		 * while players have a card still in their hand, flip and compare cards
		 * card of higher value wins, and gives 1 point to player who won the round
		 */
		while(!player1.hand.isEmpty())  {
			Card card1 = player1.hand.flipCard();
			Card card2 = player2.hand.flipCard();
			
			if(card1.value > card2.value) {
				player1.increaseScore();
			} else if(card2.value > card1.value) {
				player2.increaseScore();
			}
		}
		
		
		//Score checking. If p1 score > p2, p1 wins, and visa versa
		if(player1.getScore() > player2.getScore()){
			System.out.println("Player 1 wins with a score of " + player1.getScore());
			System.out.println("Player 2 loses with a score of " + player2.getScore());
		} else if(player1.getScore() < player2.getScore()) {
			System.out.println("Player 1 loses with a score of " + player1.getScore());
			System.out.println("Player 2 wins with a score of " + player2.getScore());
		} else if(player1.getScore() == player2.getScore()) {
			System.out.println("It is a draw at " + player1.getScore() + " points");
		}
		
		
		
	}
}
