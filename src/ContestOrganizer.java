
public class ContestOrganizer {
	/** the number of rows of contestant */
	public static final int NUM_ROWS = 10;
	
	/** the number of columns of contestant */
	public static final int CONTESTANTS_PER_ROW = 10;
	
	/** the two-dimensional array of contestant */
	private Contestant[][] contestants; 
	
	/** Sorts arr in increasing order by score 
	 * Postcondition:
	 * - arr sorted in increasing order by score.
	 * - Location of each contestant correctly updated such that
	 * column number matches contestant's position in arr.
	 * @param arr the array to be sorted.*/
	public void sort(Contestant[] arr){
		/* code goes here */
	}
	
	/** Sorts each row of contestants into increasing order by score.
	 * Postcondition: Contestant with highest score in row[k] is
	 * 				  in the rightmost column of row[k], 0 <= k < NUM_ROWS */
	public void sortAllRows(){
		/* code goes here */ 
		for(int i=0;i<contestants.length;i++) {
			sort(contestants[i]);
		}
	}

	/** Returns name of contestant with highest score
	 * Precondition:
	 * - Contestants have not been sorted by score.
	 * - Top score is unique
	 * - Only one contestant has the highest score.
	 * @return name of contestant with highest score. */
	public String findWinnerName(){
		/* code goes here */
		sortAllRows();
		int high = contestants[0][contestants.length-1].getScore();
		int now;
		String winnername = contestants[0][contestants.length-1].getName();
		for(int i=0;i<contestants.length;i++) {
			Contestant c = contestants[i][contestants[0].length-1];
			if(c.getScore()>high) {
				high = c.getScore();
				winnername = c.getName();
			}
		}
		return winnername;
	}
}
