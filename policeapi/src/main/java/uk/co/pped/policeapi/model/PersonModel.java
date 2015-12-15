package uk.co.pped.policeapi.model;

import uk.co.pped.policeapi.utilities.RankTypes;

public class PersonModel extends BaseObjectModel {
	
	private String name;
	
	private RankTypes rank;
	
	private String collarNumber;
	
	private String warrentNumber;
	
	public PersonModel() {
		super("");
	}
	
	public PersonModel(String id) {
		super(id);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
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

}