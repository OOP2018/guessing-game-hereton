import java.util.Random;

/**
 * Game of guessing secret number.
 * 
 * @author ton
 *
 */
public class heretonGame extends NumberGame {

	private int upperBound;
	private int secret;
	private int count;

	public heretonGame(int upperBound) {
		this.upperBound = upperBound;
		this.secret = getRandomNumber(upperBound);
		setMessage("I'm thinking of a number between 1 and " + upperBound);
		System.out.println(secret);
	}

	/**
	 * Create a random number between 1 and limit.
	 * 
	 * @param limit
	 *            is the upper limit for random number
	 * @return a random number between 1 and limit (inclusive)
	 */
	private int getRandomNumber(int limit) {
		Random rand = new Random();
		return rand.nextInt(limit) + 1;
	}

	public boolean guess(int number) {
		if (number < this.secret) {
			setMessage("Your number is too small");
			count++;
			return false;
		}
		if (number > this.secret) {
			setMessage("Your number is too large");
			count++;
			return false;
		}
		setMessage("");
		count++;
		return true;
	}

	public int getUpperBound() {
		return this.upperBound;
	}

	public String toString() {
		return "Guess a secret number between 1 and " + getUpperBound();
	}

	public int getCount() {
		return this.count;
	}

}
