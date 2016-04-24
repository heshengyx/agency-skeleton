package com.house.agency.data.manage;

import java.io.Serializable;

public class BuildingUnitManageData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5683004256642767941L;
	private String id;
	private String buildingId;
	private String name;
	private int floor;
	private String status;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
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
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
