package week6FinalCodingProject;

import java.util.ArrayList;
import java.util.Random;

public class Player {

	private static Random random = new Random();

	private ArrayList<Card> hand = new ArrayList<Card>(); // Player's Hand - list of Card
	private int score; // Player's Score - current score
	private String playerName; // Player's Name - name of player
	
	//Constructor - New players score = zero
	public Player(String playerName) {
		this.playerName = playerName;
		score = setScore(0);
	}
	// Getters & Setters
	public ArrayList<Card> getHand() {
		return hand;
	}
	
	public int getScore() {
		return score;
	}

	public int setScore(int score) {
		return this.score = score;
	}

	public String getPlayerName() {
		return this.playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	// Prints player info & describes each card in Hand list
	public void describe() {
		System.out.println(String.format("Hello my name is %s . My score is %d." , getPlayerName(), getScore()));
		System.out.println("Card in hand:\r\n");
		
		if (hand.isEmpty()) {
			System.out.println("None");
		} else { 
			for (Card card : hand) {
				card.describe();
			}
		}
		// end of describe method
	}
	// Will remove and return the top card of the player's hand
	public Card flip() {
		    
		    Card flippedCard = new Card(score, playerName);
		    
		    if (hand.size() == 1) {
		      flippedCard = hand.remove(0);
		    } else if (hand.size() > 1) {    
		    flippedCard = hand.remove(random.nextInt(hand.size()));
		    }
		    return flippedCard;
		    // end of flip method
	}
	// Draws card from deck, adding returned card to Hand
	public void draw(Deck deck) {
		hand.add(deck.draw());
	}
	// Adds 1 to the player's score
	public void incrementScore() {
		this.score +=1;
	}	
}