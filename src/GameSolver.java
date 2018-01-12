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
		return getBound(game.getUpperBound(), game, game.getUpperBound() / 2);
	}

	public int getBound(int upperBond, NumberGame game, int current) {
		int temp = (upperBond - current) / 2;
		System.out.println(current);
		game.guess(current);
		System.out.println(game.getMessage());
		if (game.getMessage().toLowerCase().contains("small")) {
			System.out.println("temp: " + temp);
			System.out.println("upper" + upperBond);
			System.out.println("current " + current);
			return getBound(upperBond, game, current + temp);
		} else if (game.getMessage().toLowerCase().contains("large")) {
			System.out.println("temp: " + temp);
			System.out.println("upper" + upperBond);
			System.out.println("current " + current);
			return getBound(current, game, current - temp);
		}
		System.out.println("kuy");
		return current;
	}

}
