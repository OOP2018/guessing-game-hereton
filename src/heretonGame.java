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

	/**
	 * Guess input number
	 * 
	 * @param number
	 *            is the guess number of secret number.
	 * @return true if guess number is secret number false otherwise.
	 */
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
		setMessage("You win !!");
		count++;
		return true;
	}

	/**
	 * Get maximum value.
	 * 
	 * @return maximum value.
	 */
	public int getUpperBound() {
		return this.upperBound;
	}

	/**
	 * describe range of guess number.
	 * 
	 * @return describe rage of guess number.
	 */
	public String toString() {
		return "Guess a secret number between 1 and " + getUpperBound();
	}

	/**
	 * Get guessed number.
	 * 
	 * @returns guessed number.
	 */
	public int getCount() {
		return this.count;
	}

}
