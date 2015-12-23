package uk.co.pped.policeapi.utilities;

import org.apache.commons.lang3.StringUtils;

public enum RankTypes {

	PCSO("PCSO") {
		@Override
		public int getRankGrade() {
			return PCSO_INT;
		}
	},
	
	SC("SC") {
		@Override
		public int getRankGrade() {
			return CONSTALBE_INT;
		}
	},
	PC("PC") {
		@Override
		public int getRankGrade() {
			return CONSTALBE_INT;
		}
	},
	DC("DC") {
		@Override
		public int getRankGrade() {
			return CONSTALBE_INT;
		}
	},
	SS("SS") {
		@Override
		public int getRankGrade() {
			return SERGEANT_INT;
		}
	},
	PS("PS") {
		@Override
		public int getRankGrade() {
			return SERGEANT_INT;
		}
	},
	DS("DS") {
		@Override
		public int getRankGrade() {
			return SERGEANT_INT;
		}
	},
	SI("SI") {
		@Override
		public int getRankGrade() {
			return INSPECTOR_INT;
		}
	},
	PI("PI") {
		@Override
		public int getRankGrade() {
			return INSPECTOR_INT;
		}
	},
	DI("DI") {
		@Override
		public int getRankGrade() {
			return INSPECTOR_INT;
		}
	},
	SCI("SCI") {
		@Override
		public int getRankGrade() {
			return CHIEF_INSPECTOR_INT;
		}
	},
	PCI("PCI") {
		@Override
		public int getRankGrade() {
			return CHIEF_INSPECTOR_INT;
		}
	},
	DCI("DCI") {
		@Override
		public int getRankGrade() {
			return CHIEF_INSPECTOR_INT;
		}
	},
	SCO("SCO") {
		@Override
		public int getRankGrade() {
			return SPECIALS_CHIEF_OFFICER;
		}
	},
	SP("SP") {
		@Override
		public int getRankGrade() {
			return SUPERINTENDENT_INT;
		}
	},
	CSP("CSP") {
		@Override
		public int getRankGrade() {
			return CHIEF_SUPERINTENDENT_INT;
		}
	},
	ACC("ACC") {
		@Override
		public int getRankGrade() {
			return ACC_INT;
		}
	},
	DCC("DCC") {
		@Override
		public int getRankGrade() {
			return DCC_INT;
		}
	},
	CC("CC") {
		@Override
		public int getRankGrade() {
			return CC_INT;
		}
	},
	UNKNOWN("UU") {
		@Override
		public int getRankGrade() {
			return UNKNOWN_INT;
		}
	};
	
	public abstract int getRankGrade();
	private static final Integer UNKNOWN_INT = 0;
	private static final Integer PCSO_INT = 1;
	private static final Integer CONSTALBE_INT = 2;
	private static final Integer SERGEANT_INT = 3;
	private static final Integer INSPECTOR_INT = 4;
	private static final Integer CHIEF_INSPECTOR_INT = 5;
	private static final Integer SPECIALS_CHIEF_OFFICER = 6;
	private static final Integer SUPERINTENDENT_INT = 7;
	private static final Integer CHIEF_SUPERINTENDENT_INT = 8;
	private static final Integer ACC_INT = 9;
	private static final Integer DCC_INT = 10;
	private static final Integer CC_INT = 11;
	
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
	
}