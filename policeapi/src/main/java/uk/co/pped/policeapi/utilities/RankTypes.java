package uk.co.pped.policeapi.utilities;

public enum RankTypes {
	
	PCSO("PCSO"),
	SC("SC"),
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
	DCC("DCC");
	
	private final String rankType;
	
	RankTypes(String rankType) {
		this.rankType = rankType;
	}
	
	@Override
	public String toString() {
		return rankType;
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
				return "Rank Unknown";
				
		}
	}
	
}