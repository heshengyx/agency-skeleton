package com.house.agency.param;


public class HouseQueryParam extends QueryParam {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2590863069764906853L;
	private String districtId;
	private String townId;
	private int priceBegin;
	private int priceEnd;
	private int areaBegin;
	private int areaEnd;
	private int room;
	private int saloon;
	private int toilet;
	private int subway;
	private String releaseDateBegin;
	private String releaseDateEnd;
	private String symbol;
	private String tag;
	private String sort;
	private String buildingName;
	private String type;
	private String style;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
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
	public int getPriceBegin() {
		return priceBegin;
	}
	public void setPriceBegin(int priceBegin) {
		this.priceBegin = priceBegin;
	}
	public int getPriceEnd() {
		return priceEnd;
	}
	public void setPriceEnd(int priceEnd) {
		this.priceEnd = priceEnd;
	}
	public int getRoom() {
		return room;
	}
	public void setRoom(int room) {
		this.room = room;
	}
	public int getAreaBegin() {
		return areaBegin;
	}
	public void setAreaBegin(int areaBegin) {
		this.areaBegin = areaBegin;
	}
	public int getAreaEnd() {
		return areaEnd;
	}
	public void setAreaEnd(int areaEnd) {
		this.areaEnd = areaEnd;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	public String getBuildingName() {
		return buildingName;
	}
	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}
	public int getSubway() {
		return subway;
	}
	public void setSubway(int subway) {
		this.subway = subway;
	}
}
