package uk.co.pped.policeapi.engine;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

import uk.co.pped.policeapi.bean.ForceBean;
import uk.co.pped.policeapi.utilities.Log4JHelper;

public class SessionState implements Serializable {
	
	private static final Logger LOGGER = Log4JHelper.getLogger(SessionState.class);

	private String sessionId;
	
	private HttpServletRequest request;
	
	private Map<String, ForceBean> forces;
	
	private ForceBean selectedForce;
	
	/**
     * A universally unique identifier for this session. 
     */
    private final UUID sessionUUID;
    
	public SessionState(HttpSession session, Map<String, ForceBean> forces) {
		this.sessionUUID = UUID.randomUUID();
		this.forces = forces;
	}
		
	public HttpSession getSession() {
		HttpServletRequest req = getRequest();
		if (req == null) {
			return null;
		}
		return req.getSession();
	}
	
	public HttpServletRequest getRequest() {
		return request;
	}
	
	public void setRequest(HttpServletRequest req) {
		this.request = req;
		
		if (req != null) {
			HttpSession session = req.getSession();
			this.sessionId = session.getId();
		}
	}
	
	/**
	 * Getter for getting the current sessions ID.
	 * 
	 * @return the ID that has been stamped on the current session.
	 */
	public final String getSessionId() {
		return sessionId;
	}
	
	/** 
	 * Getter for getting the current sessions UUID
	 * 
	 * @return the UUID that has been stamped on the current session .
	 */
	public final UUID getSessionUUID() {
		return sessionUUID;
	}
	
	public void setForces(Map<String, ForceBean> forces) {
		if (MapUtils.isEmpty(forces)) {
			LOGGER.info("setForces: setting forces to blank/null.");
		}
		
		this.forces = forces;
	}
	
	public boolean addForce(ForceBean forceBean) {
		if (forceBean == null) {
			LOGGER.warn("addForce: attempting to add a null ForceBean is bad we will not be adding this.");
			return false;
		}
		
		String forceName = forceBean.getName();
		if (StringUtils.isEmpty(forceName)) {
			LOGGER.warn("addForce: attempting to add a ForceBean with no force name is bad we will not be adding this.");
			return false;
		}
		
		Map <String, ForceBean> fb = getForces();
		if (MapUtils.isEmpty(fb)) {
			fb = new HashMap<String, ForceBean>();
		}
		
		fb.put(forceName, forceBean);
		
		return fb.containsKey(forceName);
	}
	
	public Map<String, ForceBean> getForces() {
		return forces;
	}
	
	public void setSelectedForce(ForceBean selectedForce) {
		try {
			if (selectedForce != null
					&& !forces.containsValue(selectedForce)) {
				throw new IllegalArgumentException("setSelectedForce: it is illegal to try and set the selected force to a force that doesn't exist.");
			}
			
			this.selectedForce = selectedForce;
		} catch (IllegalArgumentException iae) {
			LOGGER.error(iae);
		}
	}
	
}
