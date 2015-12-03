package uk.co.pped.policeapi.bean;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class ForceBeanJUnitTest {

	@Test
	public void testCreationOfForceBean() {
		// Given
		String id = "GMP";
		String name = "Greater Manchester Police";
		
		// When
		ForceBean forceBean = new ForceBean(name, id);
		
		// Then
		assertEquals(forceBean.getId(), id);
		assertEquals(forceBean.getName(), name);
		assertNotNull(forceBean.getEngagementMethods());
	}
}
