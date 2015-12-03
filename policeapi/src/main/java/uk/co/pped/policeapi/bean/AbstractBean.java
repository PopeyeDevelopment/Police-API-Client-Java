package uk.co.pped.policeapi.bean;

public abstract class AbstractBean {
	
	/** A unique identifier */
	private final String id;
	
	protected AbstractBean(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
}