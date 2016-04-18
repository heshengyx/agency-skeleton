package com.house.agency.entity;

import java.io.Serializable;
import java.util.Date;

public class House implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -528732409800963930L;
	private String id;
	private String buildingUnitId;
	private int area;
	private int floor;
	private int room;
	private int saloon;
	private int toilet;
	private int kitchen;
	private int face;
	private int fitment;
	private String card;
	private String code;
	private String encode;
	private String status;
	private Date createTime;
	private Date updateTime;
	private String remarks;
	
	public String getCard() {
		return card;
	}
	public void setCard(String card) {
		this.card = card;
	}
	public int getFitment() {
		return fitment;
	}
	public void setFitment(int fitment) {
		this.fitment = fitment;
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
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
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
	public int getKitchen() {
		return kitchen;
	}
	public void setKitchen(int kitchen) {
		this.kitchen = kitchen;
	}
	public int getFace() {
		return face;
	}
	public void setFace(int face) {
		this.face = face;
	}
	public String getBuildingUnitId() {
		return buildingUnitId;
	}
	public void setBuildingUnitId(String buildingUnitId) {
		this.buildingUnitId = buildingUnitId;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
