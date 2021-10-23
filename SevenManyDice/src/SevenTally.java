
public class SevenTally {
		int diceCount;
	public SevenTally(int initDiceCount) {
		diceCount = initDiceCount;
	}
	public boolean experiment() {
		int[] results = new int[diceCount];
		for(int i = 0; i < results.length; i++) {
			results[i] = getRand();
		}
		for(int j = 0; j < results.length; j++) {
			for(int i = j+1; i < results.length; i++) {
				if(results[j]+results[i] == 7) {
					return true;
				}
			}	
		}
		return false;
	}
	private int getRand() {
		int r = (int)(Math.random()*6)+1;
		return r;
	}
}
