package uk.co.pped.policeapi.model;

public class PersonModel extends BaseObjectModel {
	
	private String forename;
	
	private String surname;
		
	private String title;
	
	public PersonModel() {
		super("");
	}
	
	public PersonModel(String id) {
		super(id);
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}

	public void setForename(String forename) {
		this.forename = forename;
	}
	
	public String getForename() {
		return forename;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public String getSurname() {
		return surname;
	}
	
}