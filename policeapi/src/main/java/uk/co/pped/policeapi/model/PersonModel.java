package uk.co.pped.policeapi.model;

import uk.co.pped.policeapi.utilities.RankTypes;

public class PersonModel extends BaseObjectModel {
	
	private String name;
	
	private RankTypes rank;
	
	public PersonModel() {
		
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
}