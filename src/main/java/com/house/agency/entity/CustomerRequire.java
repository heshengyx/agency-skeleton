package com.house.agency.entity;

import java.io.Serializable;
import java.util.Date;

public class CustomerRequire implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8801119975028808606L;
	private String id;
	private String customerId;
	private String districtIds;
	private String townIds;
	private String buildingIds;
	private long priceBegin;
	private long priceEnd;
	private long areaBegin;
	private long areaEnd;
	private String floors;
	private String rooms;
	private String saloons;
	private String toilets;
	private String kitchens;
	private String faces;
	private String type;
	private String status;
	private Date createTime;
	private Date updateTime;
	private String remarks;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getDistrictIds() {
		return districtIds;
	}
	public void setDistrictIds(String districtIds) {
		this.districtIds = districtIds;
	}
	public String getTownIds() {
		return townIds;
	}
	public void setTownIds(String townIds) {
		this.townIds = townIds;
	}
	public String getBuildingIds() {
		return buildingIds;
	}
	public void setBuildingIds(String buildingIds) {
		this.buildingIds = buildingIds;
	}
	public long getPriceBegin() {
		return priceBegin;
	}
	public void setPriceBegin(long priceBegin) {
		this.priceBegin = priceBegin;
	}
	public long getPriceEnd() {
		return priceEnd;
	}
	public void setPriceEnd(long priceEnd) {
		this.priceEnd = priceEnd;
	}
	public long getAreaBegin() {
		return areaBegin;
	}
	public void setAreaBegin(long areaBegin) {
		this.areaBegin = areaBegin;
	}
	public long getAreaEnd() {
		return areaEnd;
	}
	public void setAreaEnd(long areaEnd) {
		this.areaEnd = areaEnd;
	}
	public String getFloors() {
		return floors;
	}
	public void setFloors(String floors) {
		this.floors = floors;
	}
	public String getRooms() {
		return rooms;
	}
	public void setRooms(String rooms) {
		this.rooms = rooms;
	}
	public String getSaloons() {
		return saloons;
	}
	public void setSaloons(String saloons) {
		this.saloons = saloons;
	}
	public String getToilets() {
		return toilets;
	}
	public void setToilets(String toilets) {
		this.toilets = toilets;
	}
	public String getKitchens() {
		return kitchens;
	}
	public void setKitchens(String kitchens) {
		this.kitchens = kitchens;
	}
	public String getFaces() {
		return faces;
	}
	public void setFaces(String faces) {
		this.faces = faces;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
}
