public class GameSolver {
	int ans;

	/**
	 * Play a NumberGame and return the solution. The NumberGame object must provide
	 * messages (getMessage) containing the phrase "too small" if a guess is too
	 * small and "too large" if a guess is too large, for efficient solution.
	 *
	 * @param game
	 *            is the NumberGame to solve
	 * @return correct number.
	 */
	public int play(NumberGame game) {
		return findSecret(game.getUpperBound(), game, game.getUpperBound() / 2);
	}

	
	/**
	 * find secret number using recursion
	 * @param upperBond game or maximum range number.
	 * @param game Hereton game.
	 * @param current current number that the game will guess.
	 * @return correct secret number.
	 */
	private int findSecret(int upperBond, NumberGame game, int current) {
		game.guess(current);
		if (game.getMessage().toLowerCase().contains("small")) {
			if ((upperBond - current) == 1) {
				game.guess(current + 1);
				return current + 1;
			} else
				return findSecret(upperBond, game, current + (upperBond - current) / 2);
		} else if (game.getMessage().toLowerCase().contains("large")) {
			return findSecret(current - 1, game, current / 2);
		}
		return current;
	}

}
