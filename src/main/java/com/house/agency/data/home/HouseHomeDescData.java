package com.house.agency.data.home;

import java.io.Serializable;

import com.house.agency.enums.FaceEnum;
import com.house.agency.enums.FitmentEnum;

public class HouseHomeDescData implements Serializable {

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
	private int fitment;
	private String card;
	private String faceName;
	private String fitmentName;
	
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
	public String getFaceName() {
		String name = FaceEnum.getTextByValue(String.valueOf(face));
		name = (name == null) ?  "" : name;
		return name;
	}
	public void setFaceName(String faceName) {
		this.faceName = faceName;
	}
	public String getFitmentName() {
		String name = FitmentEnum.getTextByValue(String.valueOf(fitment));
		name = (name == null) ?  "" : name;
		return name;
	}
	public void setFitmentName(String fitmentName) {
		this.fitmentName = fitmentName;
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
	public int getFitment() {
		return fitment;
	}
	public void setFitment(int fitment) {
		this.fitment = fitment;
	}
}
