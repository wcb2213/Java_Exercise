package Java_Exercise;

import java.util.Scanner;

/**
 * A class for assignment #4
 */
public class Exercise4_Guess {
	
	// The number to guess will be taken is the range [1,MAX]
		private static final int MAX = 100;

		/**
		 * The main program
		 */
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			int total_guesses = 0;
			int total_games = 0;
			int best_game = 0; // Integer.MAX_VALUE

			opening();

			do {
				System.out.print("\n\n");
				int guesses = play(scan);
				total_games++;
				total_guesses += guesses;
				if ( best_game == 0 || guesses < best_game )
					best_game = guesses;
			} while ( moreGame(scan) );

			closing(total_guesses,total_games,best_game);
		}

		// Prints out a welcome message
		private static void opening() {
			System.out.print("Welcome to the Guessing Game program");
		}
		
		// Play one game and returns the number of guesses
		// of the player.
		// 'scan' is a keyboard scanner
		private static int play(Scanner scan) {
			int secret = (int) (Math.random() * MAX) + 1;
			int guesses = 0;
			int guess;
			System.out.println("I'm thinking of a number between 1 and " + MAX + "...");

			do {
				System.out.print("Your guess? ");
				guess = scan.nextInt();
				guesses++;
				if ( guess < secret )
					System.out.println("It's higher.");
				if ( guess > secret )
					System.out.println("It's lower.");
			} while ( guess != secret );

			System.out.println("\nYou got it right in " + guesses + " guess(es)");
			return guesses;
		}

		// Returns true if the player wants to play more,
		// false otherwise.
		// 'scan' is a keyboard scanner
		private static boolean moreGame(Scanner scan) {
			while ( true ) {
				System.out.print("Do you want to play again? ");
				String answer = scan.next();
				if ( answer.length() != 0 ) {
					char first = answer.charAt(0);
					if ( first == 'y' || first == 'Y' )
						return true;
					if ( first == 'n' || first == 'N' )
						return false;
				}
			}
		}

		// Prints out some closing statistics.
		// 'total_guesses' is the total number of guesses for all games
		// 'total_games' is the total number of games played
		// 'best_game' is the lowest number of guesses for one game
		private static void closing(int total_guesses, int total_games, int best_game) {
			System.out.println();
			System.out.println("Overall results:");
			System.out.printf("%18s = %d\n","total games",total_games);
			System.out.printf("%18s = %d\n","total guesses",total_guesses);
			System.out.printf("%18s = %.1f\n","guesses/game",(double) total_guesses/total_games);
			System.out.printf("%18s = %d\n","best game",best_game);
		}
}
