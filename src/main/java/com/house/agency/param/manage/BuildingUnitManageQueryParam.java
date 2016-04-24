package com.house.agency.param.manage;

import com.house.agency.param.QueryParam;

public class BuildingUnitManageQueryParam extends QueryParam {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5499642462859160634L;
	private String buildingId;
	
	public String getBuildingId() {
		return buildingId;
	}
	public void setBuildingId(String buildingId) {
		this.buildingId = buildingId;
	}
}
