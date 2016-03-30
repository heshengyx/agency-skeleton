package com.house.agency.param;

import java.io.Serializable;

public class BuildingImageQueryParam implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -323206896159385879L;
	private String buildingId;
	public String getBuildingId() {
		return buildingId;
	}
	public void setBuildingId(String buildingId) {
		this.buildingId = buildingId;
	}
}
