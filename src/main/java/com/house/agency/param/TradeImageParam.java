package com.house.agency.param;

import java.io.Serializable;

public class TradeImageParam implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5139330781892848488L;
	private String buildingId;
	private String houseId;
	private String tradeId;
	private String imageId;
	
	public String getBuildingId() {
		return buildingId;
	}
	public void setBuildingId(String buildingId) {
		this.buildingId = buildingId;
	}
	public String getHouseId() {
		return houseId;
	}
	public void setHouseId(String houseId) {
		this.houseId = houseId;
	}
	public String getTradeId() {
		return tradeId;
	}
	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}
	public String getImageId() {
		return imageId;
	}
	public void setImageId(String imageId) {
		this.imageId = imageId;
	}
	
}
