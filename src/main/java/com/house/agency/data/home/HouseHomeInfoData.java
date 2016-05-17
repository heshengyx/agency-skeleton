package com.house.agency.data.home;

import java.io.Serializable;

public class HouseHomeInfoData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8471894817069139241L;
	private String houseId;
	private int area;
	private int floor;
	private int room;
	private int saloon;
	private int toilet;
	private int kitchen;
	private int face;
	private String card;
	
	public String getHouseId() {
		return houseId;
	}
	public void setHouseId(String houseId) {
		this.houseId = houseId;
	}
	public String getCard() {
		return card;
	}
	public void setCard(String card) {
		this.card = card;
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
}
