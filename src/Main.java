/**
 * A main class for the GuessingGame. It is responsible for creating objects,
 * connecting objects, and running the game UI.
 */
public class Main {

	public static void main(String[] args) {
		// upper limit for secret number in guessing game
		int upperBound = 20;
		NumberGame game = new heretonGame(upperBound);
		// GameConsole ui = new GameConsole();
		GameSolver solve = new GameSolver();
		int solution = solve.play(game);
		System.out.println("play() returned " + solution);
		System.out.println("You used " + game.getCount() + " ");
	}
}
