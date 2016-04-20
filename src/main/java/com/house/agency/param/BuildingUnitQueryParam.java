package com.house.agency.param;


public class BuildingUnitQueryParam extends QueryParam {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4842659791632248706L;
	private String buildingId;
	private String name;
	
	public String getBuildingId() {
		return buildingId;
	}
	public void setBuildingId(String buildingId) {
		this.buildingId = buildingId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
