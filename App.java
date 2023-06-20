package week06_Java_FinalProject;



public class App {

	 public static void main(String[] args) {
	        // 1) Instantiate a Deck and two Players

		
	       
		 	Deck deck = new Deck();
	        Player player1 = new Player("Lindy");
	        Player player2 = new Player("Zack");

	        // 2) Call the shuffle method on the deck.
	        deck.shuffle();

	        //3)Using a traditional for loop,
	        // iterate 52 times calling the Draw method on the other player
	        // each iteration using the Deck you instantiated.

	        for(int i = 0; i<52;i++){
	            if (i % 2 == 0){
	             player1.draw(deck);
	           
	            }
	            else {
	                player2.draw(deck);
	            }
	        }

	        // 4)	Using a traditional for loop,
	        // iterate 26 times and call the flip method for each player.

	        for(int i = 0; i<26 ; i++ ){

	            //5)	Compare the value of each card returned by the two player’s flip methods.
	            // Call the incrementScore method on the player whose card has the higher value.
	            Card card1 = player1.flip();
	            Card card2 = player2.flip();
	            if (card1.getValue()> card2.getValue()){
	                player1.incrementScore();
	                //this gives a value each time the player1 wins
	              //and shows the game progression 
	                System.out.println( "Lindy Wins the Round!");
	                System.out.println(player1.getName() + " has a score of " + player1.getScore() +
	            	        " and " + player2.getName() + " has a score of " + player2.getScore());
	                
	            }
	            else{
	                player2.incrementScore();
	              //this gives a value each time the player2 wins
	               //and shows the game progression  
	                System.out.println("Zack Wins the Round!");
	                System.out.println(player1.getName() + " has a score of " + player1.getScore() +
	            	        " and " + player2.getName() + " has a score of " + player2.getScore());
	                
	            }
	        }

	        //6)	After the loop, compare the final score from each player.
	        System.out.println(player1.getName() + " has a score of " + player1.getScore() +
	        " and " + player2.getName() + " has a score of " + player2.getScore());

	        //7)	Print the final score of each player and either “Player 1”, “Player 2”,
	        // or “Draw” depending on which score is higher or if they are both the same.

	        if (player1.getScore()>player2.getScore()){
	            System.out.println(player1.getName() + " is the final winner.");
	        }
	        else if (player1.getScore()<player2.getScore()){
	            System.out.println(player2.getName() + " is the final winner.");
	        }
	        else if (player1.getScore()==player2.getScore()){
	            System.out.println("It's a draw!!");
	        }
	 

	    }


	
	}