package uk.co.pped.policeapi.model;

import uk.co.pped.policeapi.utilities.RankTypes;

public class OfficerModel extends PersonModel {
	
	private RankTypes rank;
	
	private String collarNumber;
	
	private String warrentNumber;
	
	public OfficerModel() {
		super();
	}
	
	public void setRank(RankTypes rank) {
		this.rank = rank;
	}
	
	public RankTypes getRank() {
		return rank;
	}
	
	public String getCollarNumber() {
		return collarNumber;
	}

	public void setCollarNumber(String collarNumber) {
		this.collarNumber = collarNumber;
	}

	public String getWarrentNumber() {
		return warrentNumber;
	}

	public void setWarrentNumber(String warrentNumber) {
		this.warrentNumber = warrentNumber;
	}
	
	public boolean isRankHigher(OfficerModel officerToCompare) {
		
		return false;
	}
}