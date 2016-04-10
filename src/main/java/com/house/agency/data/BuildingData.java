package com.house.agency.data;

import java.io.Serializable;

public class BuildingData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7272650354018419260L;
	private String label;
	private String districtName;
	private String townName;
	
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getDistrictName() {
		return districtName;
	}
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}
	public String getTownName() {
		return townName;
	}
	public void setTownName(String townName) {
		this.townName = townName;
	}
}
