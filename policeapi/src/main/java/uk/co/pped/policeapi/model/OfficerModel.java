package uk.co.pped.policeapi.model;

import uk.co.pped.policeapi.utilities.RankTypes;

public class OfficerModel extends PersonModel  {
	
	private RankTypes rank;
	
	private String collarNumber;
	
	private String warrentNumber;
		
	// TODO: Something to identify the force they are a member of
	// TODO: Something to identify the division they work on
	// TODO: Something to identify the subdivision they work on
	
	public OfficerModel() {
		super();
	}
	
	/** Setter for setting the Rank of the Officer
	 * @param rank
	 */
	public void setRank(RankTypes rank) {
		this.rank = rank;
	}
	
	/** Getter for getting the Rank of the Officer, if no 
	 * Rank has been set then UNKNOWN is returned and not null
	 * 
	 * @return the Rank or UNKNOWN
	 */
	public RankTypes getRank() {
		if (rank == null) {
			return RankTypes.UNKNOWN;
		}
		return rank;
	}
	
	/** Getter for Getting the Collar Number of the Officer, also
	 * known as Officers PIN
	 * @return collarNumber/PIN
	 */
	public String getCollarNumber() {
		return collarNumber;
	}

	/** Setter for Setting the Officers Collar Number/PIN.
	 * @param collarNumber
	 */
	public void setCollarNumber(String collarNumber) {
		this.collarNumber = collarNumber;
	}

	/** Getter for getting the Officers Warrent Card Number. 
	 * @return warrentNumber
	 */
	public String getWarrentNumber() {
		return warrentNumber;
	}

	/** Setter for setting the Warrent Card Number.
	 * @param warrentNumber
	 */
	public void setWarrentNumber(String warrentNumber) {
		this.warrentNumber = warrentNumber;
	}
	
	/** Convenience method for checking whether this officers rank is higher then
	 * the officers rank that is passed in.
	 * 
	 * @param officerToCompare - Officer to compare the rank too.
	 * @return true if this officers rank is higher then the comparable one.
	 */
	public boolean isRankHigher(OfficerModel officerToCompare) {
		
		if (officerToCompare != null) {
			RankTypes currentOfficersRank = this.getRank();
			RankTypes officerToCompareRank = officerToCompare.getRank();
			
			if (currentOfficersRank.getRankGrade() <= officerToCompareRank.getRankGrade()) {
				return false;
			}
		}
		return true;
	}
}