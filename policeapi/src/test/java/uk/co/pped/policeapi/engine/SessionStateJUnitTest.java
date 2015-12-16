package uk.co.pped.policeapi.engine;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import uk.co.pped.policeapi.bean.ForceBean;

@RunWith(MockitoJUnitRunner.class)
public class SessionStateJUnitTest {
	
	private SessionState subject;
	
	@Mock
	private HttpSession session;
	
	@Before
	public void setup() {

	}
	
	@Test
	public void testSomething() {
		subject = new SessionState(session, null);
		Map<String, ForceBean> forces = null;
		
		subject.setForces(forces);
	}
	
}
