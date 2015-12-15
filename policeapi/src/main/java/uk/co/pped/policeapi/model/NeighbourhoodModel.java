package uk.co.pped.policeapi.model;

import java.util.List;

public class NeighbourhoodModel extends BaseObjectModel {

	private final String name;
	
	private List<PersonModel> neighbourhoodTeam;
	
	public NeighbourhoodModel(String name) {
		super("");
		this.name = name;
	}
	
	public NeighbourhoodModel(String id, String name) {
		super(id);
		this.name = name;
	}
	
}