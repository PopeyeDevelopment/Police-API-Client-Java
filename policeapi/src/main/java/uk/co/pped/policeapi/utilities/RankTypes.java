package uk.co.pped.policeapi.utilities;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

public enum RankTypes {
	
	private static final Integer PCSO_INT = 1;
	private static final Integer CONSTALBE_INT = 2;
	
	PCSO("PCSO"),
	SC("SC") {
		public final int getRankLevel() {
			return CONSTALBE_INT;
		}
	},
	PC("PC"),
	DC("DC"),
	SS("SS"),
	PS("PS"),
	DS("DS"),
	SI("SI"),
	PI("PI"),
	DI("DI"),
	SCI("SCI"),
	PCI("PCI"),
	DCI("DCI"),
	SCO("SCO"),
	SP("SP"),
	CSP("CSP"),
	ACC("ACC"),
	DCC("DCC"),
	CC("CC"),
	UNKNOWN("UU");
	public abstract int getRankLevel();
	private static final Integer PCSO_INT = 1;
	private static final Integer CONSTALBE_INT = 2;
	
	private final String rankType;
	
	RankTypes(String rankType) {
		this.rankType = rankType;
	}
	
	@Override
	public String toString() {
		return rankType;
	}
	
	public static RankTypes getRankType(String rank) {
		for (RankTypes rankType : RankTypes.values()) {
			if (StringUtils.equalsIgnoreCase(rankType.toString(), rank)) {
				return rankType;
			}
		}
		return RankTypes.UNKNOWN;
	}
	
	public static RankTypes convertStringToRankType(String rankName) {
		switch(rankName) {
		case "Police Community Support Officer":
			return RankTypes.PCSO;
		case "Special Constable":
			return RankTypes.SC;
		case "Police Constable":
			return RankTypes.PC;
		case "Detective Constable":
			return RankTypes.DC;
		case "Special Sergeant":
			return RankTypes.SS;
		case "Police Sergeant":
			return RankTypes.PS;
		case "Detective Sergeant":
			return RankTypes.DS;
		case "Special Inspector":
			return RankTypes.SI;
		case "Police Inspector":
			return RankTypes.PI;
		case "Detective Inspector":
			return RankTypes.DI;
		case "Specials Chief Inspector":
			return RankTypes.SCI;
		case "Police Chief Inspector":
			return RankTypes.PCI;
		case "Detective Chief Inspector":
			return RankTypes.DCI;
		case "Specials Chief Officer":
			return RankTypes.SCO;
		case "Superintendent":
			return RankTypes.SP;
		case "Chief Superintendent":
			return RankTypes.CSP;
		case "Assistant Chief Constable":
			return RankTypes.ACC;
		case "Dupty Chief Constable":
			return RankTypes.DCC;
		case "Chief Constable":
			return RankTypes.CC;
		default:
			return RankTypes.UNKNOWN;
		}
	}
	
	public String convertRankType() {
		switch(this.toString()) {
			case "PCSO":
				return "Police Community Support Officer";
			case "SC":
				return "Special Constable";
			case "PC":
				return "Police Constable";
			case "DC":
				return "Detective Constable";
			case "SS":
				return "Special Sergeant";
			case "PS":
				return "Police Sergeant";
			case "DS":
				return "Detective Sergeant";
			case "SI":
				return "Special Inspector";
			case "PI":
				return "Police Inspector";
			case "DI":
				return "Detective Inspector";
			case "SCI":
				return "Specials Chief Inspector";
			case "PCI":
				return "Police Chief Inspector";
			case "DCI":
				return "Detective Chief Inspector";
			case "SCO":
				return "Specials Chief Officer";
			case "SP":
				return "Superintendent";
			case "CSP":
				return "Chief Superintendent";
			case "ACC":
				return "Assistant Chief Constable";
			case "DCC":
				return "Dupty Chief Constable";
			case "CC":
				return "Chief Constable";
			default:
				return "UNKNOWN";		
		}
	}
	
	public static Map<RankTypes, Integer> ranks() {
		return ranks;
	}

}