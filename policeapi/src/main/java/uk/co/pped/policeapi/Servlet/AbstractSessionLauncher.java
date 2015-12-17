package uk.co.pped.policeapi.Servlet;

import java.util.Map;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import uk.co.pped.policeapi.bean.ForceBean;
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
	
	protected SessionState createSessionState(HttpServletRequest request, HttpSession session) {
		SessionState ss = null;
		
		// TODO: We need to load in the forces here, the forces will be retrieved and placed into here.
		// Map<String, ForceBean> forces = getLoadedForces();
		Map<String, ForceBean> forces = null;
		
		ss = new SessionState(session, forces);
		
		// Attach to session
		session.setAttribute("ss", ss);
		return ss;
	}
	
	
	@Override
	public synchronized void init(ServletConfig config) throws ServletException {
		super.init(config);
	}
}
