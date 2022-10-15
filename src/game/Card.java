package game;

/**
 * @author Bryce
 * Creates a card object with a raw value integer and a name for the card
 */
public class Card {
	
	int value;
	String name;
	
	
	//primary constructor
	public Card(int value, String name){
		this.value = value;
		this.name = name;
	}
	
	//default constructor
	public Card(Card card) {
		
	}


	public String getName() {
		return this.name;
	}	
	
	public int getValue() {
		return this.value;
	}
	
	//returns both name and value of the card as a string
	public String describe() {
		return this.name + " with a value of " + this.value;
	}
	
	
	//returns only name
	@Override
	public String toString() {
		return name;
	}
	
}
