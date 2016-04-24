package com.house.agency.data.home;

import java.io.Serializable;
import java.util.Date;

public class HouseHomeData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3722030397289079462L;
	private String tradeId;
	private String districtName;
	private String townName;
	private String buildingName;
	private String buildingAddress;
	private String floorName;
	private String title;
	private int buildingFloor;
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
	private String card;
	private String code;
	private String encode;
	private String status;
	private Date releaseTime;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTradeId() {
		return tradeId;
	}
	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
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
	public String getFloorName() {
		return floorName;
	}
	public void setFloorName(String floorName) {
		this.floorName = floorName;
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
		return faceName;
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
		return fitmentName;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getReleaseTime() {
		return releaseTime;
	}
	public void setReleaseTime(Date releaseTime) {
		this.releaseTime = releaseTime;
	}
}
