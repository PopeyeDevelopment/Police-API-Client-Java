package uk.co.pped.policeapi.utilities;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.NDC;

import uk.co.pped.policeapi.engine.SessionState;

public final class Log4JHelper {

	/** Logger prefix used for general logging. */
    private static final String PREFIX_LOG = "log";
    
    private static final String KEY_SESSION_ID = "sessionId";
    
    private static final String KEY_SESSION_UUID = "sessionUUID";
    
    /** Date format used by the access logging. */
    public static final String ACCESS_LOG_DATE_FORMAT = "dd/MMM/yyyy:HH:mm:ss Z";
	
	/** Private default constructor to prevent instantiation. */
    private Log4JHelper() { }
   
    
    public static final Logger getLogger(Class<?> caller) {
    	return getLogger(caller, PREFIX_LOG);
    }
    
    public static final Logger getLogger(Class<?> caller, String prefix) {
    	StringBuilder name = new StringBuilder(prefix);
    	name.append(".");
    	name.append(StringUtils.substringAfter(caller.getName(), "uk.co.pped."));
		return Logger.getLogger(name.toString());
    }
    
    public static String addSessionDiagnosticData(HttpServletRequest req) {
    	String sessionId = addSessionDiagnosticData(req);
    	
    	if (StringUtils.isNotBlank(sessionId)) {
    		
    		// TODO: Add data sessionId
    		
    		SessionState ss = SessionHelper.getSessionState(req);
    		
    		if (ss != null) {
    			// TODO: add Session UUID Data
    		}
    	}
    	
    	return sessionId;
    }
    
    public static String addSessionDiagnosticData(HttpSession session) {
    	// TODO: Write method
    	return null;
    }
    
    
    
    private static String addSessionNDC(HttpServletRequest req) {
    	String sessionId = null;
    	if (NDC.peek().length() == 0) {
    		HttpSession session = req.getSession();
    		sessionId = addSessionDiagnosticData(session);
    	}
    	
    	return sessionId;
    }
    
    private static String addSessionNDC(HttpSession session) {
    	String sessionId = null;
    	if (NDC.peek().length() == 0) {
    		sessionId = session.getId();
    		NDC.push(sessionId);
    	}
    	
    	return sessionId;
    }
}
