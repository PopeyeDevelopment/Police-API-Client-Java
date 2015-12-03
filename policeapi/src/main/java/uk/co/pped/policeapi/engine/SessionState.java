package uk.co.pped.policeapi.engine;

import java.io.Serializable;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class SessionState implements Serializable {

	private String sessionId;
	
	private HttpServletRequest request;
	
	/**
     * A universally unique identifier for this session. 
     */
    private final UUID sessionUUID;
    
	public SessionState(HttpSession session) {
		this.sessionUUID = UUID.randomUUID();
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
}
