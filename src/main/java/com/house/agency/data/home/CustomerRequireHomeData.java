package com.house.agency.data.home;

import java.io.Serializable;
import java.util.Date;

public class CustomerRequireHomeData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1473163803666015060L;
	private String requireId;
	private String name;
	private String phone;
	private String districtName;
	private String townName;
	private String buildingName;
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
	private int num;
	
	private String districtIds;
	private String townIds;
	private String buildingIds;
	
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
	public String getRequireId() {
		return requireId;
	}
	public void setRequireId(String requireId) {
		this.requireId = requireId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
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
	public String getBuildingName() {
		return buildingName;
	}
	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
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
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
}
