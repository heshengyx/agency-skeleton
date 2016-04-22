package com.house.agency.param.manage;

import com.house.agency.param.QueryParam;

public class HouseManageQueryParam extends QueryParam {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7588040087395889971L;
	private String districtId;
	private String townId;
	private String buildingUnitId;
	private String buildingName;
	
	public String getBuildingUnitId() {
		return buildingUnitId;
	}
	public void setBuildingUnitId(String buildingUnitId) {
		this.buildingUnitId = buildingUnitId;
	}
	public String getBuildingName() {
		return buildingName;
	}
	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}
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
}
