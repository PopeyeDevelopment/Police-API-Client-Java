package uk.co.pped.policeapi.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import uk.co.pped.policeapi.utilities.RankTypes;


public class OfficerModelJUnitTest {
	
	private static final String COLLAR_NUMBER = "1234";
	
	private static final String WARRENT_NUMBER = "ABC1234";
	
	private static final RankTypes OFFICER_RANK = RankTypes.DI;
	
	OfficerModel subject;
	
	@Before
	public void setup() {
		subject = new OfficerModel();
	}
	
	@Test
	public void testValidOfficer() {
		// Given
		givenSetOfficerDetails();
		
		// When
		
		// Then
		assertThat(subject.getCollarNumber(), is(COLLAR_NUMBER));
		assertThat(subject.getWarrentNumber(), is(WARRENT_NUMBER));
		assertThat(subject.getRank(), is(OFFICER_RANK));
	}
	
	@Test
	public void testSubjectIsRankHigherTrue() {
		// Given
		givenSetOfficerDetails();
		OfficerModel comparableOfficer = new OfficerModel();
		comparableOfficer.setRank(RankTypes.PC);
		
		// When
		boolean result = subject.isRankHigher(comparableOfficer);
		
		// Then
		assertTrue(result);
	}
	
	@Test
	public void testSubjectIsRankHigherFalse() {
		// Given
		givenSetOfficerDetails();
		OfficerModel comparableOfficer = new OfficerModel();
		comparableOfficer.setRank(RankTypes.ACC);
		
		// When
		boolean result = subject.isRankHigher(comparableOfficer);
		
		// Then
		assertFalse(result);
	}
	
	@Test
	public void testSubjectIsRankHigherCompareWithNullTrue() {
		// Given
		givenSetOfficerDetails();
		OfficerModel comparableOfficer = null;
		
		// When
		boolean result = subject.isRankHigher(comparableOfficer);
		
		// Then
		assertTrue(result);
	}
	
	@Test
	public void testSubjectIsRankHigherCompareWithOfficerWithNoRankTrue() {
		// Given
		givenSetOfficerDetails();
		OfficerModel comparableOfficer = new OfficerModel();
		
		// When
		boolean result = subject.isRankHigher(comparableOfficer);
		
		// Then
		assertTrue(result);
	}
	
	private void givenSetOfficerDetails() {
		subject.setCollarNumber(COLLAR_NUMBER);
		subject.setWarrentNumber(WARRENT_NUMBER);
		subject.setRank(OFFICER_RANK);
	}
}
