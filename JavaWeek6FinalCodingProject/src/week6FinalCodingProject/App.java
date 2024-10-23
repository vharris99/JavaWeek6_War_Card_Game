package week6FinalCodingProject;


public class App {

	public static void main(String[] args) {
	
		Deck deck = new Deck(); // Instantiation of Deck
		System.out.println("Standard Deck of 52 Cards");
		System.out.println();
		deck.describe();
		
		System.out.println();
		
		Player player1 = new Player("Player 1"); // Instantiation of Player 1
		player1.describe();
		
		System.out.println();
		
		Player player2 = new Player("Player 2"); // Instantiation of Player 2
		player2.describe();
		
		deck.shuffle(); // Shuffles the Deck
		
		System.out.println();
		
		// b. Using a traditional for loop, iterate 52 times calling the Draw method on the other 
		//	  player each iteration using the Deck you instantiated.
		
		// For loop, iterating 52 times
		for (int i = 0; i < 52; i++) {
			// Alternates drawing between both players
			if (i % 2 == 0) {
				player1.draw(deck);
			} else {
				player2.draw(deck);
			}
		}
		
		//c.      Using a traditional for loop, iterate 26 times and call the flip method for each player.
		
		// For loop, iterating 26 times (26 Rounds)
		for (int i = 0; i < 26; i++) {
			int roundNumber = i + 1;
			System.out.println("Round " + roundNumber + ":");
			//Each player flips a card
			Card p1Card = player1.flip();
			Card p2Card = player2.flip();
	    //Print each player's flipped card
	    if (p1Card != null) {
	    	System.out.println(player1.getPlayerName() + " flipped: ");
	    	p1Card.describe();
	   //} else {
	    	 //System.out.println(player1.getPlayerName() + " has no more cards to flip.");
		}
	    
	    if (p2Card != null) {
	    	System.out.println(player2.getPlayerName() + " flipped: ");
	    	p2Card.describe();
	    //} else {
	    	//System.out.println(player2.getPlayerName() + " has no more cards to flip.");
	    }
		// Compare value of each player's flipped card
	    // Call incrementScore() method on the player whose card has higher value
	    // Print a message to say which player received a point
		// If values are equal, then it is a tie and a message will print saying that no point was awarded
	    if (p1Card.getValue() > p2Card.getValue()) {
            player1.incrementScore();
            System.out.println(player1.getPlayerName() + " wins the round!");
        } else if (p2Card.getValue() > p1Card.getValue()) {
            player2.incrementScore();
            System.out.println(player2.getPlayerName() + " wins the round!");
        } else {
            System.out.println("It's a tie! No point awarded this round.");
        }
		// After the game, compare the final score from each player
	    System.out.println("Score: " + player1.getPlayerName() + " = " + player1.getScore() + ", " + player2.getPlayerName() + " = " + player2.getScore());
        System.out.println("---------------------------------------------------");
    }
		// Prints the final score of each player & either “Player 1”, “Player 2”, or “Draw” as outcome
		System.out.println("Final Score:");
        System.out.println(player1.getPlayerName() + ": " + player1.getScore());
        System.out.println(player2.getPlayerName() + ": " + player2.getScore());

        if (player1.getScore() > player2.getScore()) {
            System.out.println(player1.getPlayerName() + " wins the game!");
        } else if (player2.getScore() > player1.getScore()) {
            System.out.println(player2.getPlayerName() + " wins the game!");
        } else {
            System.out.println("It's a draw!");
		}	
	}	
}