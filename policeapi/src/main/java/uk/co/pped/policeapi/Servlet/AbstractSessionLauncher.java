package uk.co.pped.policeapi.Servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import uk.co.pped.policeapi.engine.SessionState;
import uk.co.pped.policeapi.utilities.SessionHelper;


public abstract class AbstractSessionLauncher extends HttpServlet {
	
	public abstract void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException;

	/**
	 * Get the current Session State if we don't have one then handle it.
	 *  
	 * @param request
	 * @return the SessionState
	 * @throws Exception if there is no Session State. 
	 * 
	 * TODO: Make new exception type for session timeout
	 */
	protected SessionState getSessionState(HttpServletRequest request) throws Exception {
		// Get the current Session State
		SessionState ss = SessionHelper.getSessionState(request);
	
		if (ss == null) {
			// Looks like we don't have a session.
			throw new Exception("No SessionState found on request.");
		}
		
		return ss;
	}

}
