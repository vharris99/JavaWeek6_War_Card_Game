package week6FinalCodingProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	// Creates a list of each card
	List<Card> cards = new ArrayList<Card>();
	
	// Creates a standard deck of 52 cards
	Deck() {
		String[] names = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight",
		  		  		  "Nine", "Ten", "Jack", "King", "Queen", "Ace"};
		
		String[] suits = {"Clubs", "Hearts", "Diamonds", "Spades"};
		
		for (String suit : suits) {
			int value = 2;
			for (String name : names) {
				Card card = new Card(value, suit);
				card.setName(name + " of " + suit);
				card.setValue(value);
				this.cards.add(card);
				value++;
			}
		}
	}
	// Getters & Setters
	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}
	// Describes each card in the list
	public void describe() {
		for (Card card : this.cards) {
			card.describe();
		}
	}
	// Randomizes card order
	public void shuffle() {
		Collections.shuffle(this.cards);
	}
	// Removes and returns top card of deck
	public Card draw() {
		Card card = this.cards.remove(0);
		return card;
	}
}