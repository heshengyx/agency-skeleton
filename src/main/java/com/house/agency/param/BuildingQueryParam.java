package com.house.agency.param;

import java.io.Serializable;


public class BuildingQueryParam implements Serializable {
	
	/**  */
	private static final long serialVersionUID = -7030573523951102108L;
	private String districtId;
	private String townId;
	private String buildingName;
	
	public String getDistrictId() {
		return districtId;
	}
	public void setDistrictId(String districtId) {
		this.districtId = districtId;
	}
	public String getTownId() {
		return townId;
	}
	public void setTownId(String townId) {
		this.townId = townId;
	}
	public String getBuildingName() {
		return buildingName;
	}
	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}
}
