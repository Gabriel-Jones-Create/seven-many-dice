
public class SevenTally {
	int diceCount; // creates diceCount integer variable

	/**
	 * Constructs SevenTally object based on Dice Count
	 * 
	 * @param initDiceCount number of dice used
	 */
	public SevenTally(int initDiceCount) {
		// sets input to the diceCount variable
		diceCount = initDiceCount;
	}

	/**
	 * Returns boolean value based on whether or not any two of the dice add up to 7
	 * 
	 * @return <code>true</code> if there is at least one combination that adds up
	 *         to 7; <code>false</code> otherwise
	 */
	public boolean experiment() {
		// creates int array with length of the dice count
		int[] results = new int[diceCount];
		// for the entirety of the results array, a random number is set to every index
		for (int i = 0; i < results.length; i++) {
			results[i] = getRand();
		}
		// for every number value in the results array, the inside for loop is run
		for (int j = 0; j < results.length; j++) {
			// for every value after the index of the current iteration of the outside for
			// loop, if the sum of both numbers is 7, then it returns true
			for (int i = j + 1; i < results.length; i++) {
				if (results[j] + results[i] == 7) {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * Returns random number between 1 and 6
	 * 
	 * @return random number between 1 and 6
	 */
	private int getRand() {
		// creates integer that generates a random number between 1 and 6
		int r = (int) (Math.random() * 6) + 1;
		return r;
	}
}
