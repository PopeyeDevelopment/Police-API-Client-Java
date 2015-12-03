package uk.co.pped.policeapi.utilities;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RankTypesJUnitTest {

	@Test
	public void testToStringACC() {
		assertEquals(RankTypes.ACC.toString(), "ACC");
	}
	
	@Test
	public void testConvertRankTypeSpecialConstable() {
		assertEquals(RankTypes.SC.convertRankType(), "Special Constable");
	}

	@Test
	public void testConvertStringToRankTypeUNKNOWN() {
		assertEquals(RankTypes.convertStringToRankType("Commander"), RankTypes.UNKNOWN);
	}
	
	@Test
	public void testConvertStringToRankTypeCC() {
		assertEquals(RankTypes.convertStringToRankType("Chief Constable"), RankTypes.CC);
	}
	
	@Test
	public void testGetRankTypeUNKNOWN() {
		assertEquals(RankTypes.getRankType("CMDR"), RankTypes.UNKNOWN);
	}
	
	@Test
	public void testGetRankTypeDCC() {
		assertEquals(RankTypes.getRankType("DCC"), RankTypes.DCC);
	}
}
