package com.house.agency.param;

public class ImageQueryParam extends QueryParam {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3300639878931932654L;
	private String tradeId;
	private String foreignId;
	private String userId;
	private String type;
	
	public String getTradeId() {
		return tradeId;
	}
	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}
	public String getForeignId() {
		return foreignId;
	}
	public void setForeignId(String foreignId) {
		this.foreignId = foreignId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
