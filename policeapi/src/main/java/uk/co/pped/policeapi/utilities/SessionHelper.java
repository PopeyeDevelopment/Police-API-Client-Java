package uk.co.pped.policeapi.utilities;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import uk.co.pped.policeapi.engine.SessionState;


public class SessionHelper {
	
	/** Get the SessionState from the HTTPSession. 
     * 
     * @param session The HTTP Session.
     * @return The SessionState held on the session, or null if there isn't one.
     */
    public static SessionState getSessionState(HttpSession session) {
        return (SessionState) session.getAttribute("ss");
    }            
    
    /** Get the SessionState from the HTTPRequest.  Helper method for 
     * servlets, which don't have a pageContext. 
     * 
     * @param request The HTTP Request.
     * @return The SessionState held on the session, or null if there isn't one.
     */
    public static SessionState getSessionState(HttpServletRequest request) {
        return getSessionState(request.getSession());
    }   
}
