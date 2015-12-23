package uk.co.pped.policeapi.bean;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import uk.co.pped.policeapi.utilities.Force;

public class ForceBeanJUnitTest {

	@Test
	public void testCreationOfForceBeanWithID() {
		// Given
		String id = "greater-manchester";
		String name = "Greater Manchester Police";
		
		// When
		ForceBean forceBean = new ForceBean(id);
		
		// Then
		assertEquals(forceBean.getId(), id);
		assertEquals(forceBean.getName(), name);
		assertNotNull(forceBean.getEngagementMethods());
	}
	
	@Test
	public void testCreationOfForceBeanWithForce() {
		// Given
		String id = "west-yorkshire";
		String name = "West Yorkshire Police";
		
		// When
		ForceBean forceBean = new ForceBean(Force.WESTYORKSHIRE);
		
		// Then
		assertEquals(forceBean.getId(), id);
		assertEquals(forceBean.getName(), name);
		assertNotNull(forceBean.getEngagementMethods());
	}
}
