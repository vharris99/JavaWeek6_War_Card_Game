package week6FinalCodingProject;

public class Card {

	private int value; // Card values from 2-14, representing cards 2-Ace
	private String name; // Name of the card
	
	// Card constructor
	Card (int value, String name) {
		this.value = value;
		this.name = name;
	}
	
	// Getters & Setters
	public int getValue() {
		return value;
	}


	public void setValue(int value) {
		this.value = value;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	// Method to describe the card
	public void describe() {
		System.out.println(name);
	}
}