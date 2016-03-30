package com.house.agency.param;

import java.io.Serializable;


public class BuildingQueryParam implements Serializable {
	
	/**  */
	private static final long serialVersionUID = -7030573523951102108L;
	private String buildingName;
	
	public String getBuildingName() {
		return buildingName;
	}
	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}
}
