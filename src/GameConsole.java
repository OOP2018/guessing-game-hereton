import java.util.Scanner;

/**
 * Play guessing game on the console.
 */
public class GameConsole {

	/** play the game. */
	public int play(NumberGame game) {
		Scanner console = new Scanner(System.in);
		int guess;
		boolean correct;

		// describe the game
		System.out.println(game.toString());

		do {
			System.out.println(game.getMessage());
			System.out.print("Your answer? ");
			guess = console.nextInt();
			correct = game.guess(guess);
		} while (!correct);
		console.close();
		return guess;
	}

}
