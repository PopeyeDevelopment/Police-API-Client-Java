package uk.co.pped.policeapi.model;

abstract class BaseObjectModel implements java.io.Serializable {
	
	private final String id;
		
	protected BaseObjectModel(String id) {
		this.id = id;
	}
}
