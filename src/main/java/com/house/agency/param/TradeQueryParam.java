package com.house.agency.param;

public class TradeQueryParam extends QueryParam {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2552853770169182981L;
	private String districtId;
	private String townId;
	private int priceBegin;
	private int priceEnd;
	private int pattern;
	private int areaBegin;
	private int areaEnd;
	private String symbol;
	private String tag;
	private String sort;
	private String buildingName;
	private int subway;
	
	public int getSubway() {
		return subway;
	}
	public void setSubway(int subway) {
		this.subway = subway;
	}
	public String getBuildingName() {
		return buildingName;
	}
	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
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
	public int getPattern() {
		return pattern;
	}
	public void setPattern(int pattern) {
		this.pattern = pattern;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
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
}
