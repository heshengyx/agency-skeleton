package com.house.agency.param.home;

import java.util.List;

import com.house.agency.param.QueryParam;

public class HouseHomeQueryParam extends QueryParam {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7588040087395889971L;
	private String districtId;
	private String townId;
	private String buildingName;
	private String buildingUnitId;
	private String card;
	private long priceBegin;
	private long priceEnd;
	private long areaBegin;
	private long areaEnd;
	private int room;
	private int saloon;
	private int toilet;
	private String symbol;
	private String releaseDateBegin;
	private String releaseDateEnd;
	
	private String buildingId;
	private String rooms;
	private String saloons;
	private String toilets;
	
	public String getBuildingId() {
		return buildingId;
	}
	public void setBuildingId(String buildingId) {
		this.buildingId = buildingId;
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
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public String getCard() {
		return card;
	}
	public void setCard(String card) {
		this.card = card;
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
	public String getReleaseDateBegin() {
		return releaseDateBegin;
	}
	public void setReleaseDateBegin(String releaseDateBegin) {
		this.releaseDateBegin = releaseDateBegin;
	}
	public String getReleaseDateEnd() {
		return releaseDateEnd;
	}
	public void setReleaseDateEnd(String releaseDateEnd) {
		this.releaseDateEnd = releaseDateEnd;
	}
	public String getBuildingUnitId() {
		return buildingUnitId;
	}
	public void setBuildingUnitId(String buildingUnitId) {
		this.buildingUnitId = buildingUnitId;
	}
	public String getBuildingName() {
		return buildingName;
	}
	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}
	public String getDistrictId() {
		return districtId;
	}
	public void setDistrictId(String districtId) {
		this.districtId = districtId;
	}
	public String getTownId() {
		return townId;
	}
	public void setTownId(String townId) {
		this.townId = townId;
	}
}
