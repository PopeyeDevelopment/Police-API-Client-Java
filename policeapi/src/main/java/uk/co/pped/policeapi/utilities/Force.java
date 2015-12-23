package uk.co.pped.policeapi.utilities;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

public enum Force {
	AVONSOMERSET("avon-and-somerset"),
	BEDFORDSHIRE("bedfordshire"),
	CAMBRIDGESHIRE("cambridgeshire"),
	CHESHIRE("cheshire"),
	CITYOFLONDON("city-of-london"),
	CLEVELAND("cleveland"),
	CUMBRIA("cumbria"),
	DERBYSHIRE("derbyshire"),
	DEVONCORNWALL("devon-and-cornwall"),
	DORSET("dorset"),
	DYFEDPOWYS("dyfed-powys"),
	ESSEX("essex"),
	GLOUCESTERSHIRE("gloucestershire"),
	GMP("greater-manchester"),
	GWENT("gwent"),
	HAMPSHIRE("hampshire"),
	HERTFORDSHIRE("hertfordshire"),
	KENT("kent"),
	LANCASHIRE("lancashire"),
	LEICESTERSHIRE("leicestershire"),
	LINCOLNSHIRE("lincolnshire"),
	MERSEYSIDE("merseyside"),
	MET("metropolitan"),
	NORFOLK("norfolk"),
	NORTHWALES("north-wales"),
	NORTHYORKSHIRE("north-yorkshire"),
	NORTHAMPTONSHIRE("northamptonshire"),
	NORTHUMBRIA("northumbria"),
	NOTTINGHAMSHIRE("nottinghamshire"),
	NORTHERNIRELAND("northern-ireland"),
	SOUTHWALES("south-wales"),
	SOUTHYORKSHIRE("south-yorkshire"),
	STAFFORDSHIRE("staffordshire"),
	SUFFOLK("suffolk"),
	SURREY("surry"),
	SUSSEX("sussex"),
	THAMESVALLEY("thames-valley"),
	WARWICKSHIRE("warwickshire"),
	WESTMERCIA("west-mercia"),
	WESTMIDLANDS("west-midlands"),
	WESTYORKSHIRE("west-yorkshire"),
	WILTSHIRE("wiltshire"),
	UNKNOWN("unknown");
	
	
	private static final Map<String, String> forces = new HashMap<String, String>();

	static {
		forces.put("avon-and-somerset", "Avon and Somerset Constabulary");
		forces.put("bedfordshire", "Bedfordshire Police");
		forces.put("cambridgeshire", "Cambridgeshire Constabulary");
		forces.put("cheshire", "Cheshire Constabulary");
		forces.put("city-of-london", "City of London Police");
		forces.put("cleveland", "Cleveland Police");
		forces.put("cumbria", "Cumbria Constabulary");
		forces.put("derbyshire", "Derbyshire Constabulary");
		forces.put("devon-and-cornwall", "Devon and Cornwall Police");
		forces.put("dorset", "Dorset Police");
		forces.put("durham", "Durham Constabulary");
		forces.put("dyfed-powys", "Dyfed-Powys Police");
		forces.put("essex", "Essex Police");
		forces.put("gloucestershire", "Gloucestershire Constabulary");
		forces.put("greater-manchester", "Greater Manchester Police");
		forces.put("gwent", "Gwent Police");
		forces.put("hampshire", "Hampshire Constabulary");
		forces.put("hertfordshire", "Hertfordshire Constabulary");
		forces.put("humbersire", "Humberside Police");
		forces.put("kent", "Kent Police");
		forces.put("lancashire", "Lanchashire Constabulary");
		forces.put("leicestershire", "Leicestershire Police");
		forces.put("lincolnshire", "Lincolnshire Police");
		forces.put("merseyside", "Merseyside Police");
		forces.put("metropolitan", "Metropolitan Police Service");
		forces.put("norfolk", "Norfolk Constabulary");
		forces.put("north-wales", "North Wales Police");
		forces.put("north-yorkshire", "North Yorkshire Police");
		forces.put("northamptonshire", "Northamptonshire Police");
		forces.put("northumbria", "Northumbria Police");
		forces.put("nottinghamshire", "Nottinghamshire Police");
		forces.put("northern-ireland", "Police Service of Northern Ireland");
		forces.put("south-wales", "South Wales Police");
		forces.put("south-yorkshire", "South Yorkshire Police");
		forces.put("staffordshire", "Staffordshire Police");
		forces.put("suffolk", "Suffolk Constabulary");
		forces.put("surry", "Surrey Police<");
		forces.put("sussex", "Sussex Police");
		forces.put("thames-valley", "Thames Valley Police");
		forces.put("warwickshire", "Warwickshire Police");
		forces.put("west-mercia", "West Mercia Police");
		forces.put("west-midlands", "West Midlands Police");
		forces.put("west-yorkshire", "West Yorkshire Police");
		forces.put("wiltshire", "Wiltshire Police");
		forces.put("unknown", "Force Not Known");
	}

	private final String forceID;
	
	Force(String forceID) {
		this.forceID = forceID;
	}
	
	public String getForceID() {
		return this.forceID;
	}
	
	public String getForceName() {
		return forces.get(this.getForceID());
	}
	
	public static Force getForceWithID(String id) {
		if (StringUtils.isNotBlank(id)) {
			for (Force force : Force.values()) {
				if (StringUtils.equalsIgnoreCase(force.getForceID(), id)) {
					return force;
				}
			}
		}
		return Force.UNKNOWN;
	}

	public boolean isForceKnown() {
		return this != Force.UNKNOWN;
	}
	
}