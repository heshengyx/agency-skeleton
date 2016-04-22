package com.house.agency.data.manage;

import java.io.Serializable;
import java.util.Date;

import com.house.agency.enums.FaceEnum;
import com.house.agency.enums.FitmentEnum;

public class HouseManageData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2311863932692051396L;
	private String houseId;
	private String districtName;
	private String townName;
	private String buildingName;
	private String buildingAddress;
	private String floorName;
	private int buildingFloor;
	private int area;
	private int room;
	private int saloon;
	private int toilet;
	private int floor;
	private int face;
	private String faceName;
	private int fitment;
	private String fitmentName;
	private String card;
	private String code;
	private String encode;
	private Date createTime;
	
	public String getHouseId() {
		return houseId;
	}
	public void setHouseId(String houseId) {
		this.houseId = houseId;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getFloorName() {
		return floorName;
	}
	public void setFloorName(String floorName) {
		this.floorName = floorName;
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
	public String getBuildingAddress() {
		return buildingAddress;
	}
	public void setBuildingAddress(String buildingAddress) {
		this.buildingAddress = buildingAddress;
	}
	public int getBuildingFloor() {
		return buildingFloor;
	}
	public void setBuildingFloor(int buildingFloor) {
		this.buildingFloor = buildingFloor;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	public int getRoom() {
		return room;
	}
	public void setRoom(int room) {
		this.room = room;
	}
	public int getSaloon() {
		return saloon;
	}
	public void setSaloon(int saloon) {
		this.saloon = saloon;
	}
	public int getToilet() {
		return toilet;
	}
	public void setToilet(int toilet) {
		this.toilet = toilet;
	}
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	public int getFace() {
		return face;
	}
	public void setFace(int face) {
		this.face = face;
	}
	public String getFaceName() {
		String name = FaceEnum.getTextByValue(String.valueOf(face));
		name = (name == null) ?  "" : name;
		return name;
	}
	public void setFaceName(String faceName) {
		this.faceName = faceName;
	}
	public int getFitment() {
		return fitment;
	}
	public void setFitment(int fitment) {
		this.fitment = fitment;
	}
	public String getFitmentName() {
		String name = FitmentEnum.getTextByValue(String.valueOf(fitment));
		name = (name == null) ?  "" : name;
		return name;
	}
	public void setFitmentName(String fitmentName) {
		this.fitmentName = fitmentName;
	}
	public String getCard() {
		return card;
	}
	public void setCard(String card) {
		this.card = card;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getEncode() {
		return encode;
	}
	public void setEncode(String encode) {
		this.encode = encode;
	}
}
