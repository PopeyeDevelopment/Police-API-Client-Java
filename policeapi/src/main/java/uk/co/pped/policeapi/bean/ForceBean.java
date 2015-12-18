package uk.co.pped.policeapi.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.apache.log4j.Logger;

import uk.co.pped.policeapi.model.EngagementMethodModel;
import uk.co.pped.policeapi.model.NeighbourhoodModel;
import uk.co.pped.policeapi.model.OfficerModel;
import uk.co.pped.policeapi.model.PersonModel;
import uk.co.pped.policeapi.utilities.Log4JHelper;
import uk.co.pped.policeapi.utilities.RankTypes;

/**
 *  Holds all the force specific data
 * @author matthewi
 *
 */
public class ForceBean extends AbstractBean implements java.io.Serializable, Cloneable {

	private static final Logger LOGGER = Log4JHelper.getLogger(ForceBean.class);
	
	/** The name of that force */
	private final String name;
	
	/** The URL for that force */
	private String forceWebsiteURL;
	
	/** This holds all the different ways that users can be kept informed i.e. facebook, twitter etc */
	private List<EngagementMethodModel> engagementMethods;
	
	/** The telephone number for that force */
	private String telephoneNumber;
	
	private List<OfficerModel> seniorOfficers;
	
	// TODO: Create Neighbourhood model/bean
	private List<NeighbourhoodModel> neighbourhoods;
		
	private boolean ignoreForce;

	public ForceBean(String name, String id) {
		super(id);
		this.name = name;
		this.engagementMethods = new ArrayList<EngagementMethodModel>();
		this.seniorOfficers = null;
		this.neighbourhoods = null;
		// Default no force is ignored
		this.ignoreForce = false;
	}
	
	public String getName() {
		return name;
	}
	
	public void setForceWebsiteURL(String forceWebsiteURL) {
		this.forceWebsiteURL = forceWebsiteURL;
	}
	
	public String getForceWebsiteURL() {
		return forceWebsiteURL;
	}
	
	public String getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}
	
	public void setEngagementMethods(List<EngagementMethodModel> engagementMethods) {
		this.engagementMethods = engagementMethods;
	}
	
	public List<EngagementMethodModel> getEngagementMethods() {
		return engagementMethods;
	}
	
	public boolean addEngagementMethod(EngagementMethodModel engagementMethod) {
		return engagementMethods.add(engagementMethod);
	}
	
	public void setIgnoreForce(boolean ignoreForce) {
		this.ignoreForce = ignoreForce;
	}

	public boolean isIgnoreForce() {
		return ignoreForce;
	}
	
	public void setSeniorOfficers(List<OfficerModel> seniorOfficers) {		
		this.seniorOfficers = seniorOfficers;
	}
	
	public List<OfficerModel> getSeniorOfficers() {
		if (this.seniorOfficers ==  null) {
			this.seniorOfficers = new ArrayList<OfficerModel>();
		}
		
		return seniorOfficers;
	}
	
	public OfficerModel getMostSeniorRankingOfficer() {
		OfficerModel mostSeniorOfficer = null;
		
		List<OfficerModel> seniorOfficers = getSeniorOfficers();
		
		if (CollectionUtils.isEmpty(seniorOfficers)) {
			LOGGER.info("getMostSeniorRankingOfficer: this force doesn't have any senior ranking officers currently.");
			return mostSeniorOfficer;
		}
		
		return mostSeniorOfficer;
	}
}
