package com.house.agency.data;

import java.io.Serializable;
import java.util.Date;

import com.house.agency.enums.BuildingTypeEnum;
import com.house.agency.enums.FaceEnum;
import com.house.agency.enums.FitmentEnum;
import com.house.agency.enums.OwnerEnum;

public class HouseInfoData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8471894817069139241L;
	private String tradeId;
	private String houseId;
	private String buildingId;
	private String districtName;
	private String townName;
	private String buildingName;
	private String buildingAddress;
	private String buildingYear;
	private String buildingType;
	private String buildingTypeName;
	private int buildingFloor;
	private String title;
	private String type;
	private int price;
	private int area;
	private int room;
	private int saloon;
	private int toilet;
	private int floor;
	private int face;
	private String faceName;
	private int fitment;
	private String fitmentName;
	private int owner;
	private String ownerName;
	private String code;
	private String encode;
	private Date releaseTime;
	private String username;
	private String phone;

	public int getOwner() {
		return owner;
	}
	public void setOwner(int owner) {
		this.owner = owner;
	}
	public String getOwnerName() {
		String name = OwnerEnum.getTextByValue(String.valueOf(owner));
		name = (name == null) ?  "" : name;
		return name;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getBuildingTypeName() {
		String name = BuildingTypeEnum.getTextByValue(buildingType);
		name = (name == null) ?  "" : name;
		return name;
	}
	public void setBuildingTypeName(String buildingTypeName) {
		this.buildingTypeName = buildingTypeName;
	}
	public String getBuildingType() {
		return buildingType;
	}
	public void setBuildingType(String buildingType) {
		this.buildingType = buildingType;
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
	public Date getReleaseTime() {
		return releaseTime;
	}
	public void setReleaseTime(Date releaseTime) {
		this.releaseTime = releaseTime;
	}
	public String getHouseId() {
		return houseId;
	}
	public void setHouseId(String houseId) {
		this.houseId = houseId;
	}
	public String getBuildingId() {
		return buildingId;
	}
	public void setBuildingId(String buildingId) {
		this.buildingId = buildingId;
	}
	public String getDistrictName() {
		return districtName;
	}
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getTradeId() {
		return tradeId;
	}
	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
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
	public String getBuildingYear() {
		return buildingYear;
	}
	public void setBuildingYear(String buildingYear) {
		this.buildingYear = buildingYear;
	}
	public int getBuildingFloor() {
		return buildingFloor;
	}
	public void setBuildingFloor(int buildingFloor) {
		this.buildingFloor = buildingFloor;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
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
	
}
